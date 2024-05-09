import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        ArrayList<Integer> arrayList = new ArrayList<>();

        commonDivisor(arrayList, arrayA);
        if (arrayList.size() > 0) {
            answer = checkDivisor(arrayList, arrayB, answer);
        }
        arrayList.clear();
        commonDivisor(arrayList, arrayB);
        if (arrayList.size() > 0) {
            answer = checkDivisor(arrayList, arrayA, answer);
        }
        return answer;
    }
    
    static void commonDivisor(ArrayList<Integer> arrayList, int[] arr) {

        for (int i = 2; i <= arr[0]; i++) {
            arrayList.add(i);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0) {
                    arrayList.remove(arrayList.size() - 1);
                    break;
                }
            }
        }
    }

    static int checkDivisor(ArrayList<Integer> arrayList, int[] arr, int a) {

        for (int num : arrayList) {
            if (a < num) {
                int b = a;
                a = num;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] % num == 0) {
                        a = b;
                        break;
                    }
                }
            }
        }

        return a;
    }
    
}