public class TestMax {
    /**Main Method */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + + k);
    }

    /** Return the max of two numbers */
    public static int max(int num1, int num2){
        int result;

        result = (num1 > num2)? num1 : num2;

        /*

        if(num1 > num2)
            result = num1;
        else
            result = num2;

         */

        return  result;

    }

}
