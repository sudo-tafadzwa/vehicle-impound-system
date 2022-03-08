package com.css.io.vehicleimpoundsystem.Impound;

import com.css.io.vehicleimpoundsystem.Offense.Offense;
import com.css.io.vehicleimpoundsystem.Owner.Owner;
import com.css.io.vehicleimpoundsystem.Vehicle.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Impound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Owner owner;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Vehicle> vehicle;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Offense> offense;

    private Date releaseDate;



}
