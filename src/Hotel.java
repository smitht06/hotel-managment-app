public class Hotel {
    private Room[] rooms;
    private String name;
    private String location;
    private int numberOfRooms;
    private static final int NOT_FOUND = -1;

    //default constructor
    public Hotel() {
        this.rooms = new Room[100];
        this.name = "None";
        this.location = "Earth";
        this.numberOfRooms = 100;
    }

    //parameterized constructor
    public Hotel(String name, String location, int numberOfRooms, Room rooms[]) {
        this.name = name;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.rooms = rooms;
    }

    //setters for all variables
    public void setRooms(Room rooms[]) {
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


    private boolean isFull(int numberOfRooms) {
        if (numberOfRooms == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean addRoom(int roomNumber, String bedType, int roomRate){
        int roomCapacity = 0;
      if(numberOfRooms < rooms.length){
           Room newRoom = new Room(roomNumber,bedType,roomRate,"");
           //not sure how to add room to the array , i'm not sure how to add it to the array
           numberOfRooms++;
           return true;

        }else {
          return false;
      }
    }


}