package com.sachidanand.pulsethread.repository;

import com.sachidanand.pulsethread.model.Post;
import com.sachidanand.pulsethread.model.User;
import com.sachidanand.pulsethread.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
