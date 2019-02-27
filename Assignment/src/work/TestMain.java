package work;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class TestMain {

	Main main = new Main();
	String line = "Hello";

	@Test
	public void testMainObject() {
		assertNotNull(main);
	}

	@Test
	public void testFileInputHandler() throws IOException {
		String result = main.fileInputHandler();
		assertTrue(line.equals(result));
	}

	@Test
	public void testCharacterCounterHandler() {
		int[] result = main.characterCountHandler("a");
		assertTrue(result[0] == 1);
	}

	@Test
	public void testCharacterCounts_FileInputString() throws IOException {
		String fileInput = main.fileInputHandler();
		int[] characterCount = main.characterCountHandler(fileInput);
		assertTrue(characterCount[7] == 1);
	}

	@Test
	public void testBarChartHandler() {
		int[] characterCounts = null;
		main.barChartHandler(characterCounts);

	}

}
