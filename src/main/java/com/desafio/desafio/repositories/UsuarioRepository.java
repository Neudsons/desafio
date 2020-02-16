package com.desafio.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.desafio.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{


}
