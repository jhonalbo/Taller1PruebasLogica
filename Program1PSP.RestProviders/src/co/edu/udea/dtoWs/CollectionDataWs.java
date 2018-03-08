package co.edu.udea.dtoWs;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CollectionDataWs {
	
	private List<Float> data;

	public List<Float> getData() {
		return data;
	}

	public void setData(List<Float> data) {
		this.data = data;
	}
	
	
}
