package controller;

import Model.OnDelivary;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class OnDelivaryDetailFormController {
    public TableColumn colVehicleNumber;
    public AnchorPane OnDeliveryDetailContext;
    public TextField txtVType;
    public TextField txtDriver;
    public TextField txtTime;
    public TextField txtNumber1;
    public TextField txtNumber2;
    public TextField txtNumber3;
    public TextField txtNumber4;
    public TextField txtVTime;
    public TextField txtVSlot;
    public TextField txtVtype;
    public TextField txtVNumbe;
    public TextField txtVNumber;
    public TextField txtNumber41;
    public TextField txtNumber42;
    public TextField txtNumber43;
    public TextField txtNumber44;
    public TextField txtNumber45;
    public TextField txtNumber46;
    public TextField txtNumber47;
    public TextField txtNumber48;
    public TextField txtDate;
    public TextField txtVTime41;
    public TextField txtVTime42;
    public TextField txtVTime43;
    public TextField txttDate;
    public TextField txtVDriver;

    ArrayList<OnDelivary>delivaryList=new ArrayList();


    public void tblOnDelivary(String Vehicle_Number, String Vehicle_Type, String Driver, String Time, String Date) {
        txtVNumbe.setText(Vehicle_Number);
        txtVtype.setText(Vehicle_Type);
        txtVDriver.setText(Driver);
        txtVTime.setText(Time);
        txtDate.setText(Date);
    }
}
