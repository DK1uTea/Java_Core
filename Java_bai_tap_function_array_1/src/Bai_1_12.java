import java.util.Scanner;

public class Bai_1_12 {
    public static int[] eliminateDuplicates (int[] list){
        int[] result = new int[list.length];
        int resultSize = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < resultSize; j++) {
                if (list[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[resultSize] = list[i];
                resultSize++;
            }
        }
        int[] trimmedResult = new int[resultSize];
        System.arraycopy(result, 0, trimmedResult, 0, resultSize);
        return trimmedResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] newArr = Bai_1_12.eliminateDuplicates(arr);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
