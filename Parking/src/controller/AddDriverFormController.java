package controller;

import Model.Driver;
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
import view.Tm.DriverTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class AddDriverFormController {
    public AnchorPane AddDriverContext;
    public TextField txtName;
    public TextField txtNic;
    public TextField txtLicen;
    public TextField txtAddress;
    public TextField txtContact;
    public TableView tblDrivers;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colLicen;
    public TableColumn colAddress;
    public TableColumn colContact;

    static ArrayList<Driver>drivers=new ArrayList();
    public TableColumn colDelete;

    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("Nic"));
        colLicen.setCellValueFactory(new PropertyValueFactory<>("Licen"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("Contact"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));

    }
    public void btnCancel(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/parkingMenuForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AddDriverContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
    public boolean isExists(Driver driver){
        for (Driver d:drivers) {
            if(d.getNic().equalsIgnoreCase(driver.getNic())){
                return true;
            }
        }
        return false;
    }
    public void btnAddDriver(ActionEvent actionEvent) {
        Driver driver = new Driver(txtName.getText(), txtNic.getText(), txtLicen.getText(), txtAddress.getText(), txtContact.getText());
        txtName.clear();
        txtNic.clear();
        txtAddress.clear();
        txtContact.clear();
        txtLicen.clear();

        if (isExists(driver)) {
            new Alert(Alert.AlertType.WARNING, "Already Exisit..", ButtonType.CLOSE).show();

        } else {
            if (drivers.add(driver)) {
                loadAllDrivers();
                new Alert(Alert.AlertType.CONFIRMATION, "Save..", ButtonType.CLOSE).show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();

            }
        }
    }
   private void loadAllDrivers(){
       ObservableList<DriverTM>tmObservableList= FXCollections.observableArrayList();
       for (Driver temp:drivers) {
           Button btn=new Button("Delete");
           tmObservableList.add(new DriverTM(temp.getName(),temp.getNic(),temp.getLicen(),temp.getAddress(),temp.getContact(),btn));

           btn.setOnAction((e)->{

               ButtonType yes=new ButtonType("yes",ButtonBar.ButtonData.OK_DONE);
               ButtonType no=new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

               Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are you sure Whether you want to delete this Driver?",yes,no);
                alert.setTitle("Conformation Alart");

               Optional<ButtonType>result= alert.showAndWait();
               if(result.orElse(no)==yes){
                   drivers.remove(temp);
                   loadAllDrivers();
               }else{
               }
           });
       }
        tblDrivers.setItems(tmObservableList);
    }


    public void newDriverOnAction(ActionEvent actionEvent) {
    }
}
