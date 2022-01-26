package com.gratitude.agradecimientos.persistence;

import com.gratitude.agradecimientos.domain.Post;
import com.gratitude.agradecimientos.domain.repository.PostRepository;
import com.gratitude.agradecimientos.persistence.crud.EntradaCRUDRespository;
import com.gratitude.agradecimientos.persistence.entity.Entrada;
import com.gratitude.agradecimientos.persistence.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EntradaRepository implements PostRepository {
    @Autowired
    private EntradaCRUDRespository entradaCRUDRespository;
    @Autowired
    private PostMapper mapper;


    @Override
    public List<Post> getAll() {
        return mapper.toPosts((List<Entrada>) entradaCRUDRespository.findAll());
    }

    @Override
    public Optional<Post> getPost(int postId) {
        return Optional.empty();
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public void delete(int postId) {

    }
}
