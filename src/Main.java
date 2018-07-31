public class Main {

    public static void main(String[] args) {
        int[] fibonacciTest = new int[]{1,2,3,4,5,6,7,8};
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        int length = fibonacciSequence.length(fibonacciTest);

        System.out.println("数组fibonacciTest中，最长裴波那切的长度为" + length);
        System.out.println("呵呵");
    }
}
