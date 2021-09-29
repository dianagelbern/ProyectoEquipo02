package Ejercicio02;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    @ManyToMany
    private Categoria categoria;

    public Producto(String nombre, int descuento, double pvp, List<String> imagenes) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.pvp = pvp;
        this.imagenes = imagenes;
    }
}
