import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PostsService, Recipe } from '../posts.service';
import { Observable } from 'rxjs';
import { mergeMap } from 'rxjs/operators';

@Component({
  selector: 'app-confirm-post-deletion-page',
  templateUrl: './confirm-post-deletion-page.component.html',
  styleUrls: ['./confirm-post-deletion-page.component.css']
})
export class ConfirmPostDeletionPageComponent implements OnInit {

  private recipe: Observable<Recipe>;

  constructor(private activatedRoute: ActivatedRoute, private postsService: PostsService, private router: Router) { }

  ngOnInit() {
    this.recipe = this.activatedRoute.paramMap
      .pipe(mergeMap(paramMap =>
        this.postsService.findByPostNo(paramMap.get('id'))));
  }

  confirm(id) {
    const subscription = this.postsService.deleteByPostNo(id)
      .subscribe(() =>
        this.router.navigateByUrl('/home').then(() =>
          subscription.unsubscribe()));
  }
}
