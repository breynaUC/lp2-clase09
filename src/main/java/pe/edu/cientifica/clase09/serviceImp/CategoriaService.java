package pe.edu.cientifica.clase09.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cientifica.clase09.entity.Categoria;
import pe.edu.cientifica.clase09.repository.CategoriaRepository;
import pe.edu.cientifica.clase09.service.ICategoria;

@Service
public class CategoriaService implements ICategoria{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	

	@Override
	public Categoria create(Categoria t) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(t);
	}

	@Override
	public Categoria update(Categoria t) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(id);
	}

	@Override
	public Optional<Categoria> read(Long id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}
