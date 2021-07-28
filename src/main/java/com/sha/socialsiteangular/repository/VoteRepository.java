package com.sha.socialsiteangular.repository;

import com.sha.socialsiteangular.model.Post;
import com.sha.socialsiteangular.model.User;
import com.sha.socialsiteangular.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}