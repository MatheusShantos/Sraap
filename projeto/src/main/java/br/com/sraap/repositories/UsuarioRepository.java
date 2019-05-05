package br.com.sraap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sraap.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByEmail(String email);
	 
}
