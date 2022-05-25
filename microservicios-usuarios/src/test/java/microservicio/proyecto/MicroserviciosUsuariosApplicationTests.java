package microservicio.proyecto;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static  org.mockito.Mockito.*;


import org.springframework.boot.test.context.SpringBootTest;

import microservicio.proyecto.Commons.Alumnos.model.Alumno;
import microservicio.proyecto.commons.services.CommonService;
import microservicio.proyecto.repository.AlumnoRepository;
import microservicio.proyecto.service.AlumnoService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.when;

@SpringBootTest
class MicroserviciosUsuariosApplicationTests {


//	@Test
//	void testNombreAlumno() {
//	Alumno alumno = new Alumno("Andres", "aa", (long) 99999);
//	alumno.setNombre("Andres");
//	    String esperado = "Andres";
//		String esperado2 = "aa";
//		String real = alumno.getNombre();
//		String real2 = alumno.getApellido();
//		Assertions.assertEquals(esperado,real);
//		Assertions.assertEquals(esperado2,real2);
//		assertTrue(real.equals("Andres"));
//		
//	}
//	
//	@Test
//	void testAlumnoId() {
//	Alumno alumno =new Alumno("Andres", "aa" , (long) 99999);
//		assertEquals( (long) 99999, alumno.getId());
//		assertFalse(alumno.getId() < 0 );
//
//	}
//	
//	@Test
//	void testAlumnoEmail() {
//	Alumno alumno =new Alumno("Andres", "aa" , (long) 99999);
//		alumno.setEmail("gabrielfe4@gmail.com");
//	assertEquals( "gabrielfe4@gmail.com", alumno.getEmail());
//	
//
//	}
//	
//	@Test
//	void testReferenciaAlumnoId() {
//		Alumno alumno =new Alumno("Andres", "aa" , (long) 123);
//		Alumno alumno2 =new Alumno("Andres", "aa" , (long)123 );
//	
//		assertEquals(alumno2, alumno);
//	
//}

}
