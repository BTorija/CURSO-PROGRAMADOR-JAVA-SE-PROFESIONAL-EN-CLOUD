import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		//ordenar array
		int[] nums= {7,2,9,0};
		Arrays.sort(nums);
		for(int n:nums) {
			System.out.println(n);
		}
		
		//ordenar coleccion
		List<Integer> lst=new ArrayList<>(List.of(4,11,2,7,5));
		Collections.sort(lst);
		System.out.println(lst);
	}

}
