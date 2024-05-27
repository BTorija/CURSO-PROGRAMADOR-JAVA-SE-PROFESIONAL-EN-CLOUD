import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> lst1=List.of(11,7,4,2);
		System.out.println(Collections.binarySearch(lst1, 4));//inesperado
		System.out.println(Collections.binarySearch(lst1, 4,Comparator.reverseOrder()));

	}

}
