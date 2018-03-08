package co.edu.udea.businesslogic;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.linkedlist.ListaDobleCircularCabeza;

public class PruebasLogica {
	
	Calculator calculator = new Calculator();
	float[] vector = {};
	ListaDobleCircularCabeza lista = new ListaDobleCircularCabeza();
	
	@Test
	public void promVacio() {		
		float[] vector = {};
		lista = lista.llenarLista(vector);
		assertEquals(0, calculator.calculateMean(lista), 0.005f);
	}
	
	@Test
	public void desvVacio() {		
		float[] vector = {};
		lista = lista.llenarLista(vector);
		assertEquals(0, calculator.calculateStandardDeviation(lista), 0.005f);
	}
	
	@Test
	public void promCero() {		
		float[] vector = {0f};
		lista = lista.llenarLista(vector);
		assertEquals(0, calculator.calculateMean(lista), 0.005f);
	}
	
	@Test
	public void desvCero() {		
		float[] vector = {0f};
		lista = lista.llenarLista(vector);
		assertEquals(0, calculator.calculateStandardDeviation(lista), 0.005f);
	}
	
	@Test
	public void promUno() {		
		float[] vector = {1f};
		lista = lista.llenarLista(vector);
		assertEquals(1, calculator.calculateMean(lista), 0.005f);
	}
	
	@Test
	public void desvUno() {		
		float[] vector = {1f};
		lista = lista.llenarLista(vector);
		assertEquals(1, calculator.calculateStandardDeviation(lista), 0.005f);
	}
	
	@Test
	public void promUnoAlCuatro() {		
		float[] vector = {1f, 2f, 3f, 4f};
		lista = lista.llenarLista(vector);
		assertEquals(2.5, calculator.calculateMean(lista), 0.005f);
	}
	
	@Test
	public void desvUnoAlCuatro() {		
		float[] vector = {1f, 2f, 3f, 4f};
		lista = lista.llenarLista(vector);
		assertEquals(1.2910, calculator.calculateStandardDeviation(lista), 0.005f);
	}
}
