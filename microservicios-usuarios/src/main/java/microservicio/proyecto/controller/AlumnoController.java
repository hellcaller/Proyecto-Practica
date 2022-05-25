package microservicio.proyecto.controller;


import javax.validation.Valid;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import microservicio.proyecto.Commons.Alumnos.model.Alumno;
import microservicio.proyecto.commons.controller.CommonController;
import microservicio.proyecto.service.AlumnoService;

@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService> {
	
	@GetMapping("/alumnos-por-curso")
	public ResponseEntity<?> obtenerAlumnosPorCurso(@RequestParam List<Long> ids) {
		return ResponseEntity.ok(service.findAllById(ids));
	}
	
	
	@GetMapping("/uploads/img/{id}")
	public ResponseEntity<?> verFoto(@PathVariable Long id)
	{
		
		Optional<Alumno> optional = service.findById(id);
		
		if(optional.isEmpty() || optional.get().getFoto() == null)
		{
			return ResponseEntity.notFound().build();
		}
		
		Resource  imagen = new ByteArrayResource(optional.get().getFoto());
		
		return ResponseEntity.ok()
				.contentType(MediaType.IMAGE_JPEG)
				.body(imagen);
		
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar (@Valid @RequestBody Alumno alumno, BindingResult result , @PathVariable Long id )
	{
		
		if(result.hasErrors())
		{
			return this.validar(result);
		}
		
		Optional<Alumno> optional = service.findById(id);
		
		if(optional.isEmpty())
		{
			return ResponseEntity.notFound().build();
		}
		
		Alumno alumnodB = optional.get();
		
		alumnodB.setNombre(alumno.getNombre());
		alumnodB.setApellido(alumno.getApellido());
		alumnodB.setEmail(alumno.getApellido());
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnodB));
		
		
	}
	
	
	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term)
	{
		
		
		return ResponseEntity.ok(service.findByNombreOrApellido(term));
	}


	@PostMapping("/crear-con-foto")
	public ResponseEntity<?> crearConFoto(@Valid Alumno alumno, BindingResult result,@RequestParam MultipartFile archivo) throws IOException {
		
		
		if(!archivo.isEmpty())
		{
			alumno.setFoto(archivo.getBytes());
		}
		
		return super.crear(alumno, result);
	}
	
	
	@PutMapping("/editar-con-foto/{id}")
	
	public ResponseEntity<?> editarConFoto (@Valid Alumno alumno, BindingResult result , @PathVariable Long id, 
			@RequestParam MultipartFile archivo ) throws IOException
	{
		
		if(result.hasErrors())
		{
			return this.validar(result);
		}
		
		Optional<Alumno> optional = service.findById(id);
		
		if(optional.isEmpty())
		{
			return ResponseEntity.notFound().build();
		}
		
		Alumno alumnodB = optional.get();
		
		alumnodB.setNombre(alumno.getNombre());
		alumnodB.setApellido(alumno.getApellido());
		alumnodB.setEmail(alumno.getApellido());
		
		if(!archivo.isEmpty())
		{
			alumnodB.setFoto(archivo.getBytes());
		}
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnodB));
		
		
	}
	
	
	
	
}
