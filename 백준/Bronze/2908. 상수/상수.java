import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


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
        Iterator<String> it = listA.iterator();
        Iterator<String> its = listB.iterator();
     String newA = "";
     String newB = "";
     while(it.hasNext()) {

                 newA += it.next();
             }
     while(its.hasNext()) {

                 newB += its.next();
             }
    int newNumA;
     int newNumB;

     newNumA = Integer.parseInt(newA);
     newNumB = Integer.parseInt(newB);

     if(newNumA>newNumB){
         System.out.println(newA);
     }else{
         System.out.println(newB);
     }

    }
}
