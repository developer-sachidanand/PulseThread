import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { PostModel } from '../shared/post-model';
import { PostService } from '../shared/post.service';

@Component({
  selector: 'app-home',
  standalone: false,
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  posts: Array<PostModel> = [];

  constructor(private postService: PostService, private changeDetectorRef: ChangeDetectorRef) {
  }

  ngOnInit(): void {
    this.postService.getAllPosts().subscribe({
      next: post => {
      this.posts = post;
      this.changeDetectorRef.detectChanges();
      },
      error: error => console.error('Unable to load posts', error)
    });
  }

}
