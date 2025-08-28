package com.nelys.pizza.bussines.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="area")
@Data

public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
