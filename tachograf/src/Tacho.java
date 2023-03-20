package hu.bme.mit.train;
import com.google.guava;
import hu.bme.mit.train.controller;
import hu.bme.mit.train.user;
import java.time.LocalDateTime;

public class Tacho {

    //public static Date datum = Date.CurrentTime();
    //public static int rSpeed = 0;
    //public static int pos = 0;
    public static Table<Date, int, int> taho = HashBasedTable.create();
    public static void tacho(String[] args){
        taho.put(Date.CurrentTime(), getReferenceSpeed(), getJoystickPosition());
        //date = = Date.CurrentTime();
        //rSpeed = getReferenceSpeed;
        //pos = getJoystickPosition;
    }
    public static Table getPos(){
        return taho;
    }
}
