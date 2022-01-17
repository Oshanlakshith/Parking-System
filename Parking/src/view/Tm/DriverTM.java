package view.Tm;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;

public class DriverTM {
    String Name;
    String Nic;
    String Licen;
    String Address;
    String Contact;
    Button btn;

    public DriverTM() {
    }

    public DriverTM(String name, String nic, String license, String address, String contact, Button btn) {
        Name = name;
        Nic = nic;
        Licen = license;
        Address = address;
        Contact = contact;
        this.btn = btn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public String getLicen() {
        return Licen;
    }

    public void setLicen(String licen) {
        Licen = licen;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
