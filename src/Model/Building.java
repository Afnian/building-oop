package Model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String municipality;
    private String[] owners;

    public Building(String address, String municipality, String[] owners) {
        this.address = address;
        this.municipality = municipality;
        this.owners = owners;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String[] getOwners() {
        return owners;
    }

    public void setOwners(String[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(municipality, building.municipality) && Objects.deepEquals(owners, building.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, municipality, Arrays.hashCode(owners));
    }
}
