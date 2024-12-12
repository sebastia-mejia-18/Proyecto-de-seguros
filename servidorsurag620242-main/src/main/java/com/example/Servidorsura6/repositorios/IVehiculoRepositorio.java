package com.example.Servidorsura6.repositorios;

import com.example.Servidorsura6.modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculoRepositorio extends JpaRepository<Vehiculo, Long> {

}
