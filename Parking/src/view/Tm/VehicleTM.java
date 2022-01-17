package view.Tm;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class VehicleTM {
    String VNumber;
    String VWeight;
    String Passenger;
    String VTypes;
    Button btn;

    public VehicleTM() {
    }

    public VehicleTM(String VNumber, String VWeight, String passenger, String VTypes, Button btn) {
        this.VNumber = VNumber;
        this.VWeight = VWeight;
        Passenger = passenger;
        this.VTypes = VTypes;
        this.btn = btn;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}