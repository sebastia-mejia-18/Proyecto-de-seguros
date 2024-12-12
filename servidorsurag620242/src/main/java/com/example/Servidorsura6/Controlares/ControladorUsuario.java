package com.example.Servidorsura6.Controlares;

import com.example.Servidorsura6.Servicios.UsuarioServicio;
import com.example.Servidorsura6.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
public class ControladorUsuario {
    @Autowired
    UsuarioServicio usuarioServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Usuario datos) throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(usuarioServicio.GuardarUsuario(datos));


        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }

    @GetMapping
    public ResponseEntity<?> bucar() throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(usuarioServicio.buscarUsuarios());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(usuarioServicio.buscarUsuarioId(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
