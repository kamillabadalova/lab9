import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Controller{

    @FXML
    private LineChart<Integer, Integer> Chart;
    @FXML
    private NumberAxis xAxis;
    @FXML
    private NumberAxis yAxis;
    @FXML
    void initialize () throws IOException {
        ObservableList <XYChart.Series <Integer,Integer>> lineChart = FXCollections.observableArrayList();
        XYChart.Series <Integer,Integer> series = new XYChart.Series<>();

        String CsvFile="src/temp2.csv";
        String line;
        String delimiter = ";";
        BufferedReader br = new BufferedReader(new FileReader(new File(CsvFile)));
        while ((line=br.readLine()) != null ) {
            if (line.startsWith("04.2019",3)) {
                String[] fields = line.split(delimiter, 2);
                String[] fields1 = fields[0].split("\\.");
                series.getData().add(new XYChart.Data<>(Integer.parseInt(fields1[0]),Integer.parseInt(fields[1])));
            }
        }
        series.setName("Апрель");
        lineChart.add(series);
        Chart.setData(lineChart);
    }
}
