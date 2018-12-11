import { Component, OnInit } from '@angular/core';
import { PostsService } from '../posts.service';
import { ActivatedRoute, Router } from '@angular/router';
import { mergeMap } from 'rxjs/operators';
import { Subscription } from 'rxjs';

type Recipe = {
  title: string,
  text: string,
  ingredients: string
};

@Component({
  selector: 'app-edit-post-page',
  templateUrl: './edit-post-page.component.html',
  styleUrls: ['./edit-post-page.component.css']
})
export class EditPostPageComponent implements OnInit {

  private recipe: Recipe;
  private subscription: Subscription;

  constructor(private activatedRoute: ActivatedRoute, private postsService: PostsService, private router: Router) {
    this.recipe = {
      title: '',
      text: '',
      ingredients: ''
    };
  }

  ngOnInit() {
    this.subscription = this.activatedRoute.paramMap
      .pipe(mergeMap(paramMap =>
        this.postsService.findByPostNo(paramMap.get('postNo'))))
      .subscribe(recipe => {
        this.recipe = {
          title: recipe.title,
          text: recipe.text,
          ingredients: recipe.ingredients.map(ingredient => ingredient.name).join(', ')
        };
      });
  }

  handleSubmit(form) {
    if (form.valid) {
      this.subscription.unsubscribe();

      this.activatedRoute.paramMap.subscribe(paramMap => {
        const recipe = {
          title: this.recipe.title,
          text: this.recipe.text,
          ingredients: this.recipe.ingredients.split(', ').map(ingredient => ({ name: ingredient }))
        };

        const subscription = this.postsService.save(paramMap.get('id'), recipe)
          .subscribe(() =>
            this.router.navigateByUrl('/home').then(() =>
              subscription.unsubscribe()));
      });
    }
  }
}
