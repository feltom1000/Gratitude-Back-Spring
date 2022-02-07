package com.gratitude.agradecimientos.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EntradaAgradecimientoPK implements Serializable {
    @Column(name = "id_entrada")
    private Integer idEntrada;

    @Column(name = "id_agradecimiento")
    private Integer idAgradecimiento;

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Integer getIdAgradecimiento() {
        return idAgradecimiento;
    }

    public void setIdAgradecimiento(Integer idAgradecimiento) {
        this.idAgradecimiento = idAgradecimiento;
    }
}
