package Model;

public class Driver {
    String Name;
    String Nic;
    String Licen;
    String Address;
    String Contact;

    public Driver() {
    }

    public Driver(String name, String nic, String licen, String address, String contact) {
        Name = name;
        Nic = nic;
        Licen = licen;
        Address = address;
        Contact = contact;
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
}
