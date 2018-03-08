package co.edu.udea.businesslogic;


import co.edu.udea.linkedlist.ListaDobleCircularCabeza;
import co.edu.udea.linkedlist.Nodo;

public class Calculator implements ICalculator{

	@Override
	public float calculateMean(ListaDobleCircularCabeza dataList) {
		try{			
			if(dataList.cantidad>0){
				float promedio = dataList.RetornarSuma()/dataList.cantidad;
				return promedio;
			}else{
				return 0;
			}
		}catch(Exception e){
			return 0;
		}
	}

	@Override
	public float calculateStandardDeviation(ListaDobleCircularCabeza dataList) {
		if(dataList.cantidad>0){
			boolean continuar = true;
			Nodo nodo = dataList.cabeza;
			float valorActual = 0;
			float promedio = dataList.RetornarSuma()/dataList.cantidad;
			while(continuar){
				System.out.println(nodo.valor);
				valorActual += (float) Math.pow(nodo.valor-promedio, 2);
				nodo = nodo.siguiente;
				if(nodo == dataList.ultimo){
					continuar=false;
				}
				
			}
			
			valorActual += (float) Math.pow(nodo.valor-promedio, 2);
			valorActual = valorActual/(dataList.cantidad -1);
			
			
			float desviacion = (float) Math.sqrt(valorActual);
			return desviacion;
		}else{
			return 0;
		}
		
	}
	
	public static void main(String[] args){
		float[] numeros = {1f,2f,3f,4f};
		ListaDobleCircularCabeza lista = new ListaDobleCircularCabeza();
		lista  = lista.llenarLista(numeros);
		Calculator c = new Calculator();
		System.out.println("promedio: "+c.calculateMean(lista));
		System.out.println("desviacion estandar: "+c.calculateStandardDeviation(lista));
	}

//	public static float calcularDesviacionEstandar(ListaLigada numeros){
//		if(numeros==null){
//			return 0;
//		}
//		if(numeros.cantidad==0){
//			return 0;
//		}
//		
//		boolean continuar = true;
//		Nodo nodo = numeros.cabeza;
//		float sumatoria = 0;
//		float promedio = numeros.RetornarSuma()/numeros.cantidad;
//		//System.out.println(":: "+promedio);
//		while(continuar){
//
//			sumatoria += (float) Math.pow(nodo.valor-promedio, 2);
////			System.out.println(sumatoria);
//			nodo=nodo.siguiente;
//			if(nodo == numeros.ultimo){
////				System.out.println("entro");
//				continuar=false;
//			}
//			
//		}
//		
//		sumatoria += (float) Math.pow(nodo.valor-promedio, 2);
//		
//		System.out.println(sumatoria);
//		
//		sumatoria = sumatoria/(numeros.cantidad -1);
//		
//		
//		float desviacion = (float) Math.sqrt(sumatoria);
//		return desviacion;
//	}
}