import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.io.*;

public class Controller2 {
    @FXML
    LineChart<Integer, Integer> Chart;
    @FXML
    NumberAxis xAxis;
    @FXML
    NumberAxis yAxis;

    @FXML
    void initialize() throws IOException {
        ObservableList<XYChart.Series<Integer, Integer>> lineChart = FXCollections.observableArrayList();
        XYChart.Series<Integer, Integer> series = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series1 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series2 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series3 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series4 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series5 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series6 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series7 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series8 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series9 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series10 = new XYChart.Series<>();
        XYChart.Series<Integer, Integer> series11 = new XYChart.Series<>();

        BufferedReader br;
        String CsvFile = "src/temp2.csv";
        String line;
        String delimiter = ";";
        br = new BufferedReader(new FileReader(new File(CsvFile)));
        while ((line = br.readLine()) != null) {
            if (line.startsWith("01.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("02.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series1.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("03.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series2.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("04.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series3.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("05.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series4.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("06.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series5.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("07.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series6.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("08.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series7.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("09.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series8.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("10.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series9.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("11.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series10.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
            if (line.startsWith("12.2019", 3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series11.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]), Integer.parseInt(fields[1])));
            }
        }
        series.setName("Январь");
        lineChart.add(series);
        Chart.setData(lineChart);

        series1.setName("Февраль");
        lineChart.add(series1);
        Chart.setData(lineChart);

        series2.setName("Март");
        lineChart.add(series2);
        Chart.setData(lineChart);

        series3.setName("Апрель");
        lineChart.add(series3);
        Chart.setData(lineChart);

        series4.setName("Май");
        lineChart.add(series4);
        Chart.setData(lineChart);

        series5.setName("Июнь");
        lineChart.add(series5);
        Chart.setData(lineChart);

        series6.setName("Июль");
        lineChart.add(series6);
        Chart.setData(lineChart);

        series7.setName("Август");
        lineChart.add(series7);
        Chart.setData(lineChart);

        series8.setName("Сентябрь");
        lineChart.add(series8);
        Chart.setData(lineChart);

        series9.setName("Октябрь");
        lineChart.add(series9);
        Chart.setData(lineChart);

        series10.setName("Ноябрь");
        lineChart.add(series10);
        Chart.setData(lineChart);

        series11.setName("Декабрь");
        lineChart.add(series11);
        Chart.setData(lineChart);
    }
}
