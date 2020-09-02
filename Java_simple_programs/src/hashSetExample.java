import java.util.HashSet;
import java.util.TreeSet;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> hs= new TreeSet<String>();
		hs.add("amla");
		hs.add("Sachin");
		hs.add("Shwag");
		hs.add("Dravid");
		hs.add("Ganguly");
		System.out.println("Values are : "+hs);
		hs.add("Sachin");
		hs.add("Dravid");
		hs.add("Ganguly");
		hs.add("");
		hs.add("");
		hs.add("Ganguly");
		hs.add("Ganguly");
		System.out.println("Values are : "+hs);
		hs.add("Gilchrist");
		System.out.println("Values are : "+ hs);
	}

}
