package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.Serializable;
import java.util.Properties;

public class Refrigerator extends Appliance implements Serializable{

    private static final long serialVersionUID = 3L;

    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator() {
    }


    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (weight != that.weight) return false;
        if (freezerCapacity != that.freezerCapacity) return false;
        if (Double.compare(that.overallCapacity, overallCapacity) != 0) return false;
        if (height != that.height) return false;
        return width == that.width;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + freezerCapacity;
        temp = Double.doubleToLongBits(overallCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public static Appliance create(Properties properties) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())));
        refrigerator.setWeight(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.WEIGHT.toString())));
        refrigerator.setFreezerCapacity(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())));
        refrigerator.setOverallCapacity(Double.parseDouble(properties.getProperty(
                SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())));
        refrigerator.setHeight(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.HEIGHT.toString())));
        refrigerator.setWidth(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.WIDTH.toString())));
        return refrigerator;
    }
}
