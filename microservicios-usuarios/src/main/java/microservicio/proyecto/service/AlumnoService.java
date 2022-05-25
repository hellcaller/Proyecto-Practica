package microservicio.proyecto.service;



import java.util.List;

import microservicio.proyecto.Commons.Alumnos.model.Alumno;
import microservicio.proyecto.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno>  {

	public List<Alumno> findByNombreOrApellido(String term);
	
	public Iterable<Alumno> findAllById(Iterable<Long> ids);
	
	public void eliminarCursoAlumnoPorId(Long id);
	
}
