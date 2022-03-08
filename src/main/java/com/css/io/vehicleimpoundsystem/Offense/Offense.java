package com.css.io.vehicleimpoundsystem.Offense;

import com.css.io.vehicleimpoundsystem.Impound.Impound;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String offense;
    private Double penalty;



    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Impound> impound;


}
