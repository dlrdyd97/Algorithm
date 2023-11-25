import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        int t = checkExt(ext);
        int sort = checkSortBy(sort_by);
        int size = 0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[sort] - o2[sort];
            }
        });

        for(int i=0;i<data.length;i++){
            if(val_ext>data[i][t]){
                size++;
            }
        }

        int[][] answer = new int[size][4];

        for(int i=0;i<data.length;i++){
            if(val_ext>data[i][t]){
                pq.add(data[i]);
            }
        }

        size = 0;
        while (!pq.isEmpty()) {
            answer[size++] = pq.poll();
        }

        return answer;
        
    }
    
    static int checkExt(String ext){
        if(ext.equals("code")){
            return 0;
        }else if(ext.equals("date")){
            return 1;
        }else if(ext.equals("maximum")){
            return 2;
        }else{
            return 3;
        }
    }

    static int checkSortBy(String sort_by){
        if(sort_by.equals("code")){
            return 0;
        }else if(sort_by.equals("date")){
            return 1;
        }else if(sort_by.equals("maximum")){
            return 2;
        }else{
            return 3;
        }
    }
}