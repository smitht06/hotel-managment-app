public class Hotel {
    private Room[] rooms;
    private String name;
    private String location;
    private int numberOfRooms;
    private int revenue;
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
    public Hotel(String name, String location, int numberOfRooms, Room rooms[]) {
        this.name = name;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.rooms = rooms;
        this.revenue = 0;
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

    public boolean addRoom(int roomNumber, String bedType, int roomRate,String occupantName){
      if(this.numberOfRooms <= this.rooms.length){
           this.rooms[numberOfRooms--] = new Room(roomNumber,bedType,roomRate, occupantName);
           return true;

        }else {
          return false;
      }
    }

    public void addReservation(String occupantsName, String bedType) {
        int numRooms = this.rooms.length;
        boolean found=false;
        for (int i = numRooms-1; i > getNumberOfRooms(); i--) {
            if (rooms[i].getBedType() == bedType) {
                rooms[i].setOccupantName(occupantsName);
                this.revenue += rooms[i].getRate();
                System.out.println("Reservation Complete");
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("No room of this bed type is available");
        }
    }
    public void cancelReservation(String occupantName){
        int numRooms = this.rooms.length;
        for (int i = numRooms-1; i >= -1; i--) {
            if (rooms[i].getOccupantName() == occupantName) {
                rooms[i].setOccupantName("Not Occupied");
                break;
            }

        }
    }

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

    public String toString(){
        return
                "\n" + "Hotel: " + name + "\n" +
                "Location: " + location + "\n" +
                "Number of rooms: " + numberOfRooms + "\n" +
                "Current Revenue: " + revenue + "\n" +
                "================================ \n" + listRooms();


    }
}