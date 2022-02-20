package Array;

public class array {
/**
 * @author Husna Maulana
 * @version 1.0
 * @since 20-02-2022
 * @param args
 */
	public static void main(String[] args) {
		 //One Dimensional Arrays
		 int[] Array1 = {2, 5, 3}; 
		 int[] Array2 = {9, 5, 3}; 
		 int[] Array3 = {2, 4, 9}; 
		 int[] Array4 = {10, 11, 12}; 
		 int[] Array5 = {13, 14, 15}; 
		 int[] Array6 = {16, 17, 18}; 
		 int[] Array7 = {19, 20, 21}; 
		 int[] Array8 = {22, 23, 24}; 
		 int[] Array9 = {25, 26, 27}; 
		 //Two Dimensional Arrays
		 int[][] Array2D1 = {Array1, Array2, 
		Array3}; 
		 int[][] Array2D2 = {Array4, Array5, 
		Array6};
		 int[][] Array2D3 = {Array7, Array8, 
		Array9};
		 //Three Dimensional Array
		 int[][][] Array3D = {Array2D1, 
		Array2D2, Array2D3};
		 
		     for (int[][] Array3D1 : Array3D) {
		         System.out.print("{");
		     for (int[] Array3D2 : Array3D1) {
		         System.out.print("{");
		         for (int k = 0; k < Array3D2.length; k++) {
		             System.out.print(Array3D2[k] + "\t");
		         }
		         System.out.print("} ");
		     }
		         System.out.print("}");
		         System.out.println();
		     }
		 }
		}