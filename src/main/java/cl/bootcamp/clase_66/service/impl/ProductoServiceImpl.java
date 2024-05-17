package cl.bootcamp.clase_66.service.impl;

import org.springframework.stereotype.Service;

import cl.bootcamp.clase_66.dao.ProductoDao;
import cl.bootcamp.clase_66.model.Producto;
import cl.bootcamp.clase_66.service.ProductoService;
import lombok.extern.apachecommons.CommonsLog;

@Service
@CommonsLog
public class ProductoServiceImpl implements ProductoService {
	
	private final ProductoDao productoDao;
	

	public ProductoServiceImpl(ProductoDao productoDao) {
		this.productoDao = productoDao;
	}

	@Override
	public boolean nuevoProducto(Producto producto) {
		try {
			return productoDao.crearProducto(producto);
		}catch(Exception ex){
			log.error("Error al nuevo producto:"+ex.getMessage(),ex);
			return false;
		}
	}

	@Override
	public boolean modificarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Producto porId(int id) {
		try {
			return productoDao.obtenerPorId(id);
		}catch(Exception ex){
			log.error("Error en pro id:"+ex.getMessage(),ex);
			return null;
		}
	}

	@Override
	public Producto porCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
