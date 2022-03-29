package collectionsDemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java program";
		char[] charArrayData = s.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(char c : charArrayData) {
			//			System.out.println(c);'
			if(charMap.containsKey(c)) {
				//present logic
				// increase +1 count
				charMap.put(c, charMap.get(c)+1);
//				charMap.get(c)+1
			}else {
				//not present logic 
				// add newly 
				charMap.put(c, 1);
			}

		}
		System.out.println(charMap.entrySet());
		Set<Entry<Character, Integer>> data = charMap.entrySet();
		for(Entry<Character, Integer> entryData : data) {
			if(entryData.getValue() >1) {
				System.out.println("duplicate : "+ entryData);
			}
		}
		
	}

}
