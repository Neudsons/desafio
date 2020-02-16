package com.desafio.desafio.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.desafio.desafio.entities.Telefone;
import com.desafio.desafio.entities.Usuario;
import com.desafio.desafio.repositories.TelefoneRepository;
import com.desafio.desafio.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Usuario u1 = new Usuario(null, "Usuario01", "usuario01@gmail.com", "123");
		Usuario u2 = new Usuario(null, "Usuario02", "usuario02@gmail.com", "123");
		
		Telefone t1 = new Telefone(null, 81, "99889981", "Celular", u1);
		Telefone t2 = new Telefone(null, 81, "99889982", "Celular", u2);
		Telefone t3 = new Telefone(null, 81, "99889983", "Celular", u1);
		
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		telefoneRepository.saveAll(Arrays.asList(t1,t2,t3));
		
	}
	
	

}
