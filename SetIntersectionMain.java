import java.util.*;

public class SetIntersectionMain {
	public static void main (String[] args) {
		Integer[] a = {1, 3, 9, 10};
		Integer[] b = {1, 3, 5, 6, 7, 8, 9};
		
		if (a.length < b.length) {
			union(a, b);
		} else 
			union(b, a);{
		}

		HashSet<Integer> c = union(a, b);
		System.out.println(c);
	}
		
	public static HashSet<Integer> union(Integer[] a, Integer[] b) {
		HashSet<Integer> setA = new HashSet<Integer>(Arrays.asList(a));
		HashSet<Integer> setB = new HashSet<Integer>(Arrays.asList(b));
		
		HashSet<Integer> result = new HashSet<Integer>();	
		
		Iterator<Integer> it = setA.iterator();
		while (it.hasNext()) {
			Integer n = it.next();
			if (setB.contains(n)) {
				result.add(n);
			}
		}

		return result;
	}	
}
