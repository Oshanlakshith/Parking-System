package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class ParkingMenuFormController {

    public AnchorPane menuContext;
    public ComboBox cmbParkDeli;

    public void btnLogOut(ActionEvent actionEvent) throws IOException {

        ButtonType yes = new ButtonType("yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("no", ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you Sure you want to logout now?", yes, no);
        alert.setTitle("Conformation Alert");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(no) == yes) {
            URL resource = getClass().getResource("../view/ParkingInterfaceForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) menuContext.getScene().getWindow();
            window.setScene(new Scene(load));
        }else{

        }
    }
    public void btnAddD(ActionEvent actionEvent) throws IOException {
        URL resource=getClass().getResource("../view/AddDriverForm.fxml");
        Parent load=FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setTitle("Add Driver");
        stage.setScene(scene);
        stage.show();
    }

    public void btnAddV(ActionEvent actionEvent) throws IOException {
        URL resource= getClass().getResource("../view/AddVehicleForm.fxml");
        Parent load= FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setTitle("Add Vehicle");
        stage.setScene(scene);
        stage.show();
    }



    public void btnParkVehicle(ActionEvent actionEvent) throws IOException {
        URL resource=getClass().getResource("../view/InParkDetailForm.fxml");
        Parent load=FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setTitle("In Parking");
        stage.setScene(scene);
        stage.show();
    }

    public void btnOnDelivary(ActionEvent actionEvent) throws IOException {
        URL resource=getClass().getResource("../view/OnDelivaryDetailForm.fxml");
        Parent load=FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setTitle("On Delivary");
        stage.setScene(scene);
        stage.show();
    }
}
