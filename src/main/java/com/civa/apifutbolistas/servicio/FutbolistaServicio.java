package com.civa.apifutbolistas.servicio;

import com.civa.apifutbolistas.modelo.Futbolista;
import com.civa.apifutbolistas.repositorio.FutbolistaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbolistaServicio implements InterfaceFutbolistaServicio{

    @Autowired
    private FutbolistaRepositorio futbolistaRepositorio;

    @Override
    public List<Futbolista> listFutbolistas() {
        return this.futbolistaRepositorio.findAll();
    }

    @Override
    public Futbolista findFutbolistaById(Integer idFutbolista) {
        Futbolista futbolista = this.futbolistaRepositorio.findById(idFutbolista).orElse(null);
        return futbolista;
    }
}
