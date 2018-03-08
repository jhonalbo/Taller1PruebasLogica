//package co.edu.udea.businesslogic;
//
//public class Calculator {
//	
//	public static Float media(Float[] numeros){
//		Float sum = 0f;
//		int cont = 0;
//		for(Float n : numeros){
//			sum = sum + n;
//			cont++;
//		}
//		Float prom = sum/cont;
//		return prom;
//	}
//	
//	public static void main(String[] args){
//		Float[] numeros = {1f, 2f, 4f, 0f};
//		System.out.println(media(numeros));
//	}
//
//}


package co.edu.udea.businesslogic;


import co.edu.udea.linkedlist.ListaDobleCircularCabeza;

public class Calculator implements ICalculator{

	@Override
	public float calculateMean(ListaDobleCircularCabeza dataList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calculateStandardDeviation(ListaDobleCircularCabeza dataList) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	public static float calcularPromedio(ListaLigada numeros){
//		try{
//			
//		if(numeros.cantidad>0){
//			float promedio = numeros.RetornarSuma()/numeros.cantidad;
//			System.out.println(promedio);
//			return promedio;
//		}else{
//			return 0;
//		}
//		}catch(Exception e){
//			return 0;
//		}
//	}
//	
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