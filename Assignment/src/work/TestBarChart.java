package work;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.Color;

import org.junit.Test;

public class TestBarChart {

	private double[] values = { 2, 4, 6, 8, 10 };
	private String[] labels = { "C", "D", "E", "F" };
	private Color[] colors = { Color.black, Color.blue, Color.pink, Color.gray };
	private String title;
	BarChart barChart = new BarChart(values, labels, colors, title);

	@Test
	public void testValues() {
		double[] valuesInChart = barChart.values;
		double[] newValues = { 2, 4, 6, 8, 10 };
		assertThat(valuesInChart).isEqualTo(newValues);
		// Changed Values to 2 4 6 8 10
	}

	@Test
	public void testLabels() {
		String[] labelsInChart = barChart.labels;
		String[] newLabels = { "C", "D", "E", "F" };
		assertThat(labelsInChart).isEqualTo(newLabels);
		// Changes Labels to C D E F
	}

	@Test
	public void testColors() {
		Color[] colorsInChart = barChart.colors;
		Color[] newColors = { Color.black, Color.blue, Color.pink, Color.gray };
		assertThat(colorsInChart).isEqualTo(newColors);
	}
}
