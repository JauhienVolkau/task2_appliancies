package by.epam.factory.entity;

import java.util.Objects;

public class Speakers extends Appliance
{
	 private int powerConsumption;
	    private int numberOfSpeakers;
	    private String frequencyRange;
	    private int cordLength;

	    public Speakers(){};

	    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
	        this.powerConsumption = powerConsumption;
	        this.numberOfSpeakers = numberOfSpeakers;
	        this.frequencyRange = frequencyRange;
	        this.cordLength = cordLength;
	    }

	    public int getPowerConsumption() {
	        return powerConsumption;
	    }

	    public void setPowerConsumption(int powerConsumption) {
	        this.powerConsumption = powerConsumption;
	    }

	    public int getNumberOfSpeakers() {
	        return numberOfSpeakers;
	    }

	    public void setNumberOfSpeakers(int numberOfSpeakers) {
	        this.numberOfSpeakers = numberOfSpeakers;
	    }

	    public String getFrequencyRange() {
	        return frequencyRange;
	    }

	    public void setFrequencyRange(String frequencyRange) {
	        this.frequencyRange = frequencyRange;
	    }

	    public int getCordLength() {
	        return cordLength;
	    }

	    public void setCordLength(int cordLength) {
	        this.cordLength = cordLength;
	    }


	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Speakers)) return false;
	        Speakers speakers = (Speakers) o;
	        return getPowerConsumption() == speakers.getPowerConsumption() &&
	                getNumberOfSpeakers() == speakers.getNumberOfSpeakers() &&
	                getCordLength() == speakers.getCordLength() &&
	                Objects.equals(getFrequencyRange(), speakers.getFrequencyRange());
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(getPowerConsumption(), getNumberOfSpeakers(), getFrequencyRange(), getCordLength());
	    }

	    @Override
	    public String toString() {
	        return "Speakers{" +
	                "powerConsumption=" + powerConsumption +
	                ", numberOfSpeakers=" + numberOfSpeakers +
	                ", frequencyRange=" + frequencyRange +
	                ", cordLength=" + cordLength +
	                '}';
	    }
	}