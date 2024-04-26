package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AgregarContacto {

	public static void main(String[] args) {
		/*
		 * 
		1.-Nuevo Contacto
		2.-Eliminar Contacto
		3.-Actualizar edad
		4.-Salir

	1: Se piden los datos del nuevo contacto y se guarda
	2: Solicita el email y borra el contacto con dicho email
	3: Solicita email y nueva edad, y sustituye la edad anterior por la nueva en ese contacto 
		 */
		String cadenaConexion="jdbc:mysql://localhost:3306/agenda";
		String usuario="root";
		String password="root";
		String name="nombrex";
		String email="emailx@gmail.com";
		int edad=20;
		try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			/*
			String sql="insert into contactos(nombre,email,edad) values('"+name+"','"+email+"',"+edad+")";
			Statement st=con.createStatement();
			st.execute(sql);
			*/
			//consultas preparadas
			String sql="insert into contactos(nombre,email,edad) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, edad);
			ps.execute();//NO se manda otra vez la SQL
			System.out.println("Registro añadido!!");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		/*
		double saldo,limite;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce saldo");
		saldo=Double.parseDouble(sc.nextLine());
		System.out.println("Introduce límite");
		limite=Double.parseDouble(sc.nextLine());
		cuentamov=new CuentaMovimientos(saldo, limite);
		//ahora viene el rollo menú...
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					ingresar();
					break;
				case 2:
					extraer();
					break;
				case 3:
					mostrarMovimientos();
					break;				
				case 4:
					System.out.println("---Adios---");
			}
		}while(opcion!=4);	
	}*/

	}

}
