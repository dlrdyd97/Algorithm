class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        String check = "";

        for (int i = 0; i < skill_trees.length; i++) {

            check = skill_trees[i].replaceAll("[^"+skill+"]", "");
            if(check.equals(skill.substring(0,check.length()))){
                answer++;
            }

        }
        return answer;
    }
}