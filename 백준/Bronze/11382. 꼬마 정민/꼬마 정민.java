import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0;
        while (st.hasMoreTokens()){
            sum += Long.parseLong(st.nextToken());
        }

        System.out.println(sum);
		
	}

}