package 코테2022_11_18;

public class ComputeWhenDouble {
    public static void main(String[] args) {
        int output = computeWhenDouble(7);
        System.out.println(output); // --> 11

        output = computeWhenDouble(10);
        System.out.println(output);
    }
    public static int computeWhenDouble(double interestRate) {
        // TODO:
        double rate = 1 + interestRate / 100;
        double principal = 1;
        int year = 0;
        while (principal < 2) {
            principal = principal * rate;
            year++;
        }
        return year;
    }
}
