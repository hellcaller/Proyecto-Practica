package microservicio.proyecto.cursos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import microservicio.proyecto.Commons.Alumnos.model.Alumno;
import microservicio.proyecto.cursos.model.Curso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

@SpringBootTest
class MicroserviciosCursosApplicationTests {

	@Test
	void testNombreCurso() {
		Curso curso = new Curso();
		curso.setNombre("analisis");
		String esperado = "analisis";
		String esperado2 = "aa";
		String real = curso.getNombre();
	
		Assertions.assertEquals(esperado,real);
		
		assertTrue(real.equals("analisis"));
		
		
	}

	@Test
	void testCursoId() {
		Curso curso = new Curso();
		curso.setNombre("analisis");
		curso.setId((long) 5);
		assertEquals( (long)5, curso.getId());
		assertFalse(curso.getId() < 0 );

		
	}
	
	

}
