package com.gratitude.agradecimientos.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "entrada_agradecimiento")
public class EntradaAgradecimiento {

    @EmbeddedId
    private EntradaAgradecimientoPK id;

    @ManyToOne
    @JoinColumn(name = "id_entrada", insertable = false, updatable = false)
    private Entrada entrada;

    @ManyToOne
    @JoinColumn(name = "id_agradecimiento", insertable = false, updatable = false)
    private Agradecimiento agradecimiento;

    public EntradaAgradecimientoPK getId() {
        return id;
    }

    public void setId(EntradaAgradecimientoPK id) {
        this.id = id;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Agradecimiento getAgradecimiento() {
        return agradecimiento;
    }

    public void setAgradecimiento(Agradecimiento agradecimiento) {
        this.agradecimiento = agradecimiento;
    }
}