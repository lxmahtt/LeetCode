package leetCode;

public class Main {

    public static void main(String[] args) {
        //数组中最长裴波那切数列
        int[] fibonacciTest = new int[]{1,2,3,4,5,6,7,8};
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        int length = fibonacciSequence.length(fibonacciTest);

        System.out.println("数组fibonacciTest中，最长裴波那切的长度为" + length);
        System.out.println("呵呵");

        int[] robotCommands = new int[]{1,-1,3,-2,4,-1,6};
        int[][] robotObstacles = new int[][]{{2,1}};
        RobotDistance robotDistance = new RobotDistance();
        int robotSim = robotDistance.robotSim(robotCommands, robotObstacles);
        System.out.println("距离" + robotSim);

    }
}
