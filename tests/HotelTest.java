import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

   @Test
    void test(){
       Hotel hotel1 = new Hotel();
       hotel1.addRoom(100,"queen", 100);
       assertEquals("queen", hotel1.getRooms()[9].getBedType());
       assertEquals(10,hotel1.getNumberOfRooms());
    }
}