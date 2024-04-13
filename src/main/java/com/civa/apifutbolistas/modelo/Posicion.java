package com.civa.apifutbolistas.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "posiciones")
public class Posicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String namePosicion;
}
