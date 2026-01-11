public class ArrayWithMethods {

    /*
     This method receives an array
     and calculates the total value
    */
    static int calculateSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] prices = {100, 200, 300};

        int total = calculateSum(prices);

        System.out.println("Total price: " + total);
    }
}
