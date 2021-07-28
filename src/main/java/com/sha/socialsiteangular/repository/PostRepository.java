package com.sha.socialsiteangular.repository;

import com.sha.socialsiteangular.model.Post;
import com.sha.socialsiteangular.model.Subreddit;
import com.sha.socialsiteangular.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
