import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataTable implements Table {
    private HashMap<String, ArrayList> stringHashMap = new HashMap();
    private ArrayList<ArrayList<String>> mainList = new ArrayList<>();

    public DataTable() {
    }

    public void setValue(String value, int row, int column) {
        mainList.get(row-1).set(column-1, String.valueOf(value));

    }

    @Override
    public HashMap<String, ArrayList> column(String s, int column) {
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i <= mainList.size()-1; i++) {
            names.add(mainList.get(i).get(column-1));
        }

        stringHashMap.put("column_name2", names);
        return stringHashMap;
    }

    @Override
    public ArrayList addRow() {
        ArrayList<String> newRow = new ArrayList<>();
        System.out.println("Какое количество элементов в строку добавить? ");
        int row = readNum();

        for (int i = 0; i < row; i++){
            newRow.add(readStr());
        }

        mainList.add(newRow);
        return mainList;
    }

    @Override
    public ArrayList deleteRow() {
        System.out.println("Какую строку удалить? ");
        int rows = readNum();
        mainList.remove(mainList.get(rows));

        return mainList;
    }

    @Override
    public ArrayList addColumn() {
        ArrayList<String> newColumn = new ArrayList<>();
        System.out.println("Введите столбец ");
        int column = mainList.size();

        for (int i = 0; i < column; i++) {
            newColumn.add(readStr());
            mainList.get(i).add(newColumn.get(0));
        }

        return mainList;
    }

    @Override
    public ArrayList deleteColumn() {
        System.out.println("Какой столбец удалить? ");
        int column = readNum();
        for (int i = 0; i <= mainList.size()-1; i++) {
            mainList.get(i).remove(column-1);
        }

        return mainList;

    }

    @Override
    public String readStr() {
        Scanner scanner=  new Scanner(System.in);
        String str = scanner.next();
        return str;
    }

    @Override
    public int readNum() {
        Scanner scanner=  new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public ArrayList fillTable(){
        ArrayList<String> row1 = new ArrayList<>();
        row1.add("iPhone");
        row1.add("Samsung");
        row1.add("Xiaomi");

        mainList.add(row1);

        ArrayList<String> row2 = new ArrayList<>();
        row2.add("Lada");
        row2.add("BMW");
        row2.add("Subaru");
        mainList.add(row2);

        ArrayList<String> row3 = new ArrayList<>();
        row3.add("Table");
        row3.add("Chair");
        row3.add("Bed");
        mainList.add(row3);
        return mainList;
    }

    @Override
    public void showAllTable() {
        for (int i = 0; i < mainList.size(); i++) {
            System.out.println(mainList.get(i));
        }
    }

}
