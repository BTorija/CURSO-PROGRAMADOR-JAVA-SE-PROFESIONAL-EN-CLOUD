package pruebas;

enum Orientacion{
	NORTE,SUR,ESTE,OESTE;
}

public class Test {

	public static void main(String[] args) {
		Orientacion or=Orientacion.NORTE;
		var res=switch(or) {
			case NORTE->"frio";
			case SUR->"calor";
			case ESTE->"seco";
			case OESTE->"húmedo";
			
		};
		System.out.println(res);

	}

}
