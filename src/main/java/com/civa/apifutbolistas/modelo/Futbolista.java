package com.civa.apifutbolistas.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "futbolistas")
public class Futbolista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idFutbolista;
    String name;
    String lastname;
    //yyyy-MM-dd
    Date birthdate;
    String features;
    @ManyToOne
    @JoinColumn(name = "posicion_id")
    Posicion position;

}
