package model;

import java.util.Date;

public class Pedido {
	
	/*Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
Se presenta el siguiente menú:
1.- Nuevo pedido
2.- Pedido más reciente
3.- Pedidos entre dos fechas
4.- Salir

2: Muestra los datos del pedido más reciente
3: Se solicitan dos fechas, y se muestran los pedidos realizados
en ese rango de fechas */
	
	
	private String producto;
	private int unidades;
	public Date fechaPedido;
	public Pedido(String producto, int unidades, Date fechaPedido) {
		super();
		this.producto = producto;
		this.unidades = unidades;
		this.fechaPedido = fechaPedido;
	}
	public Pedido() {
		super();
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	

}
