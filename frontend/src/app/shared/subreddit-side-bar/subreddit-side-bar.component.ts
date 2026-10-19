import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { SubredditService } from 'src/app/subreddit/subreddit.service';
import { SubredditModel } from 'src/app/subreddit/subreddit-response';

@Component({
  selector: 'app-subreddit-side-bar',
  standalone: false,
  templateUrl: './subreddit-side-bar.component.html',
  styleUrls: ['./subreddit-side-bar.component.css']
})
export class SubredditSideBarComponent implements OnInit {
  subreddits: Array<SubredditModel> = [];
  displayViewAll: boolean;

  constructor(private subredditService: SubredditService, private changeDetectorRef: ChangeDetectorRef) {
  }

  ngOnInit(): void {
    this.subredditService.getAllSubreddits().subscribe({
      next: data => {
        this.subreddits = data.length > 3 ? data.slice(0, 3) : data;
        this.displayViewAll = data.length > 3;
        this.changeDetectorRef.detectChanges();
      },
      error: error => console.error('Unable to load subreddits', error)
    });
  }

}
