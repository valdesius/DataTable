package valdes.com.company;

import java.util.ArrayList;
import java.util.HashMap;

public interface Table{

    HashMap<String, ArrayList> column(String s, int column);

    public ArrayList addRow();
    public ArrayList deleteRow();

    public ArrayList addColumn();
    public ArrayList deleteColumn();

    public String readStr();
    public int readNum();

    public void showAllTable();
}
