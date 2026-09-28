package com.comp_alumno.service;

import com.comp_alumno.dto.AlumnoDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AlumnoService {

    private final WebClient webClient;

    @Value("${url.base.alumno}")
    private String urlBaseAlumno;

    public AlumnoService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public Mono<AlumnoDto> obtenerAlumno(String flow) {
        return this.webClient.get()
                .uri(urlBaseAlumno)
                .header("flow", flow)
                .retrieve()
                .bodyToMono(AlumnoDto.class);
    }
}