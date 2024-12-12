package com.example.Servidorsura6.controladores;

import com.example.Servidorsura6.modelos.Usuario;
import com.example.Servidorsura6.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class ControladorUsuario {

    //Inyectamos el servicio
    @Autowired
    UsuarioServicio usuarioServicio;

    //llamamos al metodo que guarda
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Usuario datos)throws Exception{
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(usuarioServicio.guardarUsuario(datos));
        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    //llamamos al metodo que busca
    public ResponseEntity<?>buscar()throws Exception{
        try{

            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(usuarioServicio.buscarUsuarios());

        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }

    }

}
