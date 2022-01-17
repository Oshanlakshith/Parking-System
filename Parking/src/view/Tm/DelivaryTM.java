package view.Tm;

import javafx.scene.control.Button;

public class DelivaryTM {
    String VehicleNumber;
    String VehicleType;
    String DriverName;
    String Time;
    String Date;
    Button btn;

    public DelivaryTM() {
    }

    public DelivaryTM(String vehicleNumber, String vehicleType, String driverName, String time, String date, Button btn) {
        VehicleNumber = vehicleNumber;
        VehicleType = vehicleType;
        DriverName = driverName;
        Time = time;
        Date = date;
        this.btn = btn;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
