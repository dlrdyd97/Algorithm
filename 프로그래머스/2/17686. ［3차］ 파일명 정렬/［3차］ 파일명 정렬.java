import java.util.*;

class Solution {
    public String[] solution(String[] files) {
         Arrays.sort(files,((o1, o2) -> {
            int result = splitHead(o1).compareTo(splitHead(o2));
            if(result==0){
                if (splitNumber(o1) == splitNumber(o2)) {
                    return result;
                } else {
                    if (splitNumber(o1) > splitNumber(o2)){
                        return 1;
                    }else{
                        return -1;
                    }
                }

            }else{
                return result;
            }

        }));
        
        return files;
    }
    
        static String splitHead(String a){

        StringBuilder sbH=new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (!Character.isDigit(a.charAt(i))) {
                sbH.append(a.charAt(i));
            } else {
                break;
            }
        }

        return sbH.toString().toLowerCase();
    }

    static int splitNumber(String a){

        StringBuilder sbN=new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i)) && sbN.length() < 5) {
                sbN.append(a.charAt(i));
            } else if (sbN.length() != 0 && !Character.isDigit(a.charAt(i))) {
                break;
            }
        }

        return Integer.parseInt(sbN.toString());
    }
    
}