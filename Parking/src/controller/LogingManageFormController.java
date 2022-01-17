package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LogingManageFormController {
    public AnchorPane logingFormContext;
    public JFXTextField txtUName;
    public JFXPasswordField txtPassword;
    public Label lblConform;
    public Label lblPassword;
    public Label lblName;

    public void btnLog(ActionEvent actionEvent) throws IOException {

        if (txtUName.getText().equals("admin") && txtPassword.getText().equals("admin12345")) {
            URL resource = getClass().getResource("../view/parkingMenuForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) logingFormContext.getScene().getWindow();
            window.setScene(new Scene(load));



        }else{
            txtPassword.clear();
            System.out.println("Wrong");
            lblConform.setText("Wrong Password");
            lblName.setText("Name is :admin");
            lblPassword.setText("Password is: admin12345");
        }
    }
    public void btnCancel(ActionEvent actionEvent) throws IOException {
        URL resource=getClass().getResource("../view/ParkingInterfaceForm.fxml");
        Parent load= FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
