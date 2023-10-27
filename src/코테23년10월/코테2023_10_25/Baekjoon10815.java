package 코테23년10월.코테2023_10_25;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10815 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int main = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < main; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (binarySearch(n)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.close();
        br.close();
    }

    public static boolean binarySearch(int num) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = arr[midIndex];

            if (num < mid) {
                rightIndex = midIndex - 1;
            } else if (num > mid) {
                leftIndex = midIndex + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
