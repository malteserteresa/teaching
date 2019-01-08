package tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ComputingConceptsTest {
	
	@Test
	// Chapter 3
	public void testAliasing() {
		// when a person is called Sam but they have another name, say Tina, their
		// second name is an alias.
		// Can you see how this logic applies here?

		Person dad = new Person("Ash");
		Person mum = dad;
		dad.setName("John");

		assertEquals("Ash", mum.getName()); // why do we not get Ash?
		assertEquals("John", dad.getName());
	}

	@Test
	// Chapter 3
	public void testEquals() {
		// Java loves objects. Each time we make a new object (person1 & 2) there is a
		// bit of memory allocated to each object.
		// What this means is that equals gets mixed up. Can you explain what you see
		// here and tell me why?
		Person personOne = new Person("Ash");
		Person personTwo = new Person("Ash");
		assertTrue(personOne.equals(personTwo));
		assertTrue(personOne == personTwo);
	}

}
