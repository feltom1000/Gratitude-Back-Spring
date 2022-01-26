package com.gratitude.agradecimientos.domain.service;

import com.gratitude.agradecimientos.domain.Post;
import com.gratitude.agradecimientos.domain.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAll(){
        return postRepository.getAll();
    }

    public Optional<Post> getPost(int postId){
        return postRepository.getPost(postId);
    }

    public Post save(Post post){
        return postRepository.save(post);
    }
}
