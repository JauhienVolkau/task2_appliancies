package by.epam.factory.entity;

import java.util.Objects;

public class Laptop extends Appliance{
	private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInchs;

    public Laptop(){}

    public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) == 0 &&
                getMemoryRom() == laptop.getMemoryRom() &&
                getSystemMemory() == laptop.getSystemMemory() &&
                Double.compare(laptop.getCpu(), getCpu()) == 0 &&
                Double.compare(laptop.getDisplayInchs(), getDisplayInchs()) == 0 &&
                Objects.equals(getOs(), laptop.getOs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatteryCapacity(), getOs(), getMemoryRom(), getSystemMemory(), getCpu(), getDisplayInchs());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                '}';
    }
}