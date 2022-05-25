package microservicio.proyecto.examenes.services;

import java.util.List;

import common.examenes.model.Asignatura;
import common.examenes.model.Examen;
import microservicio.proyecto.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen> {
		
	public List <Examen> findByNombre(String term);
	
	
	public Iterable <Asignatura> findAllAsignaturas();
	
	public Iterable<Long> findExamenesIdsConRespuestasByPreguntaIds(Iterable<Long> preguntaIds);
}
