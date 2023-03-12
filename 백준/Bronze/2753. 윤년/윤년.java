import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        String check;
        if (year % 4 == 0 && year % 100 != 0) {
            check = "1";
        } else if ( year % 400 == 0) {
            check = "1";
        } else {
            check = "0";
        }
        System.out.println(check);
    }
}
