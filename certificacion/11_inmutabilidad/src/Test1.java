import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		/*List<StringBuilder> lst1=List.of();
		lst1.get(0).append(" by");
		System.out.println(lst1);*/
		StringBuilder[] sbs=new StringBuilder[] {null,new StringBuilder("hello"),new StringBuilder("good")};
		List<StringBuilder> lst1=List.of(sbs);
		lst1.get(0).append(" by");
		System.out.println(lst1);
				
		
		

	}

}
