package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductosService {
	/*La lógica de negocio, expondrá los siguientes métodos:

-eliminarPorCategoria: elimina de la lista aquellos productos que pertenezcan a la categoría indicada

-bajarPrecio: Baja el precio de todos productos en el porcentaje indicado

-subirPrecioCategoria: Sube el precio a todos los productos de la categoría indicada, en el porcentaje indicado

-obtenerProductos: Devuelve la lista de productos existentes
-agregarProducto: Añade el producto recibido */
	
	
	List<Producto>productos=new ArrayList<>();
	 public void eliminarPorcategoria(String categoria) {
		productos.removeIf(p -> p.getCategoria().equals(categoria));
	 }
		
	 public void bajarPrecio(int porcentaje) {
		productos.
	 }
	 public void subirPrecioCategoria(int porcentaje, String categoria) {
		 
	 }
	 public List<Producto> obtenerProductos() {
		return productos;
	
		 
	 }
	 public void altaProducto(Producto p) {
		 productos.add(p);
	 }
	 
	 public static void main(String[] args) {
		 
		 
	 }

}
