package com.dataprocessing.farmdata.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CabbageFarm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double humidity;
    private double temperature;
    private double soilAcidity;
    private double lightIntensity;
    private String date;

    public CabbageFarm() {
        //default constructor
    }

    public CabbageFarm(double humidity, double temperature, double soilAcidity, double lightIntensity, String date) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.soilAcidity = soilAcidity;
        this.lightIntensity = lightIntensity;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getSoilAcidity() {
        return soilAcidity;
    }

    public void setSoilAcidity(double soilAcidity) {
        this.soilAcidity = soilAcidity;
    }

    public double getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(double lightIntensity) {
        this.lightIntensity = lightIntensity;
    }
}
