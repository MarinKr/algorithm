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
     StringTokenizer st = new StringTokenizer(br.readLine());

     String a = st.nextToken();
     String b = st.nextToken();

     List<String> listA = new ArrayList<String>();
     List<String> listB = new ArrayList<String>();

     String arrA[] = a.split("");
     String arrB[]= b.split("");

     for(int i= arrA.length-1; i>=0 ; i--){
         listA.add(arrA[i]);
     }
     for(int i= arrB.length-1; i>=0 ; i--){
         listB.add(arrB[i]);
     }

     String newSta="";
     String newStb ="";
     int newA = 0;
     int newB = 0;
     for (String x : listA) {
         newSta += x;
     }
     for (String x: listB){
         newStb += x;
     }
     newA = Integer.parseInt(newSta);
     newB = Integer.parseInt(newStb);

     if(newA>newB){
         System.out.println(newA);
     }else{
         System.out.println(newB);
     }



    }
}
