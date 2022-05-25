package microserviciosrespuestas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import microserviciosrespuestas.models.entity.Respuesta;

@SpringBootTest
class MicroserviciosRespuestasApplicationTests {

	@Test
	void testTextoRespuesta() {
	Respuesta respuesta = new Respuesta("1", "la respuesta es la 1");
	    respuesta.setTexto("la respuesta es la 1");
	    String esperado = "la respuesta es la 1";
		String esperado2 = "la respuesta es la 1";
		String real = respuesta.getTexto();
		String real2 = respuesta.getTexto();
		Assertions.assertEquals(esperado,real);
		Assertions.assertEquals(esperado2,real2);
	    assertTrue(real.equals("la respuesta es la 1"));
	
	}
	
	
		@Test
	void testRespuestaTexto() {
	Respuesta respuesta = new Respuesta("1", "la respuesta es la 1");
	
	assertEquals( "la respuesta es la 1", respuesta.getTexto());
		}
		
		@Test
		void testRespuestaId() {
		Respuesta respuesta = new Respuesta("1", "la respuesta es la 1");
		
		assertEquals( "1", respuesta.getId());
			}
				
		@Test
		void AlumnoId() {
		Respuesta respuesta = new Respuesta("1", "la respuesta es la 1");
		 respuesta.setAlumnoId((long) 5);
		 assertEquals( (long) 5, respuesta.getAlumnoId());
			}

}
