package exectution;

class Main {
    private static int[] arr = {5, 2, 7, 5, 65};
    private static int sum = 0;

    public static void main(String[] args) {

        for(int i = 0; i < Main.arr.length; i++)
        {
            Main.sum += Main.arr[i];
        }

        System.out.println(Main.sum);
    }
}
