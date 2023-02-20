package gui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import states.timer.*;


public class TestTimerLabels extends TestGUIAbstract {

	@Test
	public void testIdleTimerLabels() {
		c.currentState = IdleTimer.Instance();
		g.updateUI(c);
		assertEquals( g.b1.getText(),c.getLeftText(), "button 1 for state IdleTimer ");
		assertEquals( g.b2.getText(),c.getUpText(),"button 2 for state IdleTimer ");
		assertEquals( g.b3.getText(),c.getRightText(), "button 3 for state IdleTimer ");
	}
	
	@Test
	public void testPausedTimerLabels() {
		c.currentState = PausedTimer.Instance();
		g.updateUI(c);
		assertEquals( g.b1.getText(),c.getLeftText(),"button 1 for state PausedTimer ");
		assertEquals( g.b2.getText(),c.getUpText(), "button 2 for state IdleTimer ");
		assertEquals( g.b3.getText(),c.getRightText(), "button 3 for state IdleTimer ");
	}
	
	@Test
	public void testRingingTimerLabels() {
		c.currentState = RingingTimer.Instance();
		g.updateUI(c);
		assertEquals( g.b1.getText(),c.getLeftText(), "button 1 for state RingingTimer ");
		assertEquals( g.b2.getText(),c.getUpText(), "button 2 for state RingingTimer ");
		assertEquals( g.b3.getText(),c.getRightText(), "button 3 for state RingingTimer ");
	}
	
	@Test
	public void testRunningTimerLabels() {
		c.currentState = RunningTimer.Instance();
		g.updateUI(c);
		assertEquals( g.b1.getText(),c.getLeftText(), "button 1 for state RunningTimer ");
		assertEquals( g.b2.getText(),c.getUpText(), "button 2 for state RunningTimer ");
		assertEquals( g.b3.getText(),c.getRightText(), "button 3 for state RunningTimer ");
	}
	
	@Test
	public void testSetTimerLabels() {
		c.currentState = SetTimer.Instance();
		g.updateUI(c);
		assertEquals( g.b1.getText(),c.getLeftText(), "button 1 for state SetTimer ");
		assertEquals( g.b2.getText(),c.getUpText(), "button 2 for state SetTimer ");
		assertEquals( g.b3.getText(),c.getRightText(), "button 3 for state SetTimer ");
	}
	
	   @Test
	    public void testTimerButtonLabels1() {
	    	g.updateUI(c);
	    	assertEquals("change mode",g.b1.getText());
	    	assertEquals("run",g.b2.getText());
	    	assertEquals("set",g.b3.getText());    	
	    	assertEquals("IdleTimer",g.myText3.getText());
	    	assertEquals("timer",g.myText2.getText());
	    	assertEquals("memTimer = 0",g.myText1.getText());
	    }

	@Test
	    public void testTimerButtonLabels2() {
	    	c.right(); //simulate clicking on the left button
	    	g.updateUI(c); //apply the effect on the user interface
	    	assertEquals("reset",g.b1.getText());     
	    	assertEquals("inc 5",g.b2.getText());
	    	assertEquals("done",g.b3.getText());
	    	assertEquals("SetTimer",g.myText3.getText());    	
	    	assertEquals("timer",g.myText2.getText());
	    	assertEquals("memTimer = 0",g.myText1.getText());
	    }

	    @Test
	    public void testStopwatchButtonLabels1() {
	    	c.left(); //simulate clicking on the left button
	    	g.updateUI(c); //apply the effect on the user interface
	    	assertEquals("change mode",g.b1.getText());     
	    	assertEquals("run",g.b2.getText());
	    	assertEquals("(unused)",g.b3.getText());
	    }

	    @Test
	    public void testStopwatchButtonLabels2() {
	    	c.left(); //simulate clicking on the left button
	    	c.up(); //simulate clicking on the right button
	    	g.updateUI(c); //apply the effect on the user interface
	    	assertEquals("change mode",g.b1.getText());     
	    	assertEquals("split",g.b2.getText());
	    	assertEquals("reset",g.b3.getText());
	    }


}
