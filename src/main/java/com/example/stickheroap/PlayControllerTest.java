package com.example.stickheroap;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import static org.testing.Assert.*;
public class PlayControllerTest {
    private PlayController controller;
    @Before
    public void setUp() {
        controller = new PlayController();
    }
    @Test
    public void testExtendStick() {
        // Create a dummy Player object (you may need to adjust this based on your actual implementation)
        Player dummyPlayer = new Player(0,0);

        // Call the extendStick method
        controller.extendStick(dummyPlayer);

        // Assert the expected value after extending the stick
        assertEquals(6.0, controller.stick.getHeight(), 0.0);
    }
    @Test
    public void testFall() {
        // Create a dummy Player object
        Player player2 = new Player(0, 0);

        // Call the fall method
        controller.fall(player2);
        assertTrue(controller.isGameOver());
    }

}
