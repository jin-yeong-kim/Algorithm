package 코테2022_12_07;

public class Modulo {
    public static void main(String[] args) {
        Integer output = modulo(25, 4);
        System.out.println(output);
    }
    public static Integer modulo(int num1, int num2) {
        // TODO:
        if(num2 == 0) {
            return null;
        }
        while(num1 >= num2) {
            num1 -= num2;
        }
        return num1;
    }
}
