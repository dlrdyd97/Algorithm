import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> arList = new ArrayList<>();

        for (int i = 0; i < orders.length; i++) {
            char[] charr = orders[i].toCharArray();
            Arrays.sort(charr); // 문자열 정렬


            for (int j = 0; j < course.length; j++) {
                if (charr.length >= course[j]) {
                    List<String> combinations = generateCombinations(String.valueOf(charr), course[j]);

//                     생성된 조합 출력
                    for (String combination : combinations) {
                        hm.put(combination, hm.getOrDefault(combination, 0) + 1);
                    }
                }
            }

        }

        ArrayList<String> maxString = new ArrayList<>();

        for (int i = 0; i < course.length; i++) {
            int max = 2;
            for (String z : hm.keySet()) {
                if (hm.get(z) > 1 && z.length() == course[i]) {
                    if (hm.get(z) == max) {
                        maxString.add(z);
                    } else if (hm.get(z) > max) {
                        maxString.clear();
                        maxString.add(z);
                        max = hm.get(z);
                    }
                }
            }

            for (String maxStr : maxString) {
                arList.add(maxStr);
            }
            maxString.clear();
        }


        Collections.sort(arList);

        String[] answer = arList.toArray(new String[0]);
        return answer;
    }
    
    // 문자열에서 길이가 length인 중복되지 않는 모든 가능한 조합을 생성하는 함수
    public static List<String> generateCombinations(String input, int length) {
        List<String> combinations = new ArrayList<>();
        generateCombinationsRecursive(combinations, input, length, "", 0);
        return combinations;
    }

    // 재귀적으로 중복되지 않는 조합을 생성하는 함수
    public static void generateCombinationsRecursive(List<String> combinations, String input, int length, String current, int index) {
        if (current.length() == length) {
            combinations.add(current);
            return;
        }
        for (int i = index; i < input.length(); i++) {
            generateCombinationsRecursive(combinations, input, length, current + input.charAt(i), i + 1);
        }
    }
    
}