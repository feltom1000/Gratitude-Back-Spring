package com.gratitude.agradecimientos.persistence.mapper;

import com.gratitude.agradecimientos.domain.Post;
import com.gratitude.agradecimientos.domain.ThanksPost;
import com.gratitude.agradecimientos.persistence.entity.Entrada;
import com.gratitude.agradecimientos.persistence.entity.EntradaAgradecimiento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-28T13:54:45-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (AdoptOpenJDK)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Autowired
    private ThanksPostMapper thanksPostMapper;

    @Override
    public Post toPost(Entrada entrada) {
        if ( entrada == null ) {
            return null;
        }

        Post post = new Post();

        if ( entrada.getIdEntrada() != null ) {
            post.setPostId( entrada.getIdEntrada() );
        }
        if ( entrada.getIdUsuario() != null ) {
            post.setUserId( entrada.getIdUsuario() );
        }
        post.setDate( entrada.getFecha() );
        post.setThanksList( entradaAgradecimientoListToThanksPostList( entrada.getAgradecimientos() ) );

        return post;
    }

    @Override
    public List<Post> toPosts(List<Entrada> entradas) {
        if ( entradas == null ) {
            return null;
        }

        List<Post> list = new ArrayList<Post>( entradas.size() );
        for ( Entrada entrada : entradas ) {
            list.add( toPost( entrada ) );
        }

        return list;
    }

    @Override
    public Entrada toEntrada(Post post) {
        if ( post == null ) {
            return null;
        }

        Entrada entrada = new Entrada();

        entrada.setIdEntrada( post.getPostId() );
        entrada.setIdUsuario( post.getUserId() );
        entrada.setFecha( post.getDate() );
        entrada.setAgradecimientos( thanksPostListToEntradaAgradecimientoList( post.getThanksList() ) );

        return entrada;
    }

    protected List<ThanksPost> entradaAgradecimientoListToThanksPostList(List<EntradaAgradecimiento> list) {
        if ( list == null ) {
            return null;
        }

        List<ThanksPost> list1 = new ArrayList<ThanksPost>( list.size() );
        for ( EntradaAgradecimiento entradaAgradecimiento : list ) {
            list1.add( thanksPostMapper.toThanksPost( entradaAgradecimiento ) );
        }

        return list1;
    }

    protected List<EntradaAgradecimiento> thanksPostListToEntradaAgradecimientoList(List<ThanksPost> list) {
        if ( list == null ) {
            return null;
        }

        List<EntradaAgradecimiento> list1 = new ArrayList<EntradaAgradecimiento>( list.size() );
        for ( ThanksPost thanksPost : list ) {
            list1.add( thanksPostMapper.toEntradaAgradecimiento( thanksPost ) );
        }

        return list1;
    }
}
