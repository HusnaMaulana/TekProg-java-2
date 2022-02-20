package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Bignumber {
/**
 * <h1> Big Number </h1>
 * <b> Input <b>
 * There will be two lines containing two numbers, a and b.
 * Constrains a and b are non-negative integers and can have maximum 200 digits.
 * <p>
 * <b> Output <b>
 * Output two lines. The first line should contain a + b, 
 * and the second line should contain a x b. 
 * Don't print any leading zeros.
 * 
 * @author Husna Maulana
 * @version 1.0
 * @since 20-02-2022
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("masukan angka :");
		 Scanner Input = new Scanner(System.in);
	        String angka1 = Input.nextLine();
	        String angka2 = Input.nextLine();
	        BigInteger bigAngka1 = new BigInteger(angka1);
	        BigInteger bigAngka2 = new BigInteger(angka2);
	        BigInteger penjumlahan  = bigAngka1.add(bigAngka2);
	        BigInteger perkalian = bigAngka1.multiply(bigAngka2);
	        System.out.println("hasil penjumlahan = " +penjumlahan);
	        System.out.println("hasil perkalian = " +perkalian);
	    }
	}
