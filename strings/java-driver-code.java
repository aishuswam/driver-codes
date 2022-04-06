import java.io.*;
import java.util.*;

public class Main {
  	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int i = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String str = br.readLine();
            char out_ = solve(str);
            System.out.println(out_);
         }
         wr.close();
         br.close();
    }
  
    static char solve(String s){
      if(i%2==0||7==0)
      {
        System.out.println(i+"is divisible by either 3 or 7 but not both ");
        
      }
      if(i%2==0&&7==0)
      {
        System.out.println(i+"is divisible by both 3 and 7");
      }
        char result = ' ';
        return result;
    }
}
