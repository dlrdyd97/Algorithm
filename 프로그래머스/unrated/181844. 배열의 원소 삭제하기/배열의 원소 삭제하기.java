import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
       ArrayList<Integer> fdzz = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			fdzz.add(arr[i]);
		}

		for (int i = 0; i < delete_list.length; i++) {
			if (fdzz.contains(delete_list[i]))
				fdzz.remove(fdzz.indexOf(delete_list[i]));
		}
        return fdzz;
    }
}