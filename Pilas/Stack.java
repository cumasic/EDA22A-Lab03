package Pilas;

public interface Stack<E> {
    void push(E x);
	E pop() throws ExceptionIsEmpty;
	E top() throws ExceptionIsEmpty;
	int search(E x); 
	boolean isEmpty();
}
