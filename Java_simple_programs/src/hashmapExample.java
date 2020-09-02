import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class hashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Sachin");
		
		hmap.put(10, "Shewag");
		hmap.put(20, "Sourav");
		hmap.put(13, "Gilchrist");
		hmap.put(11, "Dravid");
				
		Set s= hmap.entrySet(); 
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry mentry =( Map.Entry)it.next();
			System.out.println("Key is :" +mentry.getKey() +" Value is :"+mentry.getValue());
		}
		System.out.println(hmap.containsKey(111));
		System.out.println(hmap.containsValue("Sachin"));
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "Sachin");
		tmap.put(11, "Dravid");
		tmap.put(25, "Shewag");
		tmap.put(36, "Sourav");
		tmap.put(13, "Gilchrist");
		tmap.remove(25);				
		
		Set s1= tmap.entrySet();
		Iterator it1 = s1.iterator();
		while(it1.hasNext())
		{
			Map.Entry mentry1 =( Map.Entry)it1.next();
			System.out.println("Key is :" +mentry1.getKey() +" Value is :"+mentry1.getValue());
		}
		
		
	}

}
