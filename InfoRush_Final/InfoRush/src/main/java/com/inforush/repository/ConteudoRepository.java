package com.inforush.repository;

import com.inforush.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConteudoRepository extends JpaRepository<Conteudo, Long> {
    List<Conteudo> findByArea(Area area);
    List<Conteudo> findByTituloContainingIgnoreCase(String titulo);
}
