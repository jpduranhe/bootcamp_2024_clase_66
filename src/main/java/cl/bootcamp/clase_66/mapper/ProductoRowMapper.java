package cl.bootcamp.clase_66.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.bootcamp.clase_66.model.Producto;


public class ProductoRowMapper implements RowMapper<Producto> {

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Producto producto = new Producto();
		producto.setId(rs.getInt("id"));
		producto.setNombre(rs.getString("nombre"));
		producto.setCodigo(rs.getString("codigo"));
		producto.setDescripcion(rs.getString("descripcion"));
		return producto;
	}

}
