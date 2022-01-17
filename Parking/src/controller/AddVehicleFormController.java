package controller;

import Model.Vehicle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.Tm.VehicleTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class AddVehicleFormController {
    public AnchorPane addVehicleContext;
    public TableView tblVehicles;
    public TextField txtNumber;
    public TextField txtPassengers;
    public TextField txtWeight;
    public ComboBox<String> cmbVTypes;
    public TableColumn colNumber;
    public TableColumn colWeight;
    public TableColumn colPassenger;
    public TableColumn colDelete;
    public TableColumn colVTypes;


    static ArrayList<Vehicle> vehiclelist = new ArrayList();

    //static ArrayList<String> vtype = new ArrayList();

    public void initialize() {
        colNumber.setCellValueFactory(new PropertyValueFactory("VNumber"));
        colWeight.setCellValueFactory(new PropertyValueFactory("VWeight"));
        colPassenger.setCellValueFactory(new PropertyValueFactory("Passenger"));
        colWeight.setCellValueFactory(new PropertyValueFactory("VWeight"));
        colDelete.setCellValueFactory(new PropertyValueFactory("btn"));
        colVTypes.setCellValueFactory(new PropertyValueFactory("VTypes"));

        cmbVTypes.getItems().addAll(
                "Van",
                "Bus",
                "Cargo lory"
                );

        cmbVTypes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            colVTypes.getColumns().setAll(newValue);
        });
    }

    public void btnAddVehicle(ActionEvent actionEvent) {
       Vehicle vehicle = new Vehicle(txtNumber.getText(),txtWeight.getText(),txtPassengers.getText(),cmbVTypes.getValue());

        txtNumber.clear();
        txtPassengers.clear();
        txtWeight.clear();

       if (vehiclelist.add(vehicle)) {
            loadAllVehicles();
            new Alert(Alert.AlertType.CONFIRMATION, "Save..", ButtonType.CLOSE).show();
      } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
    }

    private void loadAllVehicles() {
        ObservableList<VehicleTM> tmObservableList = FXCollections.observableArrayList();
        for (Vehicle temp : vehiclelist) {
            Button btn = new Button("Delete");

           tmObservableList.add(new VehicleTM(temp.getVNumber(), temp.getVWeight(), temp.getPassenger(), temp.getVTypes(),btn));

            btn.setOnAction((e) -> {
                ButtonType yes = new ButtonType("yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("no", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure Whether you want to delete this Driver?", yes, no);
                alert.setTitle("Conformation Alart");

                Optional<ButtonType> result = alert.showAndWait();
                if (result.orElse(no) == yes) {
                    vehiclelist.remove(temp);
                    loadAllVehicles();
                } else {
                }
            });
        }
        tblVehicles.setItems(tmObservableList);
    }

    public void btnCancel(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/parkingMenuForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) addVehicleContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}