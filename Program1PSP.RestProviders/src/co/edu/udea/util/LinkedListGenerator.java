package co.edu.udea.util;

import java.util.List;

import co.edu.udea.linkedlist.ListaDobleCircularCabeza;

public class LinkedListGenerator {
	
	public static ListaDobleCircularCabeza generateList(List<Float> numbers){
		ListaDobleCircularCabeza dataList = null;
		dataList = new ListaDobleCircularCabeza();
		for (Float number : numbers) {
			dataList.AgregarNodo(number);
		}
		return dataList;
	}

}
