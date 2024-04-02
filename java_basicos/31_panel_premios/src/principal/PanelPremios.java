package principal;

import java.util.Arrays;

public class PanelPremios {

	public static void main(String[] args) {
		// Crear un panel de premios de 10x10, con 5 premios escondidos de forma aleatoria en las casillas
		//un array de dos dimensiones cuyas casillas tengan de forma aleatoria 5 (valor 1) y el resto valor 0
		// selección aleatoria de la posición

		// Crear método que rellene auto el array con 5 premios 
		//(generando 5 parejas de posiciones aleatorias y que comprueben que en esa posición no hay un 1)

		final int FILAS=5;
		final int COLUMNAS=5;
		int [][] panel=new int[FILAS][COLUMNAS];
		int premios=0;
		int fila, columna;
		do {
			fila=(int)(Math.random()*(FILAS));
			columna=(int)(Math.random()*(COLUMNAS));//entre 0 y 4
			if(panel[fila][columna]!=1) {//si no está ocupada, la ocupamos
				panel[fila][columna]=1;
				premios++;
			}
		}while(premios<5);
		mostrarPanel(panel);
	}
	static void mostrarPanel(int[][] panel) {
		for(int i=0;i<panel.length;i++) {
			for(int j=0;j<panel[i].length;j++) {
				System.out.print(panel[i][j]+"|");
			}
			System.out.println();
		}
	}

}
