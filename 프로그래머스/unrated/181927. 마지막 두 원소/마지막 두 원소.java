class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = {};
        
        int a = 0;
		int b = 0;

		int[] fdzz = new int[num_list.length + 1];

		for (int i = 0; i < num_list.length; i++) {
			fdzz[i] = num_list[i];
		}

		if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
			fdzz[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
		} else {
			fdzz[num_list.length] = num_list[num_list.length - 1] * 2;
		}
        
        return fdzz;
    }
}