import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    int arr[] = new int[n];
    for (int i=0; i<n; i++){
        arr[i]=(Integer.parseInt(st.nextToken()));
    }
    Arrays.sort(arr);


    for(int i=0; i<n; i++){
        for(int j = 2; j< (int)Math.sqrt(arr[i])+1; j++){
            if(arr[i]%j==0){
                arr[i]=0;
            }
        }
    }
//        System.out.println(Arrays.toString(arr));

    int count = n;
    for(int x : arr){
        if(x==0||x==1){
            count--;
        }
    }

        System.out.println(count);

    }

    }
