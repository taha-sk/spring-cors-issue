import { Component, OnInit } from '@angular/core';
import { Repository } from 'src/types/Repository';
import { Resource } from 'src/types/Resource';
import { SpringService } from './spring.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'cors-angular';

  resource: Resource | undefined;
  repository: Repository | undefined;

  constructor(
    private springService: SpringService,
  ) { }

  ngOnInit(): void {
    this.springService.getResource().subscribe((data:Resource) => this.resource = data);
    this.springService.getWidgets().subscribe((data:Repository) => this.repository = data);
  }

}
