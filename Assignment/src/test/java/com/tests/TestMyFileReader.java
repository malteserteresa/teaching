package com.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.stuff.utilities.MyFileReader;


public class TestMyFileReader {

	String file = "UserInput.txt";
	final MyFileReader readFile = new MyFileReader();

	@Test 
	public void testGetStringFromAFile() throws IOException {
		final String actualOutcome = readFile.reader("UserInput.txt");
		
		final String expectedOutcome = "Hi my name is Lauren! (i am learning java) 12345678910 & [java is cool] bfjbjkdbfbsdjf343765890-987654324765890-=hdbj kcn 09uryr9hb 02340y3h5r,./.,;,mp[r>>>@.£%$&$&dhoifhij";
		assertEquals(expectedOutcome, actualOutcome);
	}
}
