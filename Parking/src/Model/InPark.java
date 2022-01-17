package Model;

public class InPark {
    String VNumber;
    String VType;
    String PSlot;
    String PTime;

    public InPark() {
    }

    public InPark(String VNumber, String VType, String PSlot, String PTime) {
        this.VNumber = VNumber;
        this.VType = VType;
        this.PSlot = PSlot;
        this.PTime = PTime;
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
}
