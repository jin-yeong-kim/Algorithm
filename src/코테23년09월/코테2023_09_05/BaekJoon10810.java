package 코테23년09월.코테2023_09_05;

import 코테22년11월.코테2022_11_22.Stack;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        int[] result = new int[input[0]];
        for (int i = 0; i < input[1]; i++) {
            int[] num = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            for (int j = num[0]; j <= num[1]; j++) {
                result[j-1] = num[2];
            }
        }
        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
    }
    /*public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer로 N과 M, " "(공백)으로 구분

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for (int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }*/
}
