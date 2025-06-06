
package pe.edu.cientifica.clase09.generic;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Docente
 */
public interface IGeneric<T> {
   T create(T t);
   T update(T t);
   void delete(Long id);
   Optional<T> read(Long id);
   List<T> readAll();
}
