import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { PostsService } from '../posts.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  private recipes: Observable<any>;

  constructor(private postsService: PostsService) { }

  ngOnInit() {
    this.recipes = this.postsService.findAll();
  }

}
