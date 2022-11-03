package 코테2022_11_03;
import java.util.Arrays;
public class createPhoneNumber {
    public String createPhoneNumber(int[] arr) {
        // TODO:

        String head;
        final int LENGTH = arr.length;
        if (LENGTH == 11) {
            head = Arrays.toString(Arrays.copyOfRange(arr, 0, 3))
                    .replace("[", "").replace(", ", "").replace("]", "");
        } else head = "010";


        String body = Arrays.toString(Arrays.copyOfRange(arr, LENGTH - 8, LENGTH - 4))
                .replace("[", "").replace(", ", "").replace("]", "");

        String tail = Arrays.toString(Arrays.copyOfRange(arr, LENGTH - 4, LENGTH))
                .replace("[", "").replace(", ", "").replace("]", "");

        return String.format("(%s)%s-%s", head, body, tail);
    }
}
