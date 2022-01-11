package ru.mtuci.fooddeliveryapi.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OrderInfo extends AbstractBaseEntity{
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private String phone;
    @NotBlank
    private String city;
    @NotBlank
    private String street;
    @NotBlank
    private Integer home;
    @NotBlank
    private Integer flat;
    @NotBlank
    private Integer floor;

    public OrderInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
