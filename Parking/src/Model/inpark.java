package Model;

public class inpark{
    String VNumber;
    String VType;
    String PSlot;
    String PTime;
    String date;


    public inpark(String VNumber, String VType, String PSlot, String PTime, String date) {
        this.VNumber = VNumber;
        this.VType = VType;
        this.PSlot = PSlot;
        this.PTime = PTime;
        this.date = date;
    }

    public String getVNumber() {
        return VNumber;
    }

    public void setVNumber(String VNumber) {
        this.VNumber = VNumber;
    }

    public String getVType() {
        return VType;
    }

    public void setVType(String VType) {
        this.VType = VType;
    }

    public String getPSlot() {
        return PSlot;
    }

    public void setPSlot(String PSlot) {
        this.PSlot = PSlot;
    }

    public String getPTime() {
        return PTime;
    }

    public void setPTime(String PTime) {
        this.PTime = PTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "InParkTM{" +
                "VNumber='" + VNumber + '\'' +
                ", VType='" + VType + '\'' +
                ", PSlot='" + PSlot + '\'' +
                ", PTime='" + PTime + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}