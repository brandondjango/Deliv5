import static org.junit.Assert.*;

import org.junit.Test;

public class SlowLifeTester {

	/*--------------------------------------------------------------*/
	//Cell.toString() tests
	/*--------------------------------------------------------------*/
	
	//The following test makes sure the Constructor adjusts the cell string correctly
	//When set true, the cell should have an "X".
	//This test should pass
	@Test
	public void toStringTest1(){
	Cell cell = new Cell(true);
	String thing = cell.toString();
	assertEquals(true, thing.equals("X"));
	}
	
	//The following test makes sure the Constructor adjusts the cell string correctly
	//When set false, the cell should have an ".".
	//This test should pass
	@Test
	public void toStringTest2(){
	Cell cell = new Cell(false);
	String thing = cell.toString();
	assertEquals(true, thing.equals("."));
	}
	
	//The following tests makes sure the setAlive() method adjusts cell correctly and that it is reflected in
	//the toString() method
	//When set true, cell should have an "X"
	//This test should pass
	@Test
	public void toStringTest3(){
	Cell cell = new Cell();
	cell.setAlive(true);
	String thing = cell.toString();
	assertEquals(true, thing.equals("X"));
	}

	//The following tests makes sure the setAlive() method adjusts cell correctly and that it is reflected in
	//the toString() method
	//When set false, cell should have an "."
	//This test should pass
	@Test
	public void toStringTest4(){
	Cell cell = new Cell();
	cell.setAlive(false);
	String thing = cell.toString();
	assertEquals(true, thing.equals("."));
	}

	/*--------------------------------------------------------------*/
	//MainPanel.convertToInt() tests
	/*--------------------------------------------------------------*/
	
	//This test tests the convertToInt(int)  method in mainpanel to make sure it correctly returns an integer
	//The test should take an integer and return its value.
	//This test checks positive numbers
	//This test should pass

	@Test
	public void convertToInt1(){
	int thing = 5;
	MainPanel main = new MainPanel(thing);
	int test, test2, test3;
	test = main.convertToInt(1);
	test2 = main.convertToInt(thing);
	test3 = main.convertToInt(10000);
	assertEquals(test, 1);
	assertEquals(test2, 5);
	assertEquals(test3, 10000);
	}
	
	//This test tests the convertToInt(int)  method in mainpanel to make sure it correctly returns an integer
	//The test should take an integer and return its value.
	//This test checks negative numbers
	//This test should pass
	@Test
	public void convertToInt2(){
	int thing = 5;
	MainPanel main = new MainPanel(thing);
	int test, test2, test3;
	test = main.convertToInt(-1);
	test2 = main.convertToInt(-5);
	test3 = main.convertToInt(-10000);
	assertEquals(test, -1);
	assertEquals(test2, -5);
	assertEquals(test3, -10000);
	}
	
	//This test tests the convertToInt(int)  method in mainpanel to make sure it correctly returns an integer
	//The test should take an integer and return its value.
	//This test checks zero
	//This test should pass
	@Test
	public void convertToInt3(){
	int thing = 5;
	MainPanel main = new MainPanel(thing);
	int test;
	test = main.convertToInt(0);
	assertEquals(test, 0);
	}
	
	
	

}
