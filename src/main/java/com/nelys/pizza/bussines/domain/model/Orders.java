package com.nelys.pizza.bussines.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Column(name = "client_name", length = 50)
    private String clientName;

    @Size(max = 10)
    @Column(name = "client_number", length = 10)
    private String clientNumber;

    @Size(max = 200)
    @Column(name = "address", length = 200)
    private String address;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "notes")
    private String notes;

    @Column(name = "total", precision = 10, scale = 2)
    private BigDecimal total;
}
