import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { PostsService, Recipe } from '../posts.service';
import { Observable } from 'rxjs';
import { mergeMap } from 'rxjs/operators';

@Component({
  selector: 'app-post-list-by-tag',
  templateUrl: './post-list-by-tag.component.html',
  styleUrls: ['./post-list-by-tag.component.css']
})
export class PostListByTagComponent implements OnInit {

  private recipes: Observable<Recipe[]>;

  constructor(private activatedRoute: ActivatedRoute, private postsService: PostsService) { }

  ngOnInit() {
    this.recipes = this.activatedRoute.paramMap
      .pipe(mergeMap(paramMap =>
        this.postsService.findAllByPredicate(function (recipe) {
          return recipe.ingredients.some(ingredient => ingredient.name === paramMap.get('ingredient'));
        })));
  }
}
