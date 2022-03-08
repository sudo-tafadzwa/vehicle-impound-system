package com.css.io.vehicleimpoundsystem.Owner;

import com.css.io.vehicleimpoundsystem.Impound.Impound;
import com.css.io.vehicleimpoundsystem.Vehicle.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String full_name;
    private String id_number;
    private GENDER gender;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Vehicle> vehicle;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Impound impound;








}
