package br.com.sraap.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.sraap.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
