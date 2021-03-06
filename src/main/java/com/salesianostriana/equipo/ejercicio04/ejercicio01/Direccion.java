package com.salesianostriana.equipo.ejercicio04.ejercicio01;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Direccion {

    @Id
    @GeneratedValue
    private Long id;

    private String tipoVia;
    private String linea1;
    private String linea2;
    private Integer cp;
    private Integer poblacion;
    private String provincia;

}

