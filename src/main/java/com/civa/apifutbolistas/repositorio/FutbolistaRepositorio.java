package com.civa.apifutbolistas.repositorio;


import com.civa.apifutbolistas.modelo.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FutbolistaRepositorio extends JpaRepository<Futbolista, Integer> {
}
