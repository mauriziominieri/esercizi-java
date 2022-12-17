import java.util.*;

/*
 * La seguente classe A fa riferimento ad una classe B. Implementare la classe B in modo che venga
compilata correttamente e permetta la compilazione della classe A.
 */

public class A extends B {
	
	public A() {             
		//sottoclasse B: il costruttore: B(){super(5)} va cercando il costruttore A(int n){...}
		//sottoclasse B: il costruttore B(){} va cercando il costruttore A(){...}, ovviamente se scrivo il costruttore così: B(){super();} è la stessa cosa
		//attenzione perchè è vero che la classe A ha il costruttore implicito A(){}, quindi non c'è bisogno di scriverlo, però se inseriamo un costr per esempio A(int x){}, allora in quel caso DEVI definirlo, altrimenti è come se non ci fosse
		
		b1 = new B.C(true);   //capisco che C deve avere un costruttore che accetta un booleano, però dato che b1 è di tipo B allora capisco che anche B deve avere tale costruttore e C è sua sottoclasse
		b2 = new B(false);    //capisco che B deve avere un costruttore che accetta un booleano
	}
	
	public B f(Object o) {
		B x = super.f(o);   //capisco che B deve avere un metodo f che restituisce un oggetto B e ha un Object come parametro
		return x.clone();   //capisco che deve avere il metodo clone
	}
	
	private B.C c = new B.C(3);   //capisco che C deve avere un costruttore che accetta un intero, inoltre da B.C capisco che C è interna a B
	private B b1, b2;
}

class B implements Cloneable {
	
	public B() {}
	public B(boolean b) {}
	
	public B f(Object o) {
		B b = new B();
		return b;
	}
	
	public B clone() {
		try {
			B b = (B) super.clone();
			return b;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	class C extends B {
		
		public C(int n) {}
		public C(boolean b) {}
	}
}



class Test {
	public static void main(String[] args) {
		
	}
}