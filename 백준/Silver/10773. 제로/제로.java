import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            int number = Integer.parseInt(br.readLine());
            if(number==0){
                stack.pop();
            }else {
                stack.push(number);
            }
        }
        int sum =0;
        for(int x:stack){
            sum+=x;
        }
        System.out.println(sum);
    }

}
