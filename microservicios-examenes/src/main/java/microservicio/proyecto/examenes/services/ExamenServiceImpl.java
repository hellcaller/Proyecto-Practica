package microservicio.proyecto.examenes.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.examenes.model.Asignatura;
import common.examenes.model.Examen;
import microservicio.proyecto.commons.services.CommonServiceImpl;
import microservicio.proyecto.examenes.repository.AsignaturaRepository;
import microservicio.proyecto.examenes.repository.ExamenRepository;


@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen,ExamenRepository>  implements ExamenService {
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String term) {
		return repository.findByNombre(term);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Asignatura> findAllAsignaturas() {
		return asignaturaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Long> findExamenesIdsConRespuestasByPreguntaIds(Iterable<Long> preguntaIds) {
		return repository.findExamenesIdsConRespuestasByPreguntaIds(preguntaIds);
	}



}
