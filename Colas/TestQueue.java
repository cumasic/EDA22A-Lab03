package Colas;

public class TestQueue {
    public static void main(String[]args) {
		
		Queue<Integer> link = new QueueLink<Integer>();

		System.out.println("Cola");
		try {
            //función enqueue
			link.enqueue(2);
			link.enqueue(3);
			link.enqueue(4);
			link.enqueue(5);
            //función isEmpty
            System.out.println("¿Cola esta vacia?: "+link.isEmpty());
			//función front
			System.out.println("El primero es: "+link.front());
            //función back
            System.out.println("El ultimo es: "+link.back());
            System.out.println(link);
            //función dequeue
			System.out.println("Se saca: "+link.dequeue());
			System.out.println(link);
			
		}
		catch(ExceptionIsEmpty x) {
			System.out.println(x.getMessage());
		}
	}
}
