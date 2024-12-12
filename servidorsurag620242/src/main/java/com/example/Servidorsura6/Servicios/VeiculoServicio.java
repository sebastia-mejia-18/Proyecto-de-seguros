package com.example.Servidorsura6.Servicios;

import com.example.Servidorsura6.Repositorios.IVeiculoRepositorio;
import com.example.Servidorsura6.modelos.Usuario;
import com.example.Servidorsura6.modelos.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoServicio {
    @Autowired
    IVeiculoRepositorio iVeiculoRepositorio;

    public Vehiculo GuardarVeiculos(Vehiculo DatosVeiculos) throws Exception{
        try {
            return iVeiculoRepositorio.save(DatosVeiculos);

        }catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Vehiculo> buscarVeiculos() throws Exception {
        try {
            return iVeiculoRepositorio.findAll();

        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }
    }
}
