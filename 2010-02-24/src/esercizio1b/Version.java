package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
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

