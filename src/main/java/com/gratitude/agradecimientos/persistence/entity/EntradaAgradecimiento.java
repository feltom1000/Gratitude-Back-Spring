package com.gratitude.agradecimientos.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "entradas_agradecimiento")
public class EntradaAgradecimiento {

    @EmbeddedId
    private EntradaAgradecimientoPK id;

    @ManyToOne
    @MapsId("idEntrada")
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
