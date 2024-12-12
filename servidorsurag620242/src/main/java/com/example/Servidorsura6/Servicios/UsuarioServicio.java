package com.example.Servidorsura6.Servicios;
import com.example.Servidorsura6.Repositorios.IUsuarioRepositorio;
import com.example.Servidorsura6.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {
    @Autowired
    IUsuarioRepositorio iUsuarioRepositorio;

    public Usuario GuardarUsuario(Usuario datosUsuario) throws Exception {
        try {
            return iUsuarioRepositorio.save(datosUsuario);

        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }

    }

    public List<Usuario> buscarUsuarios() throws Exception {
        try {
            return iUsuarioRepositorio.findAll();

        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }
    }

    public Usuario buscarUsuarioId(Long id) throws Exception {
        try {
            Optional<Usuario> usuarioEncontrado = iUsuarioRepositorio.findById(id);
            if (usuarioEncontrado.isPresent()) {
                return usuarioEncontrado.get();

            } else {
                throw new Exception("usuario no encontrado");
            }


        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}