package GajiAgent;
import java.util.Scanner;

public class gajiAgent {
    /**
 * <h1>Gaji Agent</h1>
 * Dalam sebuah agent penjualan. Agent akan menerima gaji pokok sebesar Rp.500.000,00 
 * perbulan. Agent akan menerima bonus penjualan sebesar 25% dari total penjualan item jika
 * berhasil menjual minimal 40 item. Agent akan menerima bonus penjualan 35% dari total 
 * penjualan jika berhasil menjual diatas 80 item. Namun, Jika Agent menjual dibawah 15 item
 * penjualan jika berhasil menjual diatas 80 item. Namun, Jika Agent menjual dibawah 15 item
 * item. Selain itu agen hanya menerima bonus 10% setiap itemnya. Harga setiap item adalah Rp. 
 * 50.000,00.
 * <p>
 * <b>Input Format</b>
 * <p>
 * Satu baris berupa jumlah penjualan bulan ini.
 * <p>
 * <b>Output Format</b>
 * <p>
 * Satu baris berupa jumlah penjualan bulan ini.
 * <p>
 * @author Husna Maulana
 * @version 1.0
 * @since 20-02-2022
 * * @param args
 */

    public static void main(String[] args){
        int Totalgaji;
        int gajiPokok=500000;
        int harga=50000;
        Scanner keyboard = new Scanner(System.in);
        int penjualan = keyboard.nextInt();
        
        
        if (penjualan>=40&&penjualan<=80){
            Totalgaji = (int) (gajiPokok+(0.25*(penjualan*harga)));
            System.out.println(Totalgaji);
        }
        else if (penjualan>80){
            Totalgaji = (int) (gajiPokok+(0.35*(penjualan*harga)));
            System.out.println(Totalgaji);
        }
        else if (penjualan<15){
            Totalgaji = (int) (gajiPokok-(0.15*(penjualan*harga)));
            System.out.println(Totalgaji);
        }
        else{ 
            Totalgaji = (int) (gajiPokok+(0.1*(penjualan*harga)));
            System.out.println(Totalgaji);
        }
               
    }
    
}
