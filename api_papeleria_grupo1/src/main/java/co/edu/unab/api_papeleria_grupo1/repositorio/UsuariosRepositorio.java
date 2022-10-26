package co.edu.unab.api_papeleria_grupo1.repositorio;

import org.springframework.data.repository.CrudRepository;
 import org.springframework.stereotype.Repository;

import co.edu.unab.api_papeleria_grupo1.modelo.UsuariosModel;
@Repository
public interface UsuariosRepositorio  extends CrudRepository<UsuariosModel,Integer>{
    
}
    


