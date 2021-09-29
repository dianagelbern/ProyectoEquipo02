package com.salesianostriana.equipo.ejercicio04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAlumnoDTO {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private Long cursoId;
    private Long direccionId;
}
