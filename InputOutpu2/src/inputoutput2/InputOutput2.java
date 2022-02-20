package inputoutput2;
import java.util.Scanner;

public class InputOutput2 {
/**
 * <h1>Input and Output 2</h1>
 * Java's System.out.printf function can be used to print formatted output.  
 * The purpose of this exercise is to test your understanding of formatting 
 * output using printf.
 * <p>
 * To get you started, a portion of the solution is provided for you in the 
 * editor; you must format and print the input to complete the solution. 
 * <p>
 * <b>Input Format</b>
 * <p>
 * - Every line of input will contain a String followed by an integer.
 * <p>
 * - Each String will have a maximum of 10 alphabetic characters.
 * <p>
 * - Each integer will be in the clusive range from 0 to 999.
 * <p>
 * <b>Output Format</b>
 * <p>
 * - The first column contains the String and is left justified using exactly 15
 * characters.
 * <p>
 * - The second column contains the integer, expressed in exactly 3 digits; 
 * if the original input has less than three digits, you must pad your output's 
 * leading digits with zeroes.
 * <p>
 *
 * @author Husna Maulana
 * @version 1.0
 * @since 19-02-2022
 * @param args
 */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("====================================");
        for(int i=0;i<3;i++){// looping untuk
            
            String kata=keyboard.next();//method atau fungsi next() digunakan karena menggunakan tipe data String
            int angka=keyboard.nextInt();//method atau fungsi nextInt digunakana karena menggunakan tipe data integer
            
            System.out.printf("%-10s %03d\n", kata, angka);
            //%-10s memiliki arti output dari string nya maksimal memiliki 10 characters
            //%03d memiliki arti output  dari int nya maksimal 3 angka
            // "/n" artinya membuat garis baru atau enter
        }
        System.out.println("====================================");
        }
    }
    

