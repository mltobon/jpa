package co.edu.cue.jpa.domain.entities;

import co.edu.cue.jpa.domain.enums.Audience;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double duration;
    @Enumerated(EnumType.STRING)
    private Audience audience;
}
