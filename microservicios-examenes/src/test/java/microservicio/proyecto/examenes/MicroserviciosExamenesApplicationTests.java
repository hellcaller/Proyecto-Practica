package microservicio.proyecto.examenes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import common.examenes.model.Asignatura;

@SpringBootTest
class MicroserviciosExamenesApplicationTests {


	@Test
	void testNombreAsignatura() {
	Asignatura asignatura = new Asignatura();
	asignatura.setNombre("diseño");
	asignatura.setPadre(asignatura);
	asignatura.setHijos(null);
    String esperado = "diseño";
	String esperado2 = "diseño";
	Asignatura esperado3 = asignatura;
	String real = asignatura.getNombre();
	String real2 = asignatura.getNombre();
	Asignatura real3 = asignatura.getPadre();
	
	Assertions.assertEquals(esperado,real);
		Assertions.assertEquals(esperado2,real2);
		Assertions.assertEquals(esperado3,real3);
		assertTrue(real.equals("diseño"));
		
	}
	
	
	
		@Test
	void testAsignaturaId() {
		Asignatura asignatura = new Asignatura();
		asignatura.setId((long) 99999);
		assertEquals( (long) 99999, asignatura.getId());
	assertFalse(asignatura.getId() < 0 );

	}
}
