package pruebas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10Partition {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//crear una tabla don de estén agrupados los negativos por un lado y los positivos por otro
		Map<Boolean,List<Integer>> tabla= nums.stream()
											.collect(Collectors.partitioningBy(n->n>0));
		Map<Boolean,List<Integer>> tabla2= nums.stream()
				.collect(Collectors.partitioningBy));
										

	}

}
