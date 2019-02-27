package work;

import java.util.ArrayList;

public class HelloPlanets {

	public static void main(String[] args) {

		ArrayList<String> stringArrayList = new ArrayList<String>();
		{
			stringArrayList.add("Earth");
			stringArrayList.add("Jupiter");
			stringArrayList.add("Venus");
			stringArrayList.add("Mars");
			stringArrayList.add("Neptune");
			stringArrayList.add("Uranus");
			stringArrayList.add("Mercury");
			stringArrayList.add("Saturn");

			for (int i = 0; i < 8; i++)

			{
				System.out.println("Hello" + stringArrayList.get(i));
			}

		}

	}
}
