package com.andrushenko.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tv")
public class TV extends Product {
    @Id
    @Column(unique = true, nullable = false)
    private int id;
    @Column(nullable = false)
    private double diagonal;
    @Column(nullable = false)
    private int bright;
    @Column(nullable = false)
    private double countOfColors;

    public TV() {
    }

    public TV(int id, String name, BigDecimal cost, int count, ProductStatus productStatus, ProductManufacture productManufacture,
              ProductCategory productCategory, int id1, double diagonal, int bright, double countOfColors) {
        super(id, name, cost, count, productStatus, productManufacture, productCategory);
        this.id = id1;
        this.diagonal = diagonal;
        this.bright = bright;
        this.countOfColors = countOfColors;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getBright() {
        return bright;
    }

    public void setBright(int bright) {
        this.bright = bright;
    }

    public double getCountOfColors() {
        return countOfColors;
    }

    public void setCountOfColors(double countOfColors) {
        this.countOfColors = countOfColors;
    }
}
