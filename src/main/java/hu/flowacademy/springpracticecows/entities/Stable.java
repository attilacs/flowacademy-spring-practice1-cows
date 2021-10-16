package hu.flowacademy.springpracticecows.entities;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stables")
@Data
public class Stable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Getter
    private String address;

    @OneToMany(mappedBy = "stable", cascade = CascadeType.ALL)
    private List<Cow> cows;
}
