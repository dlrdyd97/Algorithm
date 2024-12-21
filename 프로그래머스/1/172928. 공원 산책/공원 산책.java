class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
		int[][] map = new int[park.length][park[0].length()];

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (park[i].charAt(j) == 'X') {
					map[i][j] = 1;
				} else if (park[i].charAt(j) == 'S') {
					answer[0] = i;
					answer[1] = j;
				}
			}
		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < routes.length; i++) {
			String strDir = routes[i].split(" ")[0];
			int Num = Integer.parseInt(routes[i].split(" ")[1]);

			loop: switch (strDir) {
			case "E":
				if (answer[1] + Num < map[0].length) {
					for (int j = answer[1] + 1; j <= answer[1] + Num; j++) {
						if (map[answer[0]][j] == 1) {
							break loop;
						}
					}
					answer[1] += Num;
				}
				break;
			case "W":
				if (answer[1] - Num >= 0) {
					for (int j = answer[1] - 1; j >= answer[1] - Num; j--) {
						if (map[answer[0]][j] == 1) {
							break loop;
						}
					}
					answer[1] -= Num;
				}
				break;
			case "S":
				if (answer[0] + Num < map.length) {
					for (int j = answer[0] + 1; j <= answer[0] + Num; j++) {
						if (map[j][answer[1]] == 1) {
							break loop;
						}
					}
					answer[0] += Num;
				}
				break;
			case "N":
				if (answer[0] - Num >= 0) {
					for (int j = answer[0] - 1; j >= answer[0] - Num; j--) {
						if (map[j][answer[1]] == 1) {
							break loop;
						}
					}
					answer[0] -= Num;
				}
				break;
			default:
				break;
			}

		}
        return answer;
    }
}