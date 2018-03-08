package co.edu.udea.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.udea.dtoWs.CollectionDataWs;
import co.edu.udea.linkedlist.ListaDobleCircularCabeza;
import co.edu.udea.util.LinkedListGenerator;

@Path("/calculator")
public class MainService {
	
	
	
	@POST
	@Path("/meanSD")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public String getMeanAndSD(CollectionDataWs data){
		System.out.println(data.getData().get(0));
		ListaDobleCircularCabeza numberList = null;
		numberList = LinkedListGenerator.generateList(data.getData());
		
		return "Good";
	}
}
