package com.stuff.table;

public class Table {

	private final Header header = new Header();
	private final Body body = new Body();

	public void create(String inputtedSentence) {
		header.print();
		// prints the header created in the header class
		body.printRows(inputtedSentence);
		// prints the body of the table created in Body class including the sentence it has been given
	}

}
