package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "theatre")
public class Theatre {

    @Id
    @Column(name="theatre_id", nullable = false)
    @JsonProperty("theatre_id")
    private int threatreId;

    @Column(name="theatre_name", nullable = false)
    @JsonProperty("theatre_name")
    private String theatreName;

    @Column(name="address", nullable = false)
    @JsonProperty("address")
    private String address;

    @Column(name="city", nullable = false)
    @JsonProperty("city")
    private String city;

    public Theatre(int threatreId, String theatreName, String address, String city) {
        this.threatreId = threatreId;
        this.theatreName = theatreName;
        this.address = address;
        this.city = city;
    }

    public Theatre() {
    }


    public int getThreatreId() {
        return threatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}
