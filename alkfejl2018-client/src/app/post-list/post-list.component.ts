import { Component, Input } from '@angular/core';
import { Observable } from 'rxjs';

import { Recipe } from '../posts.service';

@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.css']
})
export class PostListComponent {

  @Input() private recipes: Observable<Recipe[]>;
}
