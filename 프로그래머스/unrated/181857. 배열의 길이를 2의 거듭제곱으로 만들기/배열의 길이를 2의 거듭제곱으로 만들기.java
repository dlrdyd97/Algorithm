import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> fdzz = new ArrayList<>();
        //int check = 0;
        int check = 1;
		// for (int i = 0; i < 11; i++) {
		// 	if (Math.pow(2, i) >= arr.length) {
		// 		check = (int) Math.pow(2, i);
		// 		break;
		// 	}
		// }
        for (int i = 0; i < 11; i++) {
			if (Math.pow(2, i) < arr.length) {
				check *= 2;
			}
		}
		for (int i = 0; i < check; i++) {
			if (i < arr.length)
				fdzz.add(arr[i]);
			else
				fdzz.add(0);
		}
        return fdzz;
    }
}