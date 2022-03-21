package valdes.com.company;

public class Main {

    public static void main(String[] args) {

        DataTable dataTable=  new DataTable();
        dataTable.fillTable();
        System.out.println("Исходная таблица");
        dataTable.showAllTable();

        dataTable.deleteColumn();

        System.out.println("Обновленная");
        dataTable.showAllTable();

        dataTable.addRow();
        dataTable.showAllTable();
        System.out.println(dataTable.column("column_name2", 2));
        dataTable.setValue("Hello", 1,1);

        System.out.println("Обновленная");
        dataTable.showAllTable();
    }
}
