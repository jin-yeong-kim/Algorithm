package 코테22년12월.코테2022_12_09;

public class ComputeSquareRoot {
    public static void main(String[] args) {
        String output = computeSquareRoot(9);
        System.out.println(output);
    }
    public static String computeSquareRoot(int num) {
        // TODO:
        double[] db = new double[] {1,0.1,0.01,0.001};
        double result = 2;
        for(int i = 0; i < db.length; i++) {
            while(result * result < num) {
                result = result + db[i];
            }
            if(result * result == num) {
                return String.format("%.2f", result);
            } else {
                result = result - db[i];
            }
        }
        return String.format("%.2f", result);
    }
}
