package pruebas;

import pruebas.Test2.Posicion;

public class Test2 {
	enum Posicion{
		NORTE(2), SUR(1), ESTE(5), OESTE(3);
		int s;
		Posicion(int s){
			this.s=s;
		}
	}
	public static void main(String[] args) {
		Posicion p2=Posicion.NORTE;
		Posicion[] pos= {Posicion.NORTE,Posicion.ESTE,Posicion.SUR};
		pos[1].s=3; //1
		for(Posicion p:pos) {
			System.out.print(p.name()+" ");
		}
	}
}

class Test3{
	void m() {
		Posicion p=Posicion.SUR;
	}
}