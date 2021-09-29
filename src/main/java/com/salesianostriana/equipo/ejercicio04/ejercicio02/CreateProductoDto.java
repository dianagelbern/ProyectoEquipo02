package com.salesianostriana.equipo.ejercicio04.ejercicio02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductoDto {

    private String nombre;
    private int descuento;
    private double pvp;
    private List<String> imagenes;
    private Categoria categoria;
}
