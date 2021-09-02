package com.greenblat.GreenblatBlog.repo;

import com.greenblat.GreenblatBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
