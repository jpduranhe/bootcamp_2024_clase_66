package cl.bootcamp.clase_66.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.bootcamp.clase_66.dao.ProductoDao;
import cl.bootcamp.clase_66.mapper.ProductoRowMapper;
import cl.bootcamp.clase_66.model.Producto;
import lombok.extern.apachecommons.CommonsLog;


@Repository
@CommonsLog
public class ProductoDaoImpl implements ProductoDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public ProductoDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public boolean crearProducto(Producto producto) {
		try{
			String sql="insert into producto (nombre,codigo, descripcion) values(?,?,?)";
			jdbcTemplate.update(sql,producto.getNombre(),
									producto.getCodigo(),
									producto.getDescripcion());
			return true;
		}catch(Exception ex) {
			log.error("Error al crear:"+ex.getMessage(),ex);
			return false;
		}
	}

	@Override
	public boolean editarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Producto obtenerPorId(int id) {
		try{
			String sql="select id, nombre,codigo, descripcion from producto where id=?";
		Producto producto=jdbcTemplate.queryForObject(sql, 
													  new ProductoRowMapper(), 
													  new Object[] {id});
			return producto;
		}catch(Exception ex) {
			log.error("Error al obtener porid:"+ex.getMessage(),ex);
			return null;
		}
	}

	@Override
	public Producto obtenerPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
