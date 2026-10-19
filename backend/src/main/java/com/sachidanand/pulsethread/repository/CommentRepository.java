package com.sachidanand.pulsethread.repository;

import com.sachidanand.pulsethread.model.Comment;
import com.sachidanand.pulsethread.model.Post;
import com.sachidanand.pulsethread.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
