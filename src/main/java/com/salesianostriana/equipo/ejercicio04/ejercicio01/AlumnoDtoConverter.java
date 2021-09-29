package com.salesianostriana.equipo.ejercicio04.ejercicio01;

import org.springframework.stereotype.Component;

@Component
public class AlumnoDtoConverter {

    public Alumno cretaeAlumnoDtoToAlumno(CreateAlumnoDTO c){
        return new Alumno(
                c.getNombre(),
                c.getApellido1(),
                c.getApellido2(),
                c.getTelefono(),
                c.getEmail()
        );
    }


    public GetAlumnoDto alumnoToGetAlumnoDto(Alumno a){
        GetAlumnoDto result = new GetAlumnoDto();
        result.setNombre(a.getNombre());
        result.setApellidos(String.format("%s %s",a.getApellido1(),a.getApellido2()));
        result.setEmail(a.getEmail());
        result.setDireccion(a.getDireccion().getTipoVia());
        result.setCurso(a.getCurso().getNombre());
        return result;
    }
}
