package co.edu.udea.linkedlist;

public class ListaDobleCircularCabeza {
	public Nodo cabeza;
	public int	cantidad;
	public Nodo ultimo;
	
	float suma;

	public ListaDobleCircularCabeza(float n)
	{
		cabeza = new Nodo(n);
		ultimo = cabeza;
		cantidad = 1;
	}
	
	public ListaDobleCircularCabeza()
	{
		cabeza = null;
		ultimo = cabeza;
		cantidad = 0;
	}

	public void AgregarNodo(float n)
	{
		Nodo nNodo = new Nodo(n);
		suma += n;
		
		//nNodo.AsignarSiguiente(ultimo);
		if (cantidad == 0)
		{
			cabeza = nNodo;
			ultimo = nNodo;
		}else{
			ultimo.setSiguiente(nNodo);
			ultimo=nNodo;
		}
		
		cantidad ++;
	}
	
	public float RetornarSuma()
	{
		return suma;
	}
	
	public int RetornarCantidad()
	{
		return cantidad;
	}
}
