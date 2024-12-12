package com.example.Servidorsura6.servicios;

import com.example.Servidorsura6.modelos.Vehiculo;
import com.example.Servidorsura6.repositorios.IVehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServicio {

    @Autowired
    private IVehiculoRepositorio iVehiculoRepositorio;

    public Vehiculo guardarVehiculo(Vehiculo datosVehiculo) throws Exception {
        try {
            return iVehiculoRepositorio.save(datosVehiculo);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }


    public List<Vehiculo> buscarVehiculos() throws Exception {
        try {
            return iVehiculoRepositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }


    public Vehiculo actualizarVehiculo(Long id, Vehiculo datosVehiculo) throws Exception {
        try {
            Optional<Vehiculo> vehiculoExistente = iVehiculoRepositorio.findById(id);
            if (!vehiculoExistente.isPresent()) {
                throw new Exception("Vehículo con id " + id + " no encontrado.");
            }

            // Actualizar los campos del vehículo
            Vehiculo vehiculo = vehiculoExistente.get();
            vehiculo.setPlaca(datosVehiculo.getPlaca());
            vehiculo.setMarca(datosVehiculo.getMarca());
            vehiculo.setCilindraje(datosVehiculo.getCilindraje());
            vehiculo.setModelo(datosVehiculo.getModelo());
            vehiculo.setColor(datosVehiculo.getColor());
            vehiculo.setDescripcion(datosVehiculo.getDescripcion());
            // Agrega aquí cualquier otro campo que desees actualizar

            return iVehiculoRepositorio.save(vehiculo);
        } catch (Exception error) {
            throw new Exception("Error al actualizar el vehículo: " + error.getMessage());
        }
    }


    public void eliminarVehiculo(Long id) throws Exception {
        try {
            // Verificar si el vehículo existe
            Optional<Vehiculo> vehiculoExistente = iVehiculoRepositorio.findById(id);
            if (!vehiculoExistente.isPresent()) {
                throw new Exception("Vehículo con id " + id + " no encontrado.");
            }

            // Eliminar el vehículo
            iVehiculoRepositorio.deleteById(id);
        } catch (Exception error) {
            throw new Exception("Error al eliminar el vehículo: " + error.getMessage());
        }
    }
}
