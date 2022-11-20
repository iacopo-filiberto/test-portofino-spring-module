package com.example.db.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class Cars implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, insertable = false, updatable = false)
    public Long id;

    public String name;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
