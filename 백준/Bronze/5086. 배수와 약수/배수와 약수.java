import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<int[]> li = new ArrayList<>();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            }
            li.add(new int[]{a, b});
        }
        for(int i=0; i<li.size(); i++){
           int arr[] = li.get(i);
           if(arr[1]%arr[0]==0){
               System.out.println("factor");
           } else if (arr[0]%arr[1]==0) {
               System.out.println("multiple");
           }else{
               System.out.println("neither");
           }
        }
    }
}