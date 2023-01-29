package 코테23년01월.코테2023_01_30;

/*문제
정수를 요소로 갖는 문자열을 입력받아 다음의 조건을 만족하는 LIS*의 길이를 리턴해야 합니다.

LIS: 배열의 연속되지 않는 부분 배열 중 모든 요소가 엄격하게 오름차순으로 정렬된 가장 긴 부분 배열(Longest Increasing Subsequence)
배열 [1, 2, 3]의 subsequence 는 [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3] 입니다.
엄격한 오름차순: 배열이 동일한 값을 가진 요소없이 오름차순으로 정렬되어 있는 경우를 말합니다.

입력
인자 1 : arr
int 타입을 요소로 갖는 배열
arr.length 는 60,000 이하
arr[i]는 100,000 이하의 양의 정수
출력
int 타입을 리턴해야 합니다.

주의사항
LIS 의 길이를 리턴해야 합니다.
LIS 가 존재하지 않는 경우는 없습니다.
입출력 예시
int output = LIS(new int[]{3, 2});
System.out.println(output); // --> 1 (3 or 2)

output = LIS(new int[]{3, 10, 2, 1, 20});
System.out.println(output); // --> 3 (3, 10, 20)

Advanced
LIS 를 계산하는 효율적인 알고리즘(O(N^2))이 존재합니다. 쉽지 않기 때문에 바로 레퍼런스 코드를 보고 이해하는 데 집중하시기 바랍니다.
subsequence 는 문자열 또는 배열같이 순서가 있는 데이터에서 순서의 대소 관계가 유지되는 모든 부분 문자열 또는 부분 배열을 의미합니다. sequence 가
순서 또는 서열을 의미하기 때문에 subsequence 는 부분 서열이라고 부르기도 합니다. 반면 substring 또는 sub array 는 연속된 형태의 부분 문자열 또는 부분
배열을 의미합니다. 문자열 "abcd"의 subsequence 와 substring 은 각각 아래와 같습니다.
substring: "a", "b", "c", "d", "ab", "bc", "cd", "abc", "bcd", "abcd"
subsequence: "a", "b", "c", "d", "ab", "ac", "ad", "bc", "bd", "cd", "abc", "abd", "acd", "bcd", "abcd"
LIS 의 길이 대신 LIS 자체를 리턴하는 함수를 구현해 보시기 바랍니다.
*/

import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int output = LIS(new int[]{3, 2});
        System.out.println(output); // --> 1 (3 or 2)

        output = LIS(new int[]{3, 10, 2, 1, 20});
        System.out.println(output); // --> 3 (3, 10, 20)
    }

    public static int LIS(int[] arr) {
        int N = arr.length;
        // lis[i]는 i에서 끝나는 LIS 의 길이를 저장
        // 최소한 각 요소 하나로 LIS 를 만들 수  있으므로 1로 초기화한다.
        int[] lis = new int[N];
        Arrays.fill(lis, 1);
        for (int i = 1; i < N; i++) {
            // i에서 끝나는 LIS 의 길이
            for (int j = 0; j < i; j++) {
                // i 이전의 인덱스만 검사하면 된다.
                // i는 1부터 시작하므로, 짧은 길이부터 검사한다. (bottom-up 방식)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        return Arrays.stream(lis).max().getAsInt();
    }
}
