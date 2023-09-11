class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        char[] arr = control.toCharArray();

		int w = 0, a = 0, s = 0, d = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'w') {
				n++;
			} else if (arr[i] == 's') {
				n--;
			} else if (arr[i] == 'd') {
				n += 10;
			} else {
				n -= 10;
			}
		}
        
        return n;
    }
}