package 코테22년11월.코테2022_11_17;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    int count = 0;
    public static int fibonacci(int num){
        //TODO..
        if(num == 1) return 1;
        if(num == 0) return 0;
        return fibonacci(num -1) + fibonacci(num - 2);
    }
}
