
import javafx.beans.property.SimpleStringProperty;

public class Table {
    private SimpleStringProperty num, temp;
    public String getNum() { return num.get();
    }
    public String getTemp() { return temp.get();
    }
    Table(String num, String temp ) {
        this.num = new SimpleStringProperty(num);
        this.temp = new SimpleStringProperty(temp);
    }
}
