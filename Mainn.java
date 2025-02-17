public class Mainn {
    // Method with varargs parameter
    public static int sum(int... numbers) {
        int total = 0;
        // Loop through the array 'numbers' and add them
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));  // Output: 6
        System.out.println(sum(10, 20, 30, 40));  // Output: 100
        System.out.println(sum());  // Output: 0 (no arguments passed)
    }


}
