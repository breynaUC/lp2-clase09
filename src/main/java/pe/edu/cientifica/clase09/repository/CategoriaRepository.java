package pe.edu.cientifica.clase09.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cientifica.clase09.entity.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
