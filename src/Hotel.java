/*
 * File: Hotel.java
 * Author: Anthony Smith
 * Date: 2/2/2020
 * Course: COP 5007
 * Purpose: This class is a template for a hotel
 * */
//declare global variables
public class Hotel {
    private Room[] rooms;
    private String name;
    private String location;
    private int numberOfRooms;
    private int revenue;
    private int actualRoomCount = 0;
    private static final int NOT_FOUND = -1;

    //default constructor
    public Hotel() {
        this.rooms = new Room[10];
        this.name = "None";
        this.location = "Earth";
        this.numberOfRooms = 9;
        this.revenue = 0;
    }

    //parameterized constructor
    public Hotel(String name, String location, int numberOfRooms, Room[] rooms) {
        this.name = name;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.rooms = rooms;
        this.revenue = 0;
    }

    //setters for all variables
    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    //getters for all variables

    public Room[] getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    //is full method tells if all rooms are full
    public boolean isFull() {
        int numRooms = this.rooms.length;
        int numberOfRoomsFree = numRooms;
        System.out.println(numberOfRoomsFree);
        for (int i = numRooms-1; i > -1; i--){
            if(rooms[i].isOccupied() == true) {
                numberOfRoomsFree = numberOfRoomsFree -1;
                continue;
            }else{
                return false;
            }
        }if (numberOfRoomsFree == 0) {
            return true;
        }return false;
    }

    //add room method adds a room and catches null pointer exception
    public boolean addRoom(int roomNumber, String bedType, int roomRate,String occupantName){
      try{
      //loop through array and add room to next available element

      if(this.numberOfRooms <= this.rooms.length){
           this.rooms[numberOfRooms--] = new Room(roomNumber,bedType,roomRate, occupantName);
           actualRoomCount++;
           return true;
        }
    }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("room not added");

      }
        return false;
    }

    //add reservation method
    public void addReservation(String occupantsName, String bedType) {
        int numRooms = this.rooms.length;
        boolean found=false;
        //loop through rooms checking if room is occupied and bedtype matches
        for (int i = numRooms-1; i > -1; i--) {
            if (rooms[i].getBedType() == bedType && rooms[i].isOccupied() == false) {
                rooms[i].setOccupantName(occupantsName);
                this.revenue += rooms[i].getRate();
                System.out.println("Reservation Complete");
                found = true;
                break; }
        //print message to user if room not available or doesnt exist
        }if(found == false){
            System.out.println("No room of this bed type is available");

        }
    }

    //cancel reservation method and set occupant back to not occupied
    public void cancelReservation(String occupantName){
        int numRooms = this.rooms.length;
        for (int i = numRooms-1; i > -1; i--) {
            if (rooms[i].getOccupantName() == occupantName) {
                //by setting occupant name to not occupied the isOccupied method is now false
                rooms[i].setOccupantName("Not Occupied");
                System.out.println("Reservation cancelled");
                this.revenue -= rooms[i].getRate();
                break;
            }
        }
    }

    //method to return all rooms
    public String listRooms() {
        String info = "";
        for(int i = getRooms().length-1; i >= 0; i--){
            if (rooms[i] != null){
                info += rooms[i].toString();
            }else{
                break;
            }
        }
        return info;
    }

    //toString to format output of hotel information
    public String toString(){
        return
                "\n" + "Hotel: " + name + "\n" +
                "Location: " + location + "\n" +
                "Number of rooms: " + actualRoomCount + "\n" +
                "Current Revenue: " + revenue + "\n" +
                "================================ \n" + listRooms();
    }
}