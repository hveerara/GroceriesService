package com.neuron.groceries.model;


import javax.persistence.*;

@Entity
@Table(name="grocery")
public class Groceries {
    @Id
    @GeneratedValue
    @Column(name="grocery_id")
    private Integer groceryId;
    @Column(name="grocery_name")
    private String groceryName;
    @Column(name="type_id")
    private Integer typeId;
    @Column(name="store_id")
    private Integer storeId;

    public Integer getGroceryId() {
        return groceryId;
    }

    public void setGroceryId(Integer groceryId) {
        this.groceryId = groceryId;
    }

    public String getGroceryName() {
        return groceryName;
    }

    public void setGroceryName(String groceryName) {
        this.groceryName = groceryName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Groceries() {
    }

    public Groceries(Integer groceryId, String groceryName, Integer typeId, Integer storeId) {
        this.groceryId = groceryId;
        this.groceryName = groceryName;
        this.typeId = typeId;
        this.storeId = storeId;
    }
}
