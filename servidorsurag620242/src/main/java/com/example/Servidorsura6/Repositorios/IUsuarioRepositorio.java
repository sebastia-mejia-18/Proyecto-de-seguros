package com.example.Servidorsura6.Repositorios;

import com.example.Servidorsura6.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario,Long> {
}
