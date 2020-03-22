/*
 * File: Room.java
 * Author: Anthony Smith
 * Date: 2/2/2020
 * Purpose: This class is a template for a hotel room
 * */
public class Room extends Hotel{
    //initialize variables
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

    //checks the occupant name and changes it to not occupied and sets to false
    public boolean isOccupied(){
        if(occupantName != "Not Occupied"){
            return true;
        }else{
            setOccupantName("Not Occupied");
            return false;
        }
    }

    //getter methods
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

    public void setOccupantName(String occupantName) {
        this.occupantName = occupantName;
    }

    //toString to print room info
    @Override
    public String toString() {
        return
                "\nRoom Number: " + roomNumber +
                "\nBed Type: " + bedType +
                "\nRate: " + rate +
                "\nOccupant Name: " + occupantName + "\n";
    }
}
