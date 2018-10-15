package exectution;

class ArrayManip {

    private static int sum = 0;

    static int sumArray(int[] arr) {

        //for i in arr
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
