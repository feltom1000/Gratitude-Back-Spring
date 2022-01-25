package com.gratitude.agradecimientos.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "entrada")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private Integer idEntrada;

    @Column(name = "id_user")
    private Integer idUsuario;

    private Date fecha;

//    @Column(name = "id_agradecimientos")
//    private Integer idAgradecimientos;

    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private Usuario user;

    @OneToMany(mappedBy = "entrada", cascade = {CascadeType.ALL})
    private List<EntradaAgradecimiento> agradecimientos;

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<EntradaAgradecimiento> getAgradecimientos() {
        return agradecimientos;
    }

    public void setAgradecimientos(List<EntradaAgradecimiento> agradecimientos) {
        this.agradecimientos = agradecimientos;
    }
}
