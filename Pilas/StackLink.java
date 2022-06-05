package Pilas;

public class StackLink<E> implements Stack<E>{
    private Node<E> tope;
	
	public StackLink() {
		this.tope = null;
	}
	public boolean isEmpty() {
		return this.tope == null;
	}
	public void push(E x) {
		this.tope = new Node<E>(x,this.tope);
	}
	public E top() throws ExceptionIsEmpty{
		if(isEmpty()) 
			throw new ExceptionIsEmpty("Stack esta vacio...");
		E item = this.tope.getData();
		return item;
	}
	public E pop() throws ExceptionIsEmpty{
		if(isEmpty()) 
			throw new ExceptionIsEmpty("Stack esta vacio...");
		
		E item = this.tope.getData();
		this.tope = new Node<E>(this.tope.getNext().getData(),this.tope.getNext().getNext());
		return item;
	}
	
	public String toString() {
		String str = "";
		int i = 0;
		Node<E> aux1 = this.tope;
		for(; aux1 != null;aux1 = aux1.getNext(),i++);
		while(i>0) {
			Node<E> aux2 = this.tope;
			for(int j=i;j-1>0; aux2 = aux2.getNext(),j--);
			str += aux2.getData() + ", ";
			i--;
		}
		return str;
	}
	public int search(E x) {
		Node<E> aux = this.tope;
		int i = 0;
		while(aux != null && !aux.getData().equals(x)) {
			aux = aux.getNext();
			i++;
		}
		if(aux != null)
			return i;
		return -1;
	}
}
