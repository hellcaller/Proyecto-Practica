package microserviciosrespuestas.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import common.examenes.model.Examen;

@FeignClient(name= "microservicio-examenes")
public interface ExamenFeignClient {

	@GetMapping("/{id}")
	public Examen obtenerExamenPorId(@PathVariable Long id);
	

	@GetMapping("/respondidos-por-preguntas")
	public List<Long> obtenerExamenesIdsPorPreguntasIdRespondidas(@RequestParam List<Long> preguntaIds);
		
}
