package com.example.Servidorsura6.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Mapeo de la clave primaria

    @Column(name = "placa", nullable = false, length = 50) // Asigna un nombre único para esta columna
    private String placa;
    private String modelo;
    private String marca;
    private String cilindraje;
    private String color;
    private String descripcion;

    @Column(name = "numeros_siniestros") // Usa snake_case si esto coincide con la columna en la base de datos
    private int numerosSiniestros;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(Long id, String placa, String modelo, String marca, String cilindraje, String color, String descripcion, int numerosSiniestros) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.color = color;
        this.descripcion = descripcion;
        this.numerosSiniestros = numerosSiniestros;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumerosSiniestros() {
        return numerosSiniestros;
    }

    public void setNumerosSiniestros(int numerosSiniestros) {
        this.numerosSiniestros = numerosSiniestros;
    }
}
