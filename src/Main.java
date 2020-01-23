public class Main {
    public static void main(String [] args){
        Hotel hotel1 = new Hotel();
        hotel1.setNumberOfRooms(9);

        hotel1.addRoom(100,"queen", 100);
        System.out.println(hotel1.getNumberOfRooms());
        hotel1.addReservation("Tony", "queen");
        for(int i = 0; i <= hotel1.getRooms().length-1; i++){
            System.out.println(hotel1.getRooms()[i]);
        }

    }
}
