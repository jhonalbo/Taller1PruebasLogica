package co.edu.udea.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.udea.businesslogic.Calculator;
import co.edu.udea.businesslogic.ICalculator;
import co.edu.udea.dtoWs.CollectionDataWs;
import co.edu.udea.dtoWs.ResponseApp;
import co.edu.udea.linkedlist.ListaDobleCircularCabeza;
import co.edu.udea.util.LinkedListGenerator;

@Path("/calculator")
public class MainService {
	
	ICalculator calculator;
	
	@POST
	@Path("/meanSD")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public String getMeanAndSD(String data){
		/*System.out.println(data.getData().get(0));
		float mean = 0;
		float standardDeviation = 0;
		calculator = new Calculator();
		ListaDobleCircularCabeza numberList = null;
		numberList = LinkedListGenerator.generateList(data.getData());
		mean = calculator.calculateMean(numberList);
		standardDeviation = calculator.calculateStandardDeviation(numberList);*/
		/*ResponseApp response = new ResponseApp();
		response.setMean(1f);
		response.setStandardDeviation(1f);*/
		String hola = "hola";
		return hola;
	}
}
