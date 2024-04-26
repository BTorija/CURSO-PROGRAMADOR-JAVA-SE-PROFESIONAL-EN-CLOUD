package model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pais {
	/*
	 * Implementar lógica de negocio de una aplicación que proporcione información
sobre paises. Cada pais se caracteriza por: nombre,continente,capital,habitantes

-Lista de continentes
-Lista de paises a partir del continente
-Pais más poblado
-Tabla con paises agurpados por continente
-Pais a partir de su capital 
	 */
	@SerializedName("name")
	private String nombre;
	@SerializedName("region")
	private String continente;
	private String capital;
	@SerializedName("population")
	private long poblacion;
	

}
