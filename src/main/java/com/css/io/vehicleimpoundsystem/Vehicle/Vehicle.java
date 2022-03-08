package com.css.io.vehicleimpoundsystem.Vehicle;

import com.css.io.vehicleimpoundsystem.Impound.Impound;
import com.css.io.vehicleimpoundsystem.Owner.Owner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String model;
    private String color;
    private String number_plate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "owner_id", nullable=false)
    private Owner owner;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Impound> impound;



}
