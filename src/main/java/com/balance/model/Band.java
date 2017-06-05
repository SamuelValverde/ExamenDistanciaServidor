package com.balance.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by da_20 on 31/5/2017.
 */
@Entity
public class Band {
    private Long id;

    private Integer steps;
    private Date fecha_registro;
    private Integer user;

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public Date getFecha_registro() {
        if (fecha_registro == null) {
            return new Date();
        }
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        if (fecha_registro != null) {
            this.fecha_registro = fecha_registro;
        }
    }
}
