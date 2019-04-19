package br.com.sraap.seguranca;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.sraap.models.Administrador;
import br.com.sraap.models.Aluno;
import br.com.sraap.models.Professor;
import br.com.sraap.models.Usuario;
import br.com.sraap.repositories.UsuarioRepository;

@Service
public class ServicoAutenticacao implements UserDetailsService {

	@Autowired
	private UsuarioRepository repository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Usuario usuario = repository.findByEmail(email);
		System.out.println(usuario);
		System.out.println(repository.findAll());
		List<GrantedAuthority> autorizacoes = new ArrayList<>();

		if (usuario instanceof Professor) {

			autorizacoes.add(new SimpleGrantedAuthority("ROLE_PROFESSOR"));

		} else if (usuario instanceof Aluno) {

			autorizacoes.add(new SimpleGrantedAuthority("ROLE_ALUNO"));

		} else if (usuario instanceof Administrador) {

			autorizacoes.add(new SimpleGrantedAuthority("ROLE_ADM"));
		}

		return new User(email, usuario.getSenha(), true, true, true, true, autorizacoes);
	}

}
