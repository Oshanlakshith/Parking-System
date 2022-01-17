package controller;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class InParkDetailFormController {

    public AnchorPane InParkDetailContext;
    public TextField txtType;
    public TextField txtSlot;
    public TextField txtTime;
    public TextField txtNumber1;
    public TextField txtNumber2;
    public TextField txtNumber3;
    public TextField txtNumber4;
    public TextField txtVTime;
    public TextField txtVSlot;
    public TextField txtVtype;
    public TextField txtType1;
    public TextField txtNumber41;
    public TextField txtNumber42;
    public TextField txtNumber43;
    public TextField txtNumber44;
    public TextField txtNumber45;
    public TextField txtNumber46;
    public TextField txtNumber47;
    public TextField txtNumber48;
    public TextField txtVNumbe;
    public TextField txtTime1;
    public TextField txtDate;
    public TextField txtVTime41;
    public TextField txtVTime42;
    public TextField txtVTime43;

    public void InParkDetailContext(String Number, String Type, String slot, String time,String date) {
        txtVNumbe.setText(Number);
        txtVtype.setText(Type);
        txtVSlot.setText(slot);
        txtVTime.setText(time);
        txtDate.setText(date);

    }
}
