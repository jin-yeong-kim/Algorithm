package 코테22년11월.코테2022_11_17;

public class SumTo {
    public static void main(String[] args) {
        System.out.println(sumTo(10));
    }
    public static int sumTo(int num){
        //TODO..
        if(num == 0) return 0;
        return num + sumTo(num - 1);
    }
}
