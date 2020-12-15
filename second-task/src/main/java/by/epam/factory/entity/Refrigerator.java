package by.epam.factory.entity;

import java.util.Objects;

public class Refrigerator extends Appliance
{
	 private int powerConsumption;
	    private int weight;
	    private int freezerCapacity;
	    private double overallCapacity;
	    private int height;
	    private int width;

	    public Refrigerator(){}

	    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width) {
	        this.powerConsumption = powerConsumption;
	        this.weight = weight;
	        this.freezerCapacity = freezerCapacity;
	        this.overallCapacity = overallCapacity;
	        this.height = height;
	        this.width = width;
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
	        if (!(o instanceof Refrigerator)) return false;
	        Refrigerator that = (Refrigerator) o;
	        return getPowerConsumption() == that.getPowerConsumption() &&
	                getWeight() == that.getWeight() &&
	                getFreezerCapacity() == that.getFreezerCapacity() &&
	                Double.compare(that.getOverallCapacity(), getOverallCapacity()) == 0 &&
	                Double.compare(that.getHeight(), getHeight()) == 0 &&
	                Double.compare(that.getWidth(), getWidth()) == 0;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(getPowerConsumption(), getWeight(), getFreezerCapacity(), getOverallCapacity(), getHeight(), getWidth());
	    }

	    @Override
	    public String toString() {
	        return "Refrigirator{" +
	                "powerConsumption=" + powerConsumption +
	                ", weight=" + weight +
	                ", freezerCapacity=" + freezerCapacity +
	                ", overallCapacity=" + overallCapacity +
	                ", height=" + height +
	                ", width=" + width +
	                '}';
	    }
	}
