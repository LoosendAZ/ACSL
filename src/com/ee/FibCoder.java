import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fibCypher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. CHARACTER key
     *  2. STRING msg
     */

    public static String fibCypher(char key, String msg) {
        char[] message = msg.toCharArray();
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String result = "";
        for(int i = 0; i < message.length; i++){
            char currentLetter = message[i];
            int currentFib = fib(i + 1);
            
            int fibOffset = key + currentFib;
            if(fibOffset > 122){
                int x = (fibOffset - 123) % 26;
                fibOffset = letters[x];
            }
            
            int finalCalc = currentLetter + fibOffset;
            result += String.valueOf(finalCalc) + " ";
        }
        return result.trim();
    }
    
    public static int fib(int x){
        if(x == 1){
            return 1;
        }
        else if(x == 2){
            return 2;
        }
        else{
            return fib(x - 1) + fib(x - 2);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        char key = bufferedReader.readLine().charAt(0);

        String msg = bufferedReader.readLine();

        String result = Result.fibCypher(key, msg);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
