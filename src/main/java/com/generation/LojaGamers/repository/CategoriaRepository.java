package com.generation.LojaGamers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.LojaGamers.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}