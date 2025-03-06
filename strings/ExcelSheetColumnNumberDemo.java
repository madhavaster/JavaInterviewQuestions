package strings;

public class ExcelSheetColumnNumberDemo {
    public static void main(String[] args) {
        int columnValue = excelColumnValue("AB");
        System.out.println(columnValue);
    }

    public static int excelColumnValue(String column) {
        char[] charArray = column.toCharArray();
        int result = 0;
        for (char c : charArray) {
            result = result * 26 + c - 65 + 1;
        }
        return result;
    }
}
