package microservicio.proyecto.cursos.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import microservicio.proyecto.cursos.model.Curso;

public interface CursoRepository extends PagingAndSortingRepository<Curso, Long> {

	
	@Query("select c from Curso c join fetch c.cursoAlumnos a where a.alumnoId = ?1")
	public Curso findCursoByAlumnoId (Long id);
	
	@Modifying
	@Query("delete from CursoAlumno ca where ca.alumnoId=?1")
	public void eliminarCursoAlumnoPorId(Long id);
	
}
