import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> fdzz = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				fdzz.add(arr[i]);
			}
		}
        return fdzz;
    }
}