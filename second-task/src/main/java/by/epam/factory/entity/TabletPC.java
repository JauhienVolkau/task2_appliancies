package by.epam.factory.entity;

import java.util.Objects;

public class TabletPC extends Appliance
{
	 private int batteryCapacity;
	    private int displayInchs;
	    private int memoryPom;
	    private int flashMemoryCapacity;
	    private String cord;

	    public TabletPC(){}

	    public TabletPC(int batteryCapacity, int displayInchs, int memoryPom, int flashMemoryCapacity, String cord) {
	        this.batteryCapacity = batteryCapacity;
	        this.displayInchs = displayInchs;
	        this.memoryPom = memoryPom;
	        this.flashMemoryCapacity = flashMemoryCapacity;
	        this.cord = cord;
	    }

	    public int getBatteryCapacity() {
	        return batteryCapacity;
	    }

	    public void setBatteryCapacity(int batteryCapacity) {
	        this.batteryCapacity = batteryCapacity;
	    }

	    public int getDisplayInchs() {
	        return displayInchs;
	    }

	    public void setDisplayInchs(int displayInchs) {
	        this.displayInchs = displayInchs;
	    }

	    public int getMemoryPom() {
	        return memoryPom;
	    }

	    public void setMemoryPom(int memoryPom) {
	        this.memoryPom = memoryPom;
	    }

	    public int getFlashMemoryCapacity() {
	        return flashMemoryCapacity;
	    }

	    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
	        this.flashMemoryCapacity = flashMemoryCapacity;
	    }

	    public String getCord() {
	        return cord;
	    }

	    public void setCord(String cord) {
	        this.cord = cord;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof TabletPC)) return false;
	        TabletPC tabletPC = (TabletPC) o;
	        return getBatteryCapacity() == tabletPC.getBatteryCapacity() &&
	                getDisplayInchs() == tabletPC.getDisplayInchs() &&
	                getMemoryPom() == tabletPC.getMemoryPom() &&
	                getFlashMemoryCapacity() == tabletPC.getFlashMemoryCapacity() &&
	                Objects.equals(getCord(), tabletPC.getCord());
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(getBatteryCapacity(), getDisplayInchs(), getMemoryPom(), getFlashMemoryCapacity(), getCord());
	    }

	    @Override
	    public String toString() {
	        return "TabletPC{" +
	                "batteryCapacity=" + batteryCapacity +
	                ", displayInchs=" + displayInchs +
	                ", memoryPom=" + memoryPom +
	                ", flashMemoryCapacity=" + flashMemoryCapacity +
	                ", cord='" + cord + '\'' +
	                '}';
	    }
	}
