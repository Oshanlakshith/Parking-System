package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class ParkingInterfaceFormController {
    public AnchorPane parkingFormContext;
    public TextField txtVehicleType;
    public ComboBox<String> cmbVehicleNumber;
    public Label lblTime;
    public Label lblDate;
    public ComboBox cmbDriver;
    public TextField txtSlot;
    public Label lblslot;
    public Button btnOnDelivary;
    private volatile boolean stop = false;

    public void initialize() {

        cmbVehicleNumber.getItems().setAll(
                "GC-1005",
                "ND-1003",
                "QA-2001",
                "ND-5089",
                "JB-1020",
                "NA-2356"
        );
        cmbDriver.getItems().setAll(
                "K.A. Pasan",
                "A.C.V Dissanayake",
                "MUDIYANSE",
                "JAYATHILAKA",
                "UPALI WEHELLA",
                "K.J. PERERA",
                "M.P.S.W.PREMARATHNA",
                "W. PREMACHANDRA",
                "S.A Kasun",
                "S.Supun",
                "G.Tharindu",
                "Indika",
                "Mohomed",
                "Abees  ha"
        );

        cmbVehicleNumber.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            if (cmbVehicleNumber.getValue().equals("ND-1003")) {
                txtVehicleType.setText("Bus");
            }
            if (cmbVehicleNumber.getValue().equals("ND-5089")) {
                txtVehicleType.setText("Cargo Lory");
            }
            if (cmbVehicleNumber.getValue().equals("GC-1005")) {
                txtVehicleType.setText("Van");
            }
            if (cmbVehicleNumber.getValue().equals("JB-1020")) {
                txtVehicleType.setText("Van");
            }
            if (cmbVehicleNumber.getValue().equals("QA-2001")) {
                txtVehicleType.setText("Bus");
            }
            if (cmbVehicleNumber.getValue().equals("NA-2356")) {
                txtVehicleType.setText("Cargo Lory");
            }
        });
        Timenow();
        Date();

    }

    public void btnManagementLog(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/logingManageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setTitle("Parking System");
        stage.setScene(scene);
        stage.show();

    }

    public void DelivaryShiftOnAction(ActionEvent actionEvent) throws IOException {
        String number = cmbVehicleNumber.getSelectionModel().getSelectedItem().toString();
        String type = txtVehicleType.getText();
        String driver = cmbDriver.getSelectionModel().getSelectedItem().toString();
        String time = lblTime.getText();
        String date = lblDate.getText();

        OnDelivaryDetailFormController.Delivary(number, type, driver, time, date);
    }

    public void ParkVehicleOnAction(ActionEvent actionEvent) throws IOException {

        //Van Random Number
        if (txtVehicleType.getText().equals("Van")) {
            Random r = new Random();
            int start = 1;
            int end = 13;
            int result = r.nextInt(end - start) + start;
            lblslot.setText(String.valueOf(result));
        }

        //Bus Random Number
        if (txtVehicleType.getText().equals("Bus")) {
            Random r = new Random();
            int start = 14;
            int end = 15;
            int result = r.nextInt(end - start) + start;
            lblslot.setText(String.valueOf(result));
        }

        //Cargo lory Random Number
        if (txtVehicleType.getText().equals("Cargo Lory")) {
            Random r = new Random();
            int start = 5;
            int end = 12;
            int result = r.nextInt(end - start) + start;
            lblslot.setText(String.valueOf(result));

        }

        String number = cmbVehicleNumber.getSelectionModel().getSelectedItem().toString();
        String type = txtVehicleType.getText();
        String sloat = txtSlot.getText();
        String time = lblTime.getText();
        String date = lblDate.getText();

        InParkDetailFormController.Parking(number, type, sloat, time, date);
    }

    private void Timenow() {
        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            while (!stop) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                final String timenow = sdf.format(new Date());
                Platform.runLater(() -> {
                    lblTime.setText(timenow);
                });
            }
        });
        thread.start();
    }

    private void Date() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String datenow = sdf.format(new Date());
        lblDate.setText(datenow);
    }
}
