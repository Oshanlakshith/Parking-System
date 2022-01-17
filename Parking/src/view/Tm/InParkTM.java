package view.Tm;

import javafx.scene.control.Button;

public class InParkTM {
    String VNumber;
    String VType;
    String PSlot;
    String PTime;
    Button btn;


    public InParkTM() {
    }

    public InParkTM(String VNumber, String VType, String PSlot, String PTime, Button btn) {
        this.VNumber = VNumber;
        this.VType = VType;
        this.PSlot = PSlot;
        this.PTime = PTime;
        this.btn = btn;
    }

    public String getVNumber() {
        return VNumber;
    }

    public void setVNumber(String VNumber) {
        this.VNumber = VNumber;
    }

    public String getVType() {
        return VType;
    }

    public void setVType(String VType) {
        this.VType = VType;
    }

    public String getPSlot() {
        return PSlot;
    }

    public void setPSlot(String PSlot) {
        this.PSlot = PSlot;
    }

    public String getPTime() {
        return PTime;
    }

    public void setPTime(String PTime) {
        this.PTime = PTime;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
