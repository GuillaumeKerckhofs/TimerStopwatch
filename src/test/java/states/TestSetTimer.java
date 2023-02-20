package states;

import static org.junit.jupiter.api.Assertions.*;

import states.timer.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSetTimer {

    private Context context;

    @BeforeEach
    public void setUp() {
        // reset the initial values of timer to avoid inferences between different consecutive tests
        context = new Context();
        context.currentState = SetTimer.Instance(); // because we are testing the IdleTimer state here...
        AbstractTimer.resetInitialValues();
    }

    @Test
    public void testSetTimer(){

        context.left();
        context.tick();
        assertEquals(AbstractTimer.getMemTimer(),1);

        context.up();
        context.tick();
        assertEquals(AbstractTimer.getMemTimer(),7);
    }
}
