import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { ApiService } from './api.service';

export type Recipe = {
  id: number,
  title: string,
  text: string,
  ingredients: { name: string }[]
};

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  constructor(private apiService: ApiService) { }

  findAll(): Observable<Recipe[]> {
    return this.apiService.findAll<Recipe[]>('/recipe');
  }

  findAllByPredicate(predicate): Observable<Recipe[]> {
    return this.findAll().pipe(map(x => x.filter(predicate)));
  }

  findByPostNo(id): Observable<Recipe> {
    return this.apiService.findByNo<Recipe>('/recipe', id);
  }

  deleteByPostNo(id): Observable<void> {
    return this.apiService.deleteByNo('/recipe', id);
  }

  save(id, recipe): Observable<Recipe> {
    return this.apiService.putByNo('/recipe', id, recipe);
  }
}
