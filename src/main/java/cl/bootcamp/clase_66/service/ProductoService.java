package cl.bootcamp.clase_66.service;

import cl.bootcamp.clase_66.model.Producto;

public interface ProductoService {

	boolean nuevoProducto(Producto producto);
	boolean modificarProducto(Producto producto);
	Producto porId(int id);
	Producto porCodigo(String codigo);
}
