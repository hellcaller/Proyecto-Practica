package microservicio.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import microservicio.proyecto.Commons.Alumnos.model.Alumno;

public interface AlumnoRepository extends PagingAndSortingRepository<Alumno,Long> {

	//muy importante buscar con el nombre de la entidad correcta ya que utilice 
	//el parametro de plural de mysql
	// y me demore media hora como imbecil buscando Alumnos en vez de Alumno F
	
	@Query("select a from Alumno a where upper(a.nombre) like upper(concat('%', ?1, '%')) or upper(a.apellido) like upper(concat('%', ?1, '%'))")
	public List<Alumno> findByNombreOrApellido(String term);
	
	public Iterable<Alumno> findAllByOrderByIdAsc();
	
}
