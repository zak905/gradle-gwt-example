package com.example;


import jsinterop.annotations.JsType;

@JsType
public class Car {

    String id;

    String brand;

    String model;

    public Car(String id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }
}
