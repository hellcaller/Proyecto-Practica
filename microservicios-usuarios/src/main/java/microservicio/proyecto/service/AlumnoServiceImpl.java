package microservicio.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Transactional;

import microservicio.proyecto.Commons.Alumnos.model.Alumno;
import microservicio.proyecto.commons.services.CommonServiceImpl;
import microservicio.proyecto.feigncurso.CursoFeignClient;
import microservicio.proyecto.repository.AlumnoRepository;


@Service 
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	
	@Autowired
	private CursoFeignClient clientCurso;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		
		return repository.findByNombreOrApellido(term);
		
	}
	

	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAllById(Iterable<Long> ids) {
		return repository.findAllById(ids);
	}

	@Override
	public void eliminarCursoAlumnoPorId(Long id) {
		clientCurso.eliminarCursoAlumnoPorId(id);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		super.deleteById(id);
		this.eliminarCursoAlumnoPorId(id);
	}

}
