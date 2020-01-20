public class Hotel {
    private Room[] rooms;
    private String name;
    private String location;
    private int numberOfRooms;
    private static final int NOT_FOUND = -1;

    public Hotel(){
        this.rooms = new Room[10];
        this.name = "None";
        this.location = "Earth";
        this.numberOfRooms = 100;
    }

    public Hotel(String name, String location, int numberOfRooms, Room rooms[]){
        this.name = name;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.rooms = rooms;
    }

    public void setRooms(Room rooms[]){
        this.rooms = rooms;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    public Room[] getRooms(){
        return rooms;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }

}
