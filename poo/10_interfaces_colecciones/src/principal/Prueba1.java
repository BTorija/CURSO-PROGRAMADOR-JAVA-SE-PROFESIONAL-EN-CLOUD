package principal;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Prueba1 {

	public static void main(String[] args) {
		ArrayList<Integer>nums= new ArrayList<Integer>();
		nums.add(25); nums.add(200); nums.add(20);
		System.out.println(sumarPares(nums));
		Vector<Integer> nums2=new Vector<Integer>();
		nums2.add(4);nums2.add(11);nums2.add(67);
		System.out.println(sumarPares(nums2));
	}
	
	
	//Crear un método que reciba una clase Integer
	// y devuelva la suma de los pares de dicha lista
	
	public static int sumarPares(List<Integer>lista){
		int pares=0;
		for(Integer n:lista){
			if(n%2==0) {
				pares+=n;
			}
		}
		return pares;
		
	}
}
