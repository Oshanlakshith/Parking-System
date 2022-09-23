package controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import view.Tm.DelivaryTM;


public class OnDelivaryDetailFormController {
    public AnchorPane OnDeliveryDetailContext;

    public TableView<DelivaryTM>tblDriver;
    public TableColumn vType;
    public TableColumn vNomber;
    public TableColumn vDriver;
    public TableColumn vTime;
    public TableColumn vDate;

   static ObservableList<DelivaryTM>delivary= FXCollections.observableArrayList();

    public void initialize(){
    tblDriver.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("VehicleNumber"));
    tblDriver.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("VehicleType"));
    tblDriver.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("DriverName"));
    tblDriver.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("Time"));
    tblDriver.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("Date"));

    tblDriver.setItems(delivary);
    }


    public static void Delivary(String number, String type, String driver,String time,String date){
        DelivaryTM d1=new DelivaryTM(number,type,driver,time,date);
       delivary.add(d1);
    }
}