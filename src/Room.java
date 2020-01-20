public class Room {
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
}
