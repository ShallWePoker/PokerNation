package server.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String passcode;

    public User() {}

    public User(Long id, String name, String email, String passcode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passcode = passcode;
    }
}
