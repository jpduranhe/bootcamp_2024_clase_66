<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Producto</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<div class ="container">
		<div class="row">
			<div class="col-md-12">
				<h1>Formulario de Producto</h1>
				<form action="#" method="post">
				  <div class="mb-3">
				    <label for="nombre" class="form-label">Nombre</label>
				    <input type="text" name="nombre" class="form-control" id="nombre">
				  </div>
				  <div class="mb-3">
				    <label for="codigo" class="form-label">Codigo</label>
				    <input type="text" name="codigo" class="form-control" id="codigo">
				  </div>
				  <div class="mb-3">
				    <label for="descripcion" class="form-label">Descripcion</label>
				    <input type="text" name="descripcion" class="form-control" id="descripcion">
				  </div>
				  <button type="submit" class="btn btn-primary">Ingresar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>