package Array;

public class Reverse_String {

	public static void main(String[] args) {
	String name = "Atish";
	String val="";
	int len = name.length();
	for(int i=len-1;i>=0;i--) {
		val =val+name.charAt(i);
	}
	System.out.println(val);
	
	//         Second Approch
	StringBuffer r = new StringBuffer(name);
	System.out.println(r.reverse());
	
	//          Third Approch
	 StringBuilder rey = new StringBuilder(name);
	System.out.println(rey.reverse());
	
	}
}
