package com.generation.LojaGamers.repository;

import com.generation.LojaGamers.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByUsuario(String usuario);
}