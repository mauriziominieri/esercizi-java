/*
 * (Version, 2010-2-24)
La classe Version rappresenta una versione di un programma. Una versione può avere due o tre
parti intere ed, opzionalmente, un'etichetta alpha o beta. (15 punti)
La classe Version deve implementare l'interfaccia Comparable<Version>, in modo che una versione
sia minore di un'altra se la sua numerazione è precedente a quella dell'altra. Le etichette alpha
e beta non inuiscono sull'ordinamento. (12 punti)
Rispettare il seguente caso d'uso, compreso il formato dell'output.
Esempio d'uso:
Version v1 = new Version(1, 0);
Version v2 = new Version(2, 4, Version.alpha);
Version v3 = new Version(2, 6, 33);
Version v4 = new Version(2, 6, 34, Version.beta);
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);
System.out.println(v4);
System.out.println(v1.compareTo(v2));
System.out.println(v4.compareTo(v3));
Output dell'esempio d'uso:
1.0
2.4alpha
2.6.33
2.6.34beta
-1
1
 */
public class Version implements Comparable<Version> {
	
	protected static String alpha="alpha",beta="beta";
	private Integer parte1,parte2,parte3;
	private String label;

	public Version(int p1,int p2) {
		parte1=p1;
		parte2=p2;
	}
	
	public Version(int p1,int p2, String s) {
		parte1=p1;
		parte2=p2;
		label=s;
	}
	
	public Version(int p1,int p2, int p3) {
		parte1=p1;
		parte2=p2;
		parte3=p3;
	}
	
	public Version(int p1,int p2,int p3, String s) {
		parte1=p1;
		parte2=p2;
		parte3=p3;
		label=s;
	}
	
	public String toString() {
		
		if(parte3!=null && label!=null)
			return parte1+"."+parte2+"."+parte3+label;
		else if(parte3!=null)
			return parte1+"."+parte2+"."+parte3;
		else if(label!=null)
			return parte1+"."+parte2+label;
		else
			return parte1+"."+parte2;
	}
	
	
	@Override
	public int compareTo(Version o) {
		if(this.parte1>o.parte1) return 1;
		else if(this.parte1<o.parte1) return -1;
		else {
			if(this.parte2>o.parte2) return 1;
			else if(this.parte2<o.parte2) return -1;
			else {
				if(this.parte3>o.parte3) return 1;
				else if(this.parte3<o.parte3) return -1;
				else return 0;
			}
		}
	}
}

class Test{
	public static void main(String[] args) {
		Version v1 = new Version(1, 0);
		Version v2 = new Version(2, 4, Version.alpha);
		Version v3 = new Version(2, 6, 33);
		Version v4 = new Version(2, 6, 34, Version.beta);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v1.compareTo(v2));
		System.out.println(v4.compareTo(v3));
	}
}