
public class Nodo {
	
	public float valor;
	public Nodo anterior;
	public Nodo siguiente;
	
	public Nodo(float n)
	{
		valor 		= n;
		anterior 	= null;
		siguiente 	= null;
	}
	
	public void setSiguiente(Nodo n)
	{
		siguiente = n;
	}
	
	public void setAnterior(Nodo n) 
	{
		anterior = n;
	}
	
	public float getValorr()
	{
		return (valor);
	}
}
