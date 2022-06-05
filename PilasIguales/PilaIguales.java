package PilasIguales;

public class PilaIguales {
    public static void main(String[]args) {
		int[] pila1 = {1,1,1,2,3};
		int[] pila2= {2,3,4};
		int[] pila3 = {1,4,1,1};
		System.out.println("La cantidad en que las 3 pilas son iguales es: "+equalStacks(pila1,pila2,pila3));
	}
    public static int equalStacks(int[] a,int[] b,int[] c) {
        int sum1=0,sum2=0,sum3=0,mayor,i=1,j=1,k=1;
		for(int x:a) 
			sum1 += x;
		for(int x:b) 
			sum2 += x;
		for(int x:c) 
			sum3 += x;
		while(sum1!=sum2 || sum2!=sum3) {
			mayor = Math.max(sum2, sum3);
			mayor = Math.max(mayor, sum1);
			if(mayor==sum1) {
				sum1 = sum1-a[a.length-i];
				i++;
			}
			else if(mayor==sum2) {
				sum2 = sum2-b[b.length-j];
				j++;
			}
			else if(mayor==sum3) {
				sum3 = sum3-c[c.length-k];
				k++;
			}
		}
		return sum1;
    }
}
