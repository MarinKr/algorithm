import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<Integer> li = new ArrayList<Integer>();


        for(int i=0; i<n; i++){
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
            li.add(a*b);
        }
        int sum =0;
        for(int i : li){
        sum += i;
        }
//        System.out.println(sum);
        if(sum==x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
