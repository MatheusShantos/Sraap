package br.com.sraap.controllers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.sraap.models.Administrador;
import br.com.sraap.models.Aluno;
import br.com.sraap.models.Usuario;
import br.com.sraap.repositories.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private PasswordEncoder codificadorDeSenhas;

	@Autowired
	private UsuarioRepository repository;

	@PostConstruct
	public void init() {
		Usuario usuario = repository.findByEmail("matheus@gmail.com");

		if (usuario == null) {
			Administrador adm = new Administrador(null, "Matheus", "matheus@gmail.com",
					codificadorDeSenhas.encode("123"));
			repository.save(adm);
		}
	}

	@RequestMapping(value = "privado/novo-aluno", method = RequestMethod.GET)
	public String formAluno() {
		return "privado/adm/usuarios/formAluno";
	}

	@RequestMapping(value = "privado/novo-aluno", method = RequestMethod.POST)
	public String save(Aluno aluno) {
		if (aluno == null) {
			System.out.println(aluno.toString());
		} else {
			repository.save(aluno);
			System.out.println("Salvou");
		}

		return "privado/adm/usuarios/formAluno";
	}
}
