package numerospetit;
/*comentari barreja*/
import java.util.Scanner;
import java.util.Arrays;
public class numerospetits {

	public static void main(String[] args){	
	
		Scanner lector = new Scanner(System.in);
		int [] Nums = new int[10];
		
		for(int i=0; i<Nums.length ; i++){
			System.out.println("Entra un numero:");
			Nums [i] = lector.nextInt();
		}
		Arrays.sort(Nums);
		System.out.println("El numero menor es: " + Nums[0]
                System.out.println("El numero major es: " + Nums[10]);
	}
}
/* comentari projecte 1*/
