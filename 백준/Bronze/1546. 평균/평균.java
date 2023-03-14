import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(br.readLine()); // 과목 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        double arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        double total=0;
        double max = 0;
        if(n==1){
            max = arr[0];
            total = arr[0];
        }else {
            for (int i = 0; i < arr.length; i++) {
                if(max<arr[i]){
                    max = arr[i];
                }
                total += arr[i];
            }
        }
//        System.out.println(total + "total");
//        System.out.println(max + "max");
        double newScore = total/max*100/n;
        System.out.println(newScore);
    }
}
