package com.civa.apifutbolistas.servicio;

import com.civa.apifutbolistas.modelo.Futbolista;

import java.util.List;

public interface InterfaceFutbolistaServicio {
    public List<Futbolista> listFutbolistas();
    public Futbolista findFutbolistaById(Integer idFutbolista);
}
