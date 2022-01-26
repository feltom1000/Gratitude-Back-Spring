package com.gratitude.agradecimientos.domain.repository;

import com.gratitude.agradecimientos.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    List<Post> getAll();
    Optional<Post> getPost(int postId);
    Post save(Post post);
    void delete(int postId);
}
