package com.sachidanand.pulsethread.repository;

import com.sachidanand.pulsethread.model.Post;
import com.sachidanand.pulsethread.model.Subreddit;
import com.sachidanand.pulsethread.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
