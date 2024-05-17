package cl.bootcamp.clase_66.dao;

import cl.bootcamp.clase_66.model.Producto;

public interface ProductoDao {
	
	boolean crearProducto(Producto producto);
	boolean editarProducto(Producto producto);
	Producto obtenerPorId(int id);
	Producto obtenerPorCodigo(String codigo);
}
