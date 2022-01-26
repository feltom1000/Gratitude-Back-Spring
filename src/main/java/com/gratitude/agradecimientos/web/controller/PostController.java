package com.gratitude.agradecimientos.web.controller;

import com.gratitude.agradecimientos.domain.Post;
import com.gratitude.agradecimientos.domain.Thanks;
import com.gratitude.agradecimientos.domain.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public ResponseEntity<List<Post>> getAll(){
        return new ResponseEntity<>(postService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Post>> getPost(@PathVariable("id") int postId) {
        if (postService.getPost(postId).isPresent()) {
            return new ResponseEntity<>(postService.getPost(postId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Post> save(Post post){
        return new ResponseEntity<>(postService.save(post), HttpStatus.CREATED);
    }
}
