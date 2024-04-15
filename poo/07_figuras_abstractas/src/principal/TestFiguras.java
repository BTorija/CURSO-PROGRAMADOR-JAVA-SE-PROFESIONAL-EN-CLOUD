package principal;

import service.Circulo;
import service.Figura;
import service.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		//crear un Triangulo y un circulo con color
		//y propiedades cualquiera, y después mostrar
		//el color y area de cada uno
		
		Circulo cr=new Circulo("amarillo", 5);
		Triangulo tr=new Triangulo("marrón",5,8);
		/*System.out.println("color:"+cr.getColor());
		System.out.println("area:"+cr.area());
		System.out.println("color:"+tr.getColor());
		System.out.println("area:"+tr.area());*/
		
		imprimirFigura(cr);
		imprimirFigura(tr);
		
		
	}
	public static void imprimirFigura(Figura f) {
		System.out.println("La figura es de color " +f.getColor()+ " y su area es de "+ f.area() );
	}
}
