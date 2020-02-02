/*
 * File: Main.java
 * Author: Anthony Smith
 * Date: 2/2/2020
 * Course: COP 5007
 * Purpose: This class is a driver class for Hotel and Room classes
 * */
public class Main {
    public static void main(String [] args){
        Hotel hotel1 = new Hotel("Capitol Hotel","Washington D.C",10,new Room[10]);


        //add 10 rooms
        hotel1.addRoom(100,"Queen", 100, "Not Occupied");
        hotel1.addRoom(101,"King", 100, "Not Occupied");
        hotel1.addRoom(102,"King", 110, "Not Occupied");
        hotel1.addRoom(103,"Twin", 90, "Not Occupied");
        hotel1.addRoom(105,"Queen", 100, "Not Occupied");
        hotel1.addRoom(106,"Queen", 100, "Not Occupied");
        hotel1.addRoom(107,"Queen", 100, "Not Occupied");
        hotel1.addRoom(108,"Queen", 100, "Not Occupied");
        hotel1.addRoom(109,"Queen", 100, "Not Occupied");
        hotel1.addRoom(110,"Queen", 100, "Not Occupied");

        //unsuccessful room add
        hotel1.addRoom(104,"Queen", 100, "Not Occupied");
        hotel1.addRoom(104,"Queen", 100, "Not Occupied");


        //add reservations
        hotel1.addReservation("Angela Martin", "Queen");
        hotel1.addReservation("Michael Scott", "King");
        hotel1.addReservation("Andrew Bernard", "King");
        hotel1.addReservation("Pamela Halpert", "Twin");
        hotel1.addReservation("Stanley Hudson", "Queen");
        hotel1.addReservation("Stanley Hudson", "Queen");
        hotel1.addReservation("Stanley Hudson", "Queen");
        hotel1.addReservation("Stanley Hudson", "Queen");
        hotel1.addReservation("Stanley Hudson", "Queen");
        hotel1.addReservation("Stanley Hudson", "Queen");


        //test address if bed type is not found
        hotel1.addReservation("Kevin Malone", "bunk beds");


        //show isfull method

        System.out.println(hotel1.toString());
        System.out.println("is full: "+hotel1.isFull());
        hotel1.cancelReservation("Angela Martin");
        System.out.println(hotel1.toString());
        System.out.println("is full: "+hotel1.isFull());



        }
        }
