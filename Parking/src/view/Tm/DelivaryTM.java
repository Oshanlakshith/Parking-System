package view.Tm;

public class DelivaryTM {
    private  String VehicleNumber;
    private String VehicleType;
    private  String DriverName;
    private   String Time;
    private String Date;

    public DelivaryTM(String vehicleNumber, String vehicleType, String driverName, String time, String date) {
        VehicleNumber = vehicleNumber;
        VehicleType = vehicleType;
        DriverName = driverName;
        Time = time;
        Date = date;

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

    @Override
    public String toString() {
        return "DelivaryTM{" +
                "VehicleNumber='" + VehicleNumber + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", DriverName='" + DriverName + '\'' +
                ", Time='" + Time + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
