package com.dev.restfulwebservice.jpa;

import com.dev.restfulwebservice.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
