package q_168_excel_sheet_column_title;


public class Solution {


    private void test(String testName, int input, String expectedOutput) {
        System.out.println("*** Start " + testName);

        String s = this.convertToTitle(input);

        if(expectedOutput.equals(s)) {
            System.out.println("pass");
        } else {
            System.out.println("not pass, get: " + s + ", expected: " + expectedOutput);
        }
    }

    public void test() {

        this.test("test 1", 1, "A");
        this.test("test 2", 28, "AB");
        this.test("test 3", 701, "ZY");
        this.test("test 3", 26, "Z");
        this.test("test 4", 52, "AZ");
    }

    public String convertToTitle(int columnNumber) {

        StringBuilder columnNumberStr = new StringBuilder();

        int temp = columnNumber;

        while (temp > 26) {

            int module = temp % 26;
            temp = temp / 26;

            if(module == 0) {

                module = 26;
                temp -= 1;
            }
            System.out.println(module);
            System.out.println(temp);
            columnNumberStr.insert(0, convertIntToCol(module));
        }
        
        columnNumberStr.insert(0, convertIntToCol(temp));

        return columnNumberStr.toString();
    }

    private String convertIntToCol(int n) {
        return Character.toString(n + 64);
    }

}
