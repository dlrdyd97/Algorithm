class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int last = 0; // 연속성공
        int monster = 0; // 몬스터의 행동
        int fullHP = health; // 최대체력

        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            if (i != attacks[monster][0]) { // 몬스터의 공격이 없으면

                health += bandage[1]; // x만큼 체력회복
                last++; // 연속성공 추가
                if (last == bandage[0]) { // 추가회복 조건에 달성하면
                    health += bandage[2];
                    last = 0;
                    System.out.println("추가 회복을 합니다");
                }

                if (health > fullHP) { // 최대체력을 넘어가면 현재 hp를 최대체력으로 지정
                    health = fullHP;
                }

            } else { // 몬스터가 공격하면
                last = 0; // 체력회복 연속성공 초기화
                health -= attacks[monster][1];
                monster++;
            }

            System.out.println("현재 체력 : " + health);
            if (health <= 0) {
                answer = -1;
                break;
            } else {
                answer = health;
            }
        }
        return answer;
    }
}