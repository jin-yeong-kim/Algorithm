package 코테23년01월.코테2023_01_15;

/*
백준 1978번

문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력 1
4
1 3 5 7
예제 출력 1
3*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IsPrime {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] input = br.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (num % 2 != 0 && num > 1) {count++;}
        }
        System.out.println(count); 결과는 맞는데 왠지 백준에서 통과가 안됨..
    }*/
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();	// N 은 쓰지 않음.
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()) {

            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if(num == 1) {
                continue;
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}
