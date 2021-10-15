package hu.flowacademy.springpracticecows.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cows")
@Data
public class Cow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String sid;

    @Column(nullable = false)
    private Integer age;
}
