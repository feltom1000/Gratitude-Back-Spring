package com.gratitude.agradecimientos.persistence.mapper;

import com.gratitude.agradecimientos.domain.Thanks;
import com.gratitude.agradecimientos.persistence.entity.Agradecimiento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-25T12:35:09-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (AdoptOpenJDK)"
)
@Component
public class ThanksMapperImpl implements ThanksMapper {

    @Override
    public Thanks toThanks(Agradecimiento agradecimiento) {
        if ( agradecimiento == null ) {
            return null;
        }

        Thanks thanks = new Thanks();

        thanks.setDescription( agradecimiento.getDescripcion() );
        if ( agradecimiento.getId() != null ) {
            thanks.setId( agradecimiento.getId() );
        }

        return thanks;
    }

    @Override
    public List<Thanks> toManyThanks(List<Agradecimiento> agradecimientos) {
        if ( agradecimientos == null ) {
            return null;
        }

        List<Thanks> list = new ArrayList<Thanks>( agradecimientos.size() );
        for ( Agradecimiento agradecimiento : agradecimientos ) {
            list.add( toThanks( agradecimiento ) );
        }

        return list;
    }

    @Override
    public Agradecimiento toAgradecimiento(Thanks thanks) {
        if ( thanks == null ) {
            return null;
        }

        Agradecimiento agradecimiento = new Agradecimiento();

        agradecimiento.setDescripcion( thanks.getDescription() );
        agradecimiento.setId( thanks.getId() );

        return agradecimiento;
    }
}
