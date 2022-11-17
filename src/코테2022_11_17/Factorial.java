package 코테2022_11_17;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int factorial(int num){
        //TODO..
        if(num == 0) return 1;
        return num * factorial(num -1);
    }
}
