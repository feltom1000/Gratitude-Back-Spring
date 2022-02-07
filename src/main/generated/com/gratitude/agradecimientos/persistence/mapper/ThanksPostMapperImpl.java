package com.gratitude.agradecimientos.persistence.mapper;

import com.gratitude.agradecimientos.domain.ThanksPost;
import com.gratitude.agradecimientos.persistence.entity.EntradaAgradecimiento;
import com.gratitude.agradecimientos.persistence.entity.EntradaAgradecimientoPK;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-28T13:54:46-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (AdoptOpenJDK)"
)
@Component
public class ThanksPostMapperImpl implements ThanksPostMapper {

    @Override
    public ThanksPost toThanksPost(EntradaAgradecimiento entradaAgradecimiento) {
        if ( entradaAgradecimiento == null ) {
            return null;
        }

        ThanksPost thanksPost = new ThanksPost();

        Integer idAgradecimiento = entradaAgradecimientoIdIdAgradecimiento( entradaAgradecimiento );
        if ( idAgradecimiento != null ) {
            thanksPost.setThanksId( idAgradecimiento );
        }
        Integer idEntrada = entradaAgradecimientoIdIdEntrada( entradaAgradecimiento );
        if ( idEntrada != null ) {
            thanksPost.setPostId( idEntrada );
        }

        return thanksPost;
    }

    @Override
    public EntradaAgradecimiento toEntradaAgradecimiento(ThanksPost thanksPost) {
        if ( thanksPost == null ) {
            return null;
        }

        EntradaAgradecimiento entradaAgradecimiento = new EntradaAgradecimiento();

        entradaAgradecimiento.setId( thanksPostToEntradaAgradecimientoPK( thanksPost ) );

        return entradaAgradecimiento;
    }

    private Integer entradaAgradecimientoIdIdAgradecimiento(EntradaAgradecimiento entradaAgradecimiento) {
        if ( entradaAgradecimiento == null ) {
            return null;
        }
        EntradaAgradecimientoPK id = entradaAgradecimiento.getId();
        if ( id == null ) {
            return null;
        }
        Integer idAgradecimiento = id.getIdAgradecimiento();
        if ( idAgradecimiento == null ) {
            return null;
        }
        return idAgradecimiento;
    }

    private Integer entradaAgradecimientoIdIdEntrada(EntradaAgradecimiento entradaAgradecimiento) {
        if ( entradaAgradecimiento == null ) {
            return null;
        }
        EntradaAgradecimientoPK id = entradaAgradecimiento.getId();
        if ( id == null ) {
            return null;
        }
        Integer idEntrada = id.getIdEntrada();
        if ( idEntrada == null ) {
            return null;
        }
        return idEntrada;
    }

    protected EntradaAgradecimientoPK thanksPostToEntradaAgradecimientoPK(ThanksPost thanksPost) {
        if ( thanksPost == null ) {
            return null;
        }

        EntradaAgradecimientoPK entradaAgradecimientoPK = new EntradaAgradecimientoPK();

        entradaAgradecimientoPK.setIdAgradecimiento( thanksPost.getThanksId() );
        entradaAgradecimientoPK.setIdEntrada( thanksPost.getPostId() );

        return entradaAgradecimientoPK;
    }
}
