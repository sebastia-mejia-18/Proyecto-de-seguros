package com.example.Servidorsura6.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @Column(name = "ID", nullable = false, length = 50)
    private String ID;
    private String Placa;
    private String Modelo;
    private String Marca;
    private String Cilindraje;
    private String Color;

    private String Descripcion;
    private  int NumerosSiniestros;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    private Usuario usuario;


    public Vehiculo(){

    }


    public Vehiculo(String ID, String placa, String modelo, String marca, String cilindraje, String color, String descripcion, int numerosSiniestros) {
        this.ID = ID;
        Placa = placa;
        Modelo = modelo;
        Marca = marca;
        Cilindraje = cilindraje;
        Color = color;
        Descripcion = descripcion;
        NumerosSiniestros = numerosSiniestros;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        Cilindraje = cilindraje;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getNumerosSiniestros() {
        return NumerosSiniestros;
    }

    public void setNumerosSiniestros(int numerosSiniestros) {
        NumerosSiniestros = numerosSiniestros;
    }
}
