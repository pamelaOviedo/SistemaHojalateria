<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Hojalateria</title>
    </head>
    <body>        
        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <form action="Controlador?menu=Clientes" method="POST">
                            <div class="form-group">
                                <label>nombre</label>
                                <input type="text" value="${clientes.getnom()}" name="txtnombre" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>apellido</label>
                                <input type="text" value="${clientes.getapellido()}" name="txtapellido" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>telefono</label>
                                <input type="text" value="${clientes.gettel()}" name="txtTel" class="form-control">
                            </div>
                             <div class="form-group">
                                <label>Direccion</label>
                                <input type="text" value="${clientes.getDir()}" name="txtdireccion" class="form-control">
                            </div>
                               
                            <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                            <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                        </form>
                    </div>                         
                </div>
            </div>                     
            <div class="col-sm-8">
                <div class="card">
                    <div class="card-body">
                        <table class="table table-hover table-responsive">
                            <thead>
                                <tr>
                                    <th>id</th>
                                    <th>nombre</th>
                                    <th>apellido</th
                                    <th>telefono</th>
                                    <th>direccion</th>                                   
                                    >
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="user" items="${clientes}">
                                    <tr>
                                        <td>${user.getid()}</td>
                                        <td>${user.getnom()}</td>
                                        <td>${user.getapellido()}</td>
                                        <td>${user.getDir()}</td>
                                        <td>${user.gettel()}</td>                                        
                                        <td>
                                            <a class="btn btn-warning" href="Controlador?menu=Clientes&accion=Editar&id=${em.getId()}">Editar</a>
                                            <a class="btn btn-danger" href="Controlador?menu=Clientes&accion=Delete&id=${em.getId()}">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>      
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
