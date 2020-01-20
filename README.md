# Project 2 - Hotel

![Cat hotel comic](https://i.pinimg.com/originals/db/b0/56/dbb056e7517f2edacdb17696b24df5a3.gif)

## Project Outcomes:
Develop a Java program that uses:
* Decision constructs
* Looping constructs
* Basic operations on an Array of objects (find, change, access all elements)
* More than one class and has multiple objects

## Preparatory Readings:
ZyBooks chapters 1-7

## Background Information:
### Project overview:
Your task is to create a program that stores information related to a hotel property.
Conceptually, a hotel is an object and it contains many rooms.
Rooms have characteristics, such as bed type, room number, occupied or not, etc.
Additionally the hotel itself has characteristics such as the location, name of hotel, etc.

You will be building a mechanism for storing a hotel as well as a testing application that verifies that your code stores the information and allows it to be retrieved and modified as outlined.

### Project Requirements:
1. Develop a simple Hotel program.
We will have two classes, a Hotel class representing an individual hotel and a Room class.
The Hotel class will contain several Room objects and will have several operations.
We will also have a driver program to test the Hotel class.
1. Build a Hotel class that will store information about a Hotel.
It will include a name and location.
It should also include an Array of instances of class Room to hold information about each room.
This Array of Room objects may be a partially filled array, thus it must also have an integer to track how many rooms are in the hotel.
1. The program must use a standard Java Array.
The Array should be able to hold up to 10 Room objects.
1. Build a HotelTest class to test your application.
	1. Your test class should not require any interaction with the user.
	1. It should verify the correct operation of the constructor and all public methods in the Hotel class.
	1. Create at least 5 Rooms in the Hotel. 
	1. Display output info for the hotel - should roughly match what is given below under [Sample Hotel Output](#sample-hotel-output).
	This should be done by using the `toString` methods you create.
	1. "Book" several rooms, that is, set it's status to occupied.
		1. Be sure to test unsuccessful bookings as well, no matching room exists, or matching room is occupied.
	1. Verify that the hotel info has been updated.
	1. Be sure that you are testing all of the methods in both the Hotel and Room class.
	This can include indirect testing where a method is called by another method that does get tested directly.

## Implementation Notes:
1. Create a project that is object oriented, therefore there should be several classes.
1. The class you use to test your Hotel and Room classes is not included in the UML below.

![UML diagram of the classes](http://www.plantuml.com/plantuml/png/ZP8_Ry8m4CNd-5FS60gHw9gXGXqg9f3IRbK74nzWoR6HVK52gD-zYIzL_eXIM4YUxtvtVY-hGD9JNHbnr0e1gnDTe48wEXN6KhL37uGeZGm1rexGY2i8Q7wPTwuAEHJDt-SNIrPMcCCxUMqFh1XNIjBEZbLRjzpjlc24jYGOEeyZqjdmPGXTm1JObUhmLfkcCOUTSmQbxNXIgNP8sYwxYLFZk0NiK7rSJWEmbuJTcIlB-YGjRGQJPpqF0_fpN2ATKcwtJfSgfItH33dtsxXhhwrwe4TRudfohBMcy9D8HBAb8_hVh446i8WALMFvTnTpJ5HSHP9DJ6kKoNqRXMtZqriR2LxcVWWFPv3C3qYltDNVY-M2wIbxq6k591o9smuz0eI1_jTi7MA9RktgmqbkEVsFqV7BXgSiUft3MfuHbjdp4bx42gsgA_C3)

### Room
1. Instance Variables
	1. `roomNumber`: int - number of the room
	1. `bedType`: String - type of bed(ie king, queen etc)
	1. `rate`: int - cost of the room
	1. `occupantName`: String - name of occupant, or the empty String ("") if not occupied
1. Constructors
	1. Default constructor sets all instance variables to a default value
	1. Parameterized Constructor
		1. Takes in room number, bed type, and room rate, as parameters and sets the appropriate instance variable to those values
		1. Sets the occupants name to the empty String ("");
1. Methods
	1. `isOccupied` - method returns true if the room is occupied, false otherwise.
	2. `toString`
		1. Provides all the details of a room - room number, name of guest (if occupied), bed type, and rental rate in a nicely formatted manner such as that given in [Sample Room Output](#sample-room-output) below.
		2. One attribute on each line is preferred.

#### Sample Room Output
```
Room Number: 101
Occupant name: Not Occupied 
Bed Type: queen
Rate: 100
```

### Hotel
1. Instance Variables
	1. `rooms`: An Array of Room Objects
	1. `name`: String - hotel name
	1. `location`: String - hotel location
	1. `numberOfRooms`: int number of rooms in the hotel.
	1. `private static final int NOT_FOUND = -1;`: this is similar to a constant in other languages and is used here to indicate that a search was unsuccessful.
1. Constructors
	1. Should use mutator methods to set all instance variable. 
	1. A default constructors that sets the Array to a size of 10 and all instance fields to a default value.  
	1. Parameterized constructor 
		1.	Takes in parameters for name and location and sets those instance variables to the parameter values. 
		2.	Assigns numberOfRooms to zero.  numberOfRooms indicates how many rooms are in the hotel. It will create a 10 element array. 
1. Methods 
	1. `isFull` - returns a boolean that is true if all the rooms in the hotel are occupied.
	1. `addRoom` - returns true if room is added, false if not.
		1. Takes 3 arguments: the room number, bed type, and room rate.
		1. If `numberOfRooms` is less than the capacity of `rooms`:
			1. Create a Room object from the parameters list.
			1. Adds the Room object to `rooms`.
			1. Increments numberOfRooms (indicates how many actual rooms are in the hotel).
			1. Returns `true`.
		1. Otherwise, returns `false` since no more rooms can be added.
	1. `addReservation`
		1. Takes two arguments: the occupant's name and the requested bed type. 
		1. Searches the array of rooms for one that matches the bed type.
		Remember to use the partially filled array value numberOfRooms in your search loop.
		1. If an unoccupied room with the correct attributes is found, the occupant's name will be set and the occupied attribute will be set to true.
		In either case a message will be printed that will state whether or not the reservation was made.
	1. `findReservation`
		1. **Private method** - only accessible from other method sn the class. 
		1. Takes a String arguments representing the occupant's name.
		1. Searches the occupied rooms for a reservation with that occupant name.
		1. Returns the index of the room or `NOT_FOUND` if not found.
	1. `cancelReservation`
		1. Takes in a string representing the name of a guest. 
		1. If a room is found to be occupied by the specified guest, update the `occupantName` and `isOccupied` values for the room.
		_If multiple rooms exist with the same occupant, you are free to either clear only the first match, or all._
		1. In either case, output a message stating whether or not the reservation was cancelled. 
		1. This method should utilize the private utility method `findReservation()` to scan the list of rooms looking for a room by guest name. 
		1. The `findReservation` method will return the index of the room in the Array of rooms or `NOT_FOUND` if the room is not found.
	1. `toString`
		1.	Returns a nicely formatted string giving hotel and room details.
		2.	Calls the Room class's `toString` method.

#### Sample Hotel Output
```
Hotel Name: Beach Marriot
Location: Pensacola
Number of Rooms : 5
Current revenue: $198
===========================

Room Number: 101
Occupant name: Not Occupied 
Bed Type: queen
Rate: 100

Room Number: 102
Occupant name: Popeye
Bed Type: king
Rate: 110

Room Number: 103
Occupant name: Donald Duck
Bed Type: king
Rate: 88

Room Number: 104
Occupant name: Not Occupied
Bed Type: twin
Rate: 100

Room Number: 105
Occupant name: Not Occupied
Bed Type: queen
Rate: 99
```

## Submission Requirements:
1. All code must be added and committed to your local git repository.
1. All code must be pushed to the GitHub repository created when you "accepted" the assignment.
	1. After pushing, with `git push origin master`, visit the web URL of your repository to verify that your code is there.
	If you don't see the code there, then we can't see it either.
1. If your program will not compile, the graders will not be responsible for trying to test it.

## Important Notes:
* Projects will be graded on whether they correctly solve the problem, and whether they adhere to good programming practices.
* Projects must be received by the time specified on the due date. Projects received after that time will get a grade of zero.
* Please review the academic honesty policy.
	* Note that viewing another student's solution, whether in whole or in part, is considered academic dishonesty.
	* Also note that submitting code obtained through the Internet or other sources, whether in whole or in part, is considered academic dishonesty.
	* All programs submitted will be reviewed for evidence of academic dishonesty, and all violations will be handled accordingly.