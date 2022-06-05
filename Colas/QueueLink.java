package Colas;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
	
	public  QueueLink() {
		this.first = null;
	}
	public boolean isEmpty() {
		return this.first == null;
	}
	public void enqueue(E x) {
		if (isEmpty())
			this.first = new Node<E>(x,this.first);
		else {
			Node<E> aux = this.first;
			for(;aux.getNext() != null; aux = aux.getNext());
			aux.setNext(new Node<E>(x));
		}
	}
	public E dequeue() throws ExceptionIsEmpty{
		if(isEmpty()) 
			throw new ExceptionIsEmpty("Queue esta vacio...");
		E item = this.first.getData();
		this.first = this.first.getNext();
		return item;
	}
	public E front() throws ExceptionIsEmpty{
		if(isEmpty()) 
			throw new ExceptionIsEmpty("Queue esta vacio...");
		return this.first.getData();
	}
	public E back() throws ExceptionIsEmpty{
		if(isEmpty()) 
			throw new ExceptionIsEmpty("Queue esta vacio...");
		Node<E> aux = this.first;
		for(;aux.getNext() != null; aux = aux.getNext());
		return aux.getData();
	}
	public String toString() {
		String str = "";
		for(Node<E> aux = this.first; aux != null;aux = aux.getNext()) {
			str += aux.getData() + ", ";
		}
		return str;
	}
}
