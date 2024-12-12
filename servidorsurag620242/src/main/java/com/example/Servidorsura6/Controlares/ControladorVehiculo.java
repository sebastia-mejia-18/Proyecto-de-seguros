package com.example.Servidorsura6.Controlares;

import com.example.Servidorsura6.Servicios.UsuarioServicio;
import com.example.Servidorsura6.Servicios.VeiculoServicio;
import com.example.Servidorsura6.modelos.Usuario;
import com.example.Servidorsura6.modelos.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/veiculo")
public class ControladorVehiculo {
    @Autowired
    VeiculoServicio veiculoServicio;

    public ResponseEntity<?> guardar(@RequestBody Vehiculo datos) throws Exception {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(veiculoServicio.GuardarVeiculos(datos));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }
    public ResponseEntity<?>bucar()throws Exception{
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(veiculoServicio.buscarVeiculos());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
