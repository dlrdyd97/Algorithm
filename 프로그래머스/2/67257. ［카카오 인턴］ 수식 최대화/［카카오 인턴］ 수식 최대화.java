import java.util.ArrayList;

class Solution {

    static ArrayList<String> arrayList;
    static long answer = 0;
    
    public long solution(String expression) {

        String[] op = {"-", "*", "+"};
        arrayList = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '+') {
                arrayList.add(expression.substring(start, i)); // 연산자 앞 숫자 추가
                arrayList.add(expression.charAt(i) + ""); // 연산자 추가 - * +
                start = i + 1;
            }
        }
        arrayList.add(expression.substring(start)); // 마지막 숫자 추가
        permutation(op, 0, op.length, op.length);
        return answer;
    }
    
    static void permutation(String[] arr, int depth, int n, int r) {
        if (depth == r) {
            ArrayList<String> copyArrayList = new ArrayList<>(arrayList);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < copyArrayList.size(); j++) {
                    if (arr[i].equals(copyArrayList.get(j))) {
                        copyArrayList.set(j - 1, calc(copyArrayList.get(j - 1), copyArrayList.get(j), copyArrayList.get(j + 1)));
                        copyArrayList.remove(j);
                        copyArrayList.remove(j);
                        j--;
                    }
                }
            }

            answer = Math.max(answer, Math.abs(Long.parseLong(copyArrayList.get(0))));
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(String[] arr, int depth, int i) {
        String temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    static String calc(String num1, String op, String num2) {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);

        if (op.equals("-")) {
            return n1 - n2 + "";
        } else if (op.equals("*")) {
            return n1 * n2 + "";
        } else {
            return n1 + n2 + "";
        }
    }
    
}