package com.comp_alumno.controller;

import com.comp_alumno.dto.AlumnoDto;
import com.comp_alumno.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public Mono<AlumnoDto> getAlumno(@RequestHeader("flow") String flow) {
        return alumnoService.obtenerAlumno(flow);
    }
}