package Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity


@Table(name = "NewTable")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
