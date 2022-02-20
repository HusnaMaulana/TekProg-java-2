package inputoutput;
import java.util.Scanner; 

public class inputOutput1 {
/**
 * <h1>input and output</h1>
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, 
 * split the string into tokens.We define a token to 
 * be one or more consecutive English alphabetic 
 * letters.Then, print the number of tokens, 
 * followed by each token on a new line. 
 * <p>
 * <b>Input</b>
 * <p>
 * string
 * <p>
 * <b>Output</b>
 * <p>
 * First line, print an integer, n
 * Print each of the n tokens on a new line in the same order as they appear 
 * in input string
 * @author Husna Maulana
 * @version 1.0
 * @since 19-02-2022
 * @param args
 * 
 */
     public static void main(String[] args) {
    	System.out.println("ketikan kalimat :");
        Scanner input = new Scanner(System.in); // digunakan untuk mengambil input user
        String kalimat = input.nextLine(); // menggunakan method nextLine karena tipe data String
      
       
        kalimat = kalimat.trim();// trim() digunakan untuk memotong karakter pada awal dan pada akhir
        if (kalimat.length() != 0) {
            String[] strings = kalimat.split("[!,?._'@ ]+");//split digunkanan untuk memisahkan sebuah string
            System.out.println(strings.length);
            for (String kata : strings)
                System.out.println(kata);
        } else {
        	System.out.println("input tidak ditemukan");
        }
    }
}
