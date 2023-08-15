package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<FormEntity, Integer> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}
