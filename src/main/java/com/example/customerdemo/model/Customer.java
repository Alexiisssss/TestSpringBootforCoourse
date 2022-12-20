package com.example.customerdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity {
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "address")
    private String address;
    @Column(name = "budget")
    private BigDecimal budget;

}
