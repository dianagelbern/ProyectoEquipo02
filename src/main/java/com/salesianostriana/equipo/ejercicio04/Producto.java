package com.salesianostriana.equipo.ejercicio04;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private Long id;


    private String nombre;
    private int descuento;
    private double pvp;

    @ElementCollection
    private List<String> imagenes;

    @ManyToOne
    private Categoria categoria;

    public Producto(Long id, String nombre, int descuento, double pvp, String imagenes) {
        this.id = id;
        this.nombre = nombre;
        this.descuento = descuento;
        this.pvp = pvp;
        this.imagenes = Collections.singletonList(imagenes);
    }

}
