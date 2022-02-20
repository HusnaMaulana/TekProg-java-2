package Berhitung;
import java.util.Scanner;
/**
 * <h1> Berhitung </h1>
 * Terdapat 5 buah operator matematika:
 * 1. Penjumlahan, direpresentasikan dengan '+'.
 * 2. Pengurangan, direpresentasikan dengan '-'.
 * 3. Perkalian, direpresentasikan dengan '*'.
 * 4. Pembagian, direpresentasikan dengan '/'.
 * 5. Sisa hasil bagi, direpresentasikan dengan '%'.
 * 
 * <b> Input <b>
 * Satu baris berisi A, operator, dan B, 
 * masing-masing dipisahkan sebuah spasi,
 * yang menyatakan terdapat operasi "A operator B".
 * <p>
 * <b> Output <b>
 * Satu baris berisi sebuah bilangan bulat, hasil "A operator B".
 * @author Husna Maulana
 * @version 1.0
 * @since 20-02-2022
 */

public class Kalkulator {

	public static void main(String[] args) {
		System.out.println("ketikan angka : ");
		Scanner Input = new Scanner (System.in);
		int angka1 = Input.nextInt();
		char operator = Input.next().charAt(0);
		int angka2 = Input.nextInt();
		int hasil;
		
	    switch (operator) {
	       
	      case '+':
	        hasil = angka1 + angka2;
	        System.out.println(angka1+" + "+angka2+ " = "+hasil);
	        break;

	      case '-':
	        hasil = angka1 - angka2;
	        System.out.println(angka1+" - "+angka2+" = "+hasil);
	        break;

	      case '*':
	        hasil = angka1 * angka2;
	        System.out.println(angka1+" * "+angka2+" = "+hasil);
	        break;

	      case '/':
	        hasil = angka1 / angka2;
	        System.out.println(angka1+" / "+angka2+" = "+hasil);
	        break;

	      case '%':
	        hasil = angka1 % angka2;
	        System.out.println(angka1+" % "+angka2+" = "+hasil);
	        break;
	       
	    }
	  }
	}
