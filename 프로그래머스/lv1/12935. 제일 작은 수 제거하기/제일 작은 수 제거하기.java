import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> fdzz = new ArrayList<>();

		if (arr.length != 1) {
			int[] arr2 = arr.clone();
			Arrays.sort(arr2);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr2[0]) {
					fdzz.add(arr[i]);
				}
			}
		} else {
			fdzz.add(-1);
		}
        return fdzz;
    }
}