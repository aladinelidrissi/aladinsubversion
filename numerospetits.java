package numerospetit;
import java.util.Scanner;
import java.util.Arrays;
public class numerospetits {

	public static void main(String[] args){	
	
		Scanner lector = new Scanner(System.in);
		int [] Nums = new int[5];
		
		for(int i=0; i<Nums.length ; i++){
			System.out.println("Entra un numero:");
			Nums [i] = lector.nextInt();
		}
		Arrays.sort(Nums);
		System.out.println("El numero menor es: " + Nums[0]);
	}
}
