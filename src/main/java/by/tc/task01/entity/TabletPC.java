package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.Serializable;
import java.util.Properties;

public class TabletPC extends Appliance implements Serializable{

    private static final long serialVersionUID = 5L;

    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (batteryCapacity != tabletPC.batteryCapacity) return false;
        if (displayInches != tabletPC.displayInches) return false;
        if (memoryRom != tabletPC.memoryRom) return false;
        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) return false;
        return color != null ? color.equals(tabletPC.color) : tabletPC.color == null;
    }

    @Override
    public int hashCode() {
        int result = batteryCapacity;
        result = 31 * result + displayInches;
        result = 31 * result + memoryRom;
        result = 31 * result + flashMemoryCapacity;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    public static Appliance create(Properties properties) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Integer.parseInt(properties.getProperty(
                SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())));
        tabletPC.setDisplayInches(Integer.parseInt(properties.getProperty(
                SearchCriteria.TabletPC.DISPLAY_INCHES.toString())));
        tabletPC.setMemoryRom(Integer.parseInt(properties.getProperty(
                SearchCriteria.TabletPC.MEMORY_ROM.toString())));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt(properties.getProperty(
                SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())));
        tabletPC.setColor(properties.getProperty(
                SearchCriteria.TabletPC.COLOR.toString()));
        return tabletPC;

    }
}
