package com.nelys.pizza.bussines.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "size")
@Data

public class Sise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size (max = 50)
    @Column(name = "name", length = 50)
    private String name;

}
