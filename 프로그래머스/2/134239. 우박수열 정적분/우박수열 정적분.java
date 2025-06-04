import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        
        double[] answer = new double[ranges.length];
        
        List<Double> list = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        double num = k;
        list.add(num);
        int end = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            list.add(num);
        }
        
        for (int i = 0; i < list.size() - 1; i++) {
            double a = list.get(i);
            double b = list.get(i + 1);

            if (a > b) {
                list2.add(a + ((b - a) / 2));
            } else {
                list2.add(b + ((a - b) / 2));
            }
        }
        
        end = list.size() - 1;

        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i][0] < end + ranges[i][1]) {
                for (int j = ranges[i][0]; j < end + ranges[i][1]; j++) {
                    answer[i] += list2.get(j);
                }
            } else if (ranges[i][0] == end + ranges[i][1]) {

                answer[i] = 0.0;
            } else {
                answer[i] = -1.0;
            }

        }
    
        
        return answer;
    }
}