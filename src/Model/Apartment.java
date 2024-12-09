package Model;

import java.util.Arrays;
import java.util.Objects;

public class Apartment {
    private String floor ;
    private String door;
    private String[] Apartments;

    public Apartment(String floor, String door, String[] apartments) {
        this.floor = floor;
        this.door = door;
        Apartments = apartments;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String[] getApartments() {
        return Apartments;
    }

    public void setApartments(String[] apartments) {
        Apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return Objects.equals(floor, apartment.floor) && Objects.equals(door, apartment.door) && Objects.deepEquals(Apartments, apartment.Apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, door, Arrays.hashCode(Apartments));
    }
}
