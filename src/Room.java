public class Room extends Hotel{
    private int roomNumber;
    private String bedType;
    private int rate;
    private String occupantName;

    //default constructor
    public Room(){
        roomNumber = 100;
        bedType = "Queen";
        rate = 0;
        occupantName = "";
    }

    //parameterized constructor
    public Room(int roomNumber, String bedType, int rate, String occupantName){
        this.roomNumber = roomNumber;
        this.bedType = bedType;
        this.rate = rate;
        this.occupantName = occupantName;
    }
    public boolean isOccupied(){
        if(occupantName != "Not Occupied"){
            return true;
        }else{
            setOccupantName("Not Occupied");
            return false;
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getBedType() {
        return bedType;
    }

    public int getRate() {
        return rate;
    }

    public String getOccupantName() {
        return occupantName;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setOccupantName(String occupantName) {
        this.occupantName = occupantName;
    }

    @Override
    public String toString() {
        return
                "\nRoom Number: " + roomNumber +
                "\nBed Type: " + bedType +
                "\nRate: " + rate +
                "\nOccupant Name: " + occupantName;
    }
}
