package com.nelys.pizza.bussines.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="are")
@Data

public class AreaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
