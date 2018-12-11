import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { Recipe, PostsService } from '../posts.service';
import { mergeMap } from 'rxjs/operators';

@Component({
  selector: 'app-search-results-page',
  templateUrl: './search-results-page.component.html',
  styleUrls: ['./search-results-page.component.css']
})
export class SearchResultsPageComponent implements OnInit {

  private recipes: Observable<Recipe[]>;

  constructor(private activatedRoute: ActivatedRoute, private postsService: PostsService) { }

  ngOnInit() {
    this.recipes = this.activatedRoute.paramMap
      .pipe(mergeMap(paramMap =>
        this.postsService.findAllByPredicate(function (recipe) {
          const keywords = paramMap.get('keywords').split(/\s/g);

          return keywords.some(keyword => recipe.title.includes(keyword) || recipe.text.includes(keyword));
        })));
  }

}
