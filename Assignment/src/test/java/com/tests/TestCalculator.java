package com.tests;

import org.junit.Test;

import com.stuff.utilities.Calculator;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    final Calculator calculate = new Calculator();

    @Test
    public void testFrequencyOfLetterInSentence_return1() {
        int actual = calculate.frequency("a", "abc");
        assertEquals(1, actual);
    }

    @Test
    public void testFrequencyOfLetterInSentence_return3() {
        int actual = calculate.frequency("z", "zzz");
        assertEquals(3, actual);
    }

    @Test
    public void testRelativeFrequency_return100When100PercentFrequent() {
        double actual = calculate.relativeFrequency("z", "zzz");
        assertEquals(100, actual, 0);
    }

    @Test
    public void testRelativeFrequency_return50When50PercentFrequent() {
        double actual = calculate.relativeFrequency("a", "aabb");
        assertEquals(50, actual, 0);
    }

    @Test
    public void testRelativeFrequency_roundToNearestWholeNumber() {
        double actual = calculate.relativeFrequency("a", "abc");
        assertEquals(33, actual, 0);
    }
    
    @Test
    public void testNumberOfCharactersInSentence_ReturnsNine() {
    	final int actualoutcome = calculate.numberOfCharacters("Hi Lauren");
    	assertEquals(9, actualoutcome);
    }
    
    @Test 
    public void testNumberOfCharactersInSentence_ReturnsTwo() {
    	final int actualOutcome = calculate.numberOfCharacters("Hi");
    	assertEquals(2, actualOutcome);
    }
    
    @Test
    public void testNumberOfWordsInSentence_ReturnsFive() {
    	final int actualOutcome = calculate.numberOfWords("Hi My Name is Lauren");
    			assertEquals(5, actualOutcome);
    }
    
    @Test 
    public void testNumberOfWordsInSentence_ReturnsOne() {
    	final int actualOutcome = calculate.numberOfWords("Hi");
    	assertEquals(1, actualOutcome);
    }
    
    @Test 
    public void testNumberOfSpecialCharacters_ReturnsFive() {
    	final int actualOutcome = calculate.numberOfSpecialCharacters("*()_-");
    	assertEquals(5, actualOutcome);
    }
    
    @Test 
    public void testNumberOfSpecialCharacters_ReturnsOne() {
    	final int actualOutcome = calculate.numberOfSpecialCharacters("&");
    	assertEquals(1, actualOutcome);
    }
}
