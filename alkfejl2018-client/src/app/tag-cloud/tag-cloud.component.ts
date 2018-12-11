import { Component, OnInit } from '@angular/core';
import { PostsService } from '../posts.service';
import { map, concatMap, reduce } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-tag-cloud',
  templateUrl: './tag-cloud.component.html',
  styleUrls: ['./tag-cloud.component.css']
})
export class TagCloudComponent implements OnInit {

  private ingredients: Observable<Set<string>>;

  constructor(private postService: PostsService) { }

  ngOnInit() {
    this.ingredients = this.postService.findAll()
      .pipe(map(recipes =>
        recipes.reduce((ingredients, recipe) =>
          recipe.ingredients.reduce((ingredients, ingredient) =>
            ingredients.add(ingredient), ingredients), new Set())));
  }
}
