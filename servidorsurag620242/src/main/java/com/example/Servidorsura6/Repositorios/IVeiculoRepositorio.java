package com.example.Servidorsura6.Repositorios;

import com.example.Servidorsura6.modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVeiculoRepositorio extends JpaRepository<Vehiculo,Long> {
}
