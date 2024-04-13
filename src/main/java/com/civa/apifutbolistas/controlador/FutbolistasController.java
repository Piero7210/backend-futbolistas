package com.civa.apifutbolistas.controlador;


import com.civa.apifutbolistas.modelo.Futbolista;
import com.civa.apifutbolistas.servicio.FutbolistaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("futbol-api")
public class FutbolistasController {

    @Autowired
    private FutbolistaServicio futbolistaServicio;

    //http://localhost:8080/futbol-api/futbolistas
    @GetMapping("/futbolistas")
    public List<Futbolista> getFutbolistas() {
        List<Futbolista> futbolistas = this.futbolistaServicio.listFutbolistas();
        return futbolistas;
    }

    //http://localhost:8080/futbol-api/futbolistas/idFutbolista
    @GetMapping("/futbolistas/{idFutbolista}")
    public ResponseEntity<Futbolista> getFutbolistaById(@PathVariable Integer idFutbolista) {
        Futbolista futbolistaEncontrado = this.futbolistaServicio.findFutbolistaById(idFutbolista);
        if (futbolistaEncontrado == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(futbolistaEncontrado);
        }
    }
}
