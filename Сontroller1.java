
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controller1 {
    @FXML
    TableColumn<Table,String> columnNum;
    @FXML
    TableColumn<Table,String> columnTemp;
    @FXML
    Button button;
    @FXML
    TableView<Table> tableView;
    @FXML
    ComboBox month;
    String CsvFile = "src/temp2.csv";
    String delimiter = ";";
    BufferedReader br;

    private ObservableList <Table> list = FXCollections.observableArrayList();
    @FXML
    public void onClickMethod(ActionEvent actionEvent) throws IOException {
        if(month.getValue().equals("январь")){
            readCSV1();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("февраль")){
            readCSV2();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("март")){
            readCSV3();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("апрель")){
            readCSV4();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("май")){
            readCSV5();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("июнь")){
            readCSV6();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("июль")){
            readCSV7();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("август")){
            readCSV8();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("сентябрь")){
            readCSV9();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("октябрь")){
            readCSV10();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("ноябрь")){
            readCSV11();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }
        if(month.getValue().equals("декабрь")){
            readCSV12();
            columnNum.setCellValueFactory(new PropertyValueFactory<>("num"));
            columnTemp.setCellValueFactory(new PropertyValueFactory<>("temp"));
            tableView.setItems(list);
        }


    }
    private void readCSV1() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("01.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
                System.out.println(ex.getMessage());
            }
    }
    private void readCSV2() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("02.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV3() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("03.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV4() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("04.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV5() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("05.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV6() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("06.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV7() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("07.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV8() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("08.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV9() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("09.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV10() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("10.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV11() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("11.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    private void readCSV12() throws IOException {
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("12.2019", 3)) {
                    String[] fields = line.split(delimiter, 2);
                    String[] fields1 = fields[0].split("\\.");
                    Table table = new Table(fields1[0], fields[1]);
                    list.add(table);
                }
            }
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
