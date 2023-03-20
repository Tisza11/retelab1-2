import com.google.guava;
import java.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.bme.mit.train.controller;
import hu.bme.mit.train.user;

public class TachoTest {
    @Test
    public void Takko(){
        TrainUserImpl tui;
        int pos = 1;
        int v = 1;
        tui.overrideJoystickPosition(pos);
        TrainControllerImpl tci;
        tci.followSpeed();
        Tacho t;
        t.tacho();
        Assert.assertEquals(t.taho.size(), 1);
    }
}
