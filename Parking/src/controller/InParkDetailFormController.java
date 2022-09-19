package controller;


import Model.inpark;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import view.Tm.InParkTM;

import java.io.IOException;
import java.util.ArrayList;

public class InParkDetailFormController {

    public AnchorPane InParkDetailContext;

    public TableView<InParkTM> tblParkVehicle;


    public TableColumn CvehicleNo;
    public TableColumn VType;
    public TableColumn CSloat;
    public TableColumn cTime;
    public TableColumn cDate;

    static ObservableList<InParkTM> parkList = FXCollections.observableArrayList();

    public void initialize() {
        tblParkVehicle.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("VNumber"));
        tblParkVehicle.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("VType"));
        tblParkVehicle.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("PSlot"));
        tblParkVehicle.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("PTime"));
        tblParkVehicle.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("date"));

        tblParkVehicle.setItems(parkList);
    }

    public static void Parking(String number, String type, String sloat, String time, String date) {
        InParkTM inpark = new InParkTM(number, type, sloat, time, date);
        parkList.add(inpark);

    }

}
