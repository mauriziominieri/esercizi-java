package esercizio4;

import java.util.Comparator;

/**
 * @author Maurizio Minieri
 * mauminieri@gmail.com
 * www.mauriziominieri.it 
 **/

class MyComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		return 1;
	}
	
}

public class Main {
	
	public static <T> int countInBetween(T[] array, MyComparator<T> c, T a, T b) {
		int count = 0;
		for (T x : array) {
			if(x > a && x < b)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 8;
		array[2] = 5;
		
		MyComparator<Integer> c = new MyComparator<Integer>();
		int a = 1;
		int b = 3;
		
		System.out.println(countInBetween(array,c,a,b));
	}
}
