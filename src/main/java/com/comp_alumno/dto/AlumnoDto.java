package com.comp_alumno.dto;

public class AlumnoDto {
    private Long id;
    private String nombre;
    private String matricula;

    public AlumnoDto() {}

    public AlumnoDto(Long id, String nombre, String matricula) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
}