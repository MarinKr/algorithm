import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replace("c=", "K")
                .replace("c-", "K")
                .replace("dz=", "K")
                .replace("c-", "K")
                .replace("d-", "K")
                .replace("lj", "K")
                .replace("nj", "K")
                .replace("s=", "K")
                .replace("z=", "K");

        int size = str.length();
        System.out.println(size);
    }
}