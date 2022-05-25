package microservicio.proyecto.cursos.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import microservicio.proyecto.Commons.Alumnos.model.Alumno;
import microservicio.proyecto.commons.services.CommonServiceImpl;
import microservicio.proyecto.cursos.clients.AlumnoFeignClient;
import microservicio.proyecto.cursos.clients.RespuestaFeignClient;
import microservicio.proyecto.cursos.model.Curso;
import microservicio.proyecto.cursos.repository.CursoRepository;


@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

	@Autowired
	private RespuestaFeignClient client;
	
	@Autowired
	private AlumnoFeignClient clientAlumno;
	
	
	@Override
	@Transactional(readOnly = true)
	public Curso findCursoByAlumnoId(Long id) {
		
		return repository.findCursoByAlumnoId(id);
	}

	@Override
	public Iterable<Long> obtenerExamenesIdConRespuestasAlumno(Long alumnoId) {
		
		return client.obtenerExamenesIdsConRespuestasAlumno(alumnoId);
	}
	
	@Override
	public Iterable<Alumno> obtenerAlumnosPorCurso(Iterable<Long> ids) {
		
		return clientAlumno.obtenerAlumnosPorCurso(ids);
	}

	@Override
	@Transactional
	public void eliminarCursoAlumnoPorId(Long id) {
		repository.eliminarCursoAlumnoPorId(id);
	}

	



}
