public class Main {
    public static void main(String [] args){
        Hotel hotel1 = new Hotel("Marriot","Washington D.C",9,new Room[10]);


        hotel1.addRoom(100,"Queen", 100, "Not Occupied");
        hotel1.addRoom(101,"King", 100, "Not Occupied");
        hotel1.addRoom(102,"King", 100, "Not Occupied");
        hotel1.addRoom(103,"Twin", 100, "Not Occupied");
        hotel1.addRoom(104,"Queen", 100, "Not Occupied");
        //System.out.println(hotel1.getNumberOfRooms());
        hotel1.addReservation("Tony", "Queen");
        hotel1.addReservation("Josiah Bartlett", "King");
        hotel1.addReservation("Josiah Bartlett", "bunk");
        //Room room1 = hotel1.getRooms()[9];
        //for(int i = 0; i <= hotel1.getRooms().length-1; i++){
          //  System.out.println(hotel1.getRooms()[i]);
        //}
        //System.out.println(room1.isOccupied());
        //hotel1.cancelReservation("Tony");

        //System.out.println(room1.isOccupied());

        System.out.println(hotel1.toString());
        //System.out.println(hotel1.listRooms());
        //System.out.println(hotel1.listRooms());


        }
        }
