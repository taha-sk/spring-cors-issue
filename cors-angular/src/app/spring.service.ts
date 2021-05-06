import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Repository } from 'src/types/Repository';
import { Resource } from 'src/types/Resource';

@Injectable({
  providedIn: 'root'
})
export class SpringService {

  constructor(
    private http: HttpClient
  ) { }

  getResource(){
    return this.http.get<Resource>("http://localhost:8080/resource");
  }

  getWidgets(){
    return this.http.get<Repository>("http://localhost:8080/widgets");
  }

}
