package br.com.sraap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.sraap.seguranca.ServicoAutenticacao;

@Configuration
@EnableWebSecurity
public class ConfiguracaoSegurancaWeb extends WebSecurityConfigurerAdapter {

	@Autowired
	private ServicoAutenticacao servico;
	
	@Bean
	public PasswordEncoder codificadorDeSenhas() {
		return new BCryptPasswordEncoder();

	}
	//Mapeamento das possiveis requisições
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/privado/**")
			.authenticated()
			.antMatchers("/privado/professor/**").hasRole("PROFESSOR")
			.antMatchers("/privado/adm/**").hasRole("ADM")
			.antMatchers("/privado/aluno/**").hasRole("ALUNO")
			.antMatchers("/privado/**").hasAnyRole("ALUNO","PROFESSOR","ADM")
			.antMatchers("/publico/**").permitAll()
			.and()
			.formLogin().loginPage("/publico/login")
			//.loginProcessingUrl("/perform_login")
			.defaultSuccessUrl("/privado/home")
			.and()
			.logout()
			//.logoutUrl("/perform_logout")
			.logoutSuccessUrl("/publico/login")
			.invalidateHttpSession(true)
			.deleteCookies("JSESSIONID")
			.and()
			.csrf().disable();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}
	
	@Autowired
	public void configuraAutorizacao(AuthenticationManagerBuilder gestorDeAutenticacao) throws Exception {
		
		gestorDeAutenticacao.userDetailsService(servico).passwordEncoder(codificadorDeSenhas());
	}
}
