package 코테2022_11_17;

public class IsOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(17));
        System.out.println(isOdd(-8));
    }
    public static boolean isOdd(int num) {
        //TODO..
        num = Math.abs(num);
        if(num == 0){
            return false;
        } else if(num == 1) {
            return true;
        }
        num -= 2;
        return isOdd(num);
    }
}
