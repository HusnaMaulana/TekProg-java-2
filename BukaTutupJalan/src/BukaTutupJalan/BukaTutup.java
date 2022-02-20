package BukaTutupJalan;

import java.util.Scanner;
/**
*<h1> Buka Tutup Jalan </h1>
*<p>
*<b> Input <b>
*<p>
*Satu baris berupa plat number untuk 4 mobil
*<p>
*<b> Output <b>
*<p>
*Berupa tulisan “Jalan” atau “Berhenti
*@author Husna Maulana
* @version 1.0
* @since 2022-02-19
* @param args
*/
public class BukaTutup {

	public static void main(String[] args) {
		 Scanner Input = new Scanner(System.in);
	        String Mobil1 = Input.nextLine();
	        String Mobil2 = Input.nextLine();
	        String Mobil3 = Input.nextLine();
	        String Mobil4 = Input.nextLine();
	         
	        String hasil = Mobil1+Mobil2+Mobil3+Mobil4; //penggabungan String
	        long gabungngan = Long.parseLong(hasil);
	        //parselong() digunakan untuk mengurai long  
	        int sisa = (int) ((gabungngan-999999)%5);
	        if(sisa==1){
	            System.out.println("jalan");
	        }else{ System.out.println("berhenti");
	        }
	        }
	}