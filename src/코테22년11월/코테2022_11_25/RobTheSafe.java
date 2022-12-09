package 코테22년11월.코테2022_11_25;

public class RobTheSafe {
    public static void main(String[] args) {
        long output = ocean(50, new int[]{10, 20, 50});
        System.out.println(output);
    }
    public static long ocean(int target, int[] type) {
        // TODO:
        long[] bag = new long[target + 1];
        bag[0] = 1;
        for(int i = 0;i < type.length; i++) {
            for(int j = 1;j <= target; j++) {
                if(type[i] <= j) {
                    bag[j] += bag[j - type[i]];
                }
            }
        }
        return bag[target];
    }
}
