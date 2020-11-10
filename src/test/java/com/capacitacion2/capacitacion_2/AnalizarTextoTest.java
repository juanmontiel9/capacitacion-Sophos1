package com.capacitacion2.capacitacion_2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase5.AnalizarTexto;

public class AnalizarTextoTest {
	
	private AnalizarTexto objAnalizarTexto;
	private String oracion;
	
	@Before
	public void before() {
		System.out.println("Se ejecuto antes before()");
	    oracion = " esta clase es de pruebas unitarias ";
		objAnalizarTexto = new AnalizarTexto(oracion);
		
	}
	
	@Test
	public void testContarNumeroDePalabras() {
    	System.out.println("Se ejecuto test determinarNumeroDePalabras()");
    	int valorEsperado = 6;
    	int valorRecibido = objAnalizarTexto.contarNumeroDePalabras();
    	assertEquals(valorEsperado, valorRecibido);
	}

	@Test
	public void testcantidadCaracteres() {
		System.out.println("test cantidadCaracteres()");
		int esperado = 36;
		int resultado = objAnalizarTexto.cantidadCaracteres();
		assertEquals(esperado, resultado);
	}
	@After
	public void after() {
		
		System.out.println("Se ejecuto after()");
		
	}
}
