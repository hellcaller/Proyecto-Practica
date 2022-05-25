package microservicio.proyecto.cursos.service;





import microservicio.proyecto.Commons.Alumnos.model.Alumno;
import microservicio.proyecto.commons.services.CommonService;
import microservicio.proyecto.cursos.model.Curso;

public interface CursoService extends CommonService<Curso> {
			
	public Curso findCursoByAlumnoId (Long id);
	
	public Iterable<Long> obtenerExamenesIdConRespuestasAlumno( Long alumnoId);
	
	public Iterable<Alumno> obtenerAlumnosPorCurso( Iterable<Long> ids);
	
	public void eliminarCursoAlumnoPorId(Long id);
	
}
