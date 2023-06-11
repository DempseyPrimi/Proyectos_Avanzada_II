package hn.joan.calculadora_areas;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.After;
/**
 * Unit test for simple App.
 */
public class AppTest {
	@Before
	public void InitConf() {System.out.println("Test en Proceso");}
	//Prueba area Circulo Inicio
	@Test
	public void areaCirculo1() {assertEquals(App.areaCirculo(5.0), 78.54, 0.0001);}
	@Test
	public void areaCirculo2() {assertEquals(App.areaCirculo(6.0), 113.0976, 0.0001);}
	@Test
	public void areaCirculo3() {assertTrue(App.areaCirculo(0.0) == null);}
	//Prueba area circulo Final
	
	//Prueba area Cuadrardo Inicio
	@Test
	public void areaCuadrado1() {assertTrue(App.areaCuadrado(36.0) == 1296);}
	@Test
	public void areaCuadrado2() {assertEquals(App.areaCuadrado(5.0), 25.0, 0.0001);}
	@Test
	public void areaCuadrado3() {assertFalse(App.areaCuadrado(5.0)==20.0);}
	//Prueba area Cuadrado Final
	
	//Prueba area Triangulo Inicio
	@Test
	public void areaTriangulo1 () {assertNull(App.areaTriangulo(0.0, 15.2));}
	@Test
	public void areaTriangulo2 () {assertFalse(App.areaTriangulo(6.5, 5.2)==20.0);}
	@Test
	public void areaTriangulo3 () {assertNotNull(App.areaTriangulo(13.5,16.8));}
	//Prueba area Triangulo Final
	
	//Prueba area Rectangulo Inicio
	@Test
	public void areaRectangulo1 () {assertNotNull(App.areaRectangulo(0.9, 0.5));}
	@Test
	public void areaRectangulo2 () {assertEquals(App.areaRectangulo(4.5, 6.0), 27, 0.0001);}
	@Test
	public void areaRectangulo3 () {assertTrue(App.areaRectangulo(5.0, 6.0) == 30);}
	//Prueba area Rectangulo Final
	@After
	public void FinalConf() {System.out.println("Test finalizado");}
}
