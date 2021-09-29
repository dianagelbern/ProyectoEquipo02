package com.salesianostriana.equipo.ejercicio04.ejercicio02;

import org.springframework.stereotype.Component;

@Component
public class ProductoDtoConverter {

    public Producto createProductoDtotoProducto(CreateProductoDto p){

        return new Producto(
                p.getNombre(),
                p.getDescuento(),
                p.getPvp(),
                p.getImagenes()
        );
    }

    public GetProductoDto productoToGetProductoDto(Producto p){

        return GetProductoDto
                .builder()
                .nombre(p.getNombre())
                .pvp(p.getPvp())
                .imagenes(p.getImagenes())
                .build();
    }
}
