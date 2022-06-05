package Pilas;

public class TestStack {
    public static void main(String[]args) {
		
		Stack<Integer> link = new StackLink<Integer>();

		System.out.println("List");
		try {
            //Función push
			link.push(10);
			link.push(11);
			link.push(12);
			link.push(13);
            link.push(14);
            //Función isEmpty
			System.out.println("¿Pila esta vacia?: "+link.isEmpty());
			System.out.println("Pila: "+link+"\n");
            //Función top
			System.out.println("Tope: "+link.top());
            //Función pop
			System.out.println("Tope sacado: "+link.pop());
			System.out.println("Pila: "+link+"\n");
            //Función search
			System.out.println("¿En que posición esta 10?: "+link.search(10));
			
		}
		catch(ExceptionIsEmpty x) {
			System.out.println(x.getMessage());
		}
	}
}
