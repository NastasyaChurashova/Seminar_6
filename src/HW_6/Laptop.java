package HW_6;

import java.util.Objects;

public class Laptop {
    public String brandName;
    public String colour;
    public String operatingSystem;

    public Laptop(String brandName, String colour, String operatingSystem) {
        this.brandName = brandName;
        this.colour = colour;
        this.operatingSystem = operatingSystem;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getColour() {
        return colour;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brandName='" + brandName + '\'' +
                ", colour='" + colour + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(brandName, laptop.brandName) &&
                Objects.equals(colour, laptop.colour) &&
                Objects.equals(operatingSystem, laptop.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, colour, operatingSystem);
    }

}