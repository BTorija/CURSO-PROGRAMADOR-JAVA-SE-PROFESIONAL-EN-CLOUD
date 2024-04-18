package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(3,18,9,-3,2,-8));
		//sustituir cada elemento por su mitad
		nums.replaceAll(n->n/2);
		nums.forEach(n->System.out.println(n));
		List<Double> numsDouble=new ArrayList<Double>(List.of(3.0,18.0,9.0,-3.0,2.0,-8.0));
		//sustituir cada elemento por su mitad con decimales
		numsDouble.replaceAll(n->n/2);
		numsDouble.forEach(n->System.out.println(n));
	}

}
