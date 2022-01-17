package Model;

public class Vehicle {
    String VNumber;
    String VWeight;
    String Passenger;
    String VTypes;

    public Vehicle() {
    }

    public Vehicle(String VNumber, String VWeight, String passenger, String VTypes) {
        this.VNumber = VNumber;
        this.VWeight = VWeight;
        Passenger = passenger;
        this.VTypes = VTypes;
    }

    public String getVNumber() {
        return VNumber;
    }

    public void setVNumber(String VNumber) {
        this.VNumber = VNumber;
    }

    public String getVWeight() {
        return VWeight;
    }

    public void setVWeight(String VWeight) {
        this.VWeight = VWeight;
    }

    public String getPassenger() {
        return Passenger;
    }

    public void setPassenger(String passenger) {
        Passenger = passenger;
    }

    public String getVTypes() {
        return VTypes;
    }

    public void setVTypes(String VTypes) {
        this.VTypes = VTypes;
    }
}