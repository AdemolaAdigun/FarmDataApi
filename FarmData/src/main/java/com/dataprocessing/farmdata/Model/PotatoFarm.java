package com.dataprocessing.farmdata.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PotatoFarm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double Humidity;
    private double Temperature;
    private double soilAcidity;
    private double lightIntensity;
    private String date;

    public PotatoFarm(double humidity, double temperature, double soilAcidity, double lightIntensity, String date) {
        this.Humidity = humidity;
        this.Temperature = temperature;
        this.soilAcidity = soilAcidity;
        this.lightIntensity = lightIntensity;
        this.date = date;
    }

    public PotatoFarm() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getHumidity() {
        return Humidity;
    }

    public void setHumidity(double humidity) {
        Humidity = humidity;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double temperature) {
        Temperature = temperature;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
