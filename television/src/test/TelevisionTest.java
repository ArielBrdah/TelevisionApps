package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.STATE;
import model.Television;

class TelevisionTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	// this test is not good
	@Test
	void televisionInstanciation() {
		
		//television instance works ?
		Television television  = Television.getInstance();
	}
	
	@Test
	void televisionONorOFF() {
		
		//did switch worked ?
		Television television  = Television.getInstance();
		television.on();
		assertEquals(STATE.ON,television.getStatus());
		television.off();
		assertEquals(STATE.OFF,television.getStatus());
	}
	
	
	
	

}
