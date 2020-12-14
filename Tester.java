public class Tester {
	public static void main(String[] args) {
		//testing nonullarraylist 
		NoNullArrayList<Integer> a = new NoNullArrayList<>();
		
		a.add(1); //testing add(element)
		a.set(0, 2); //testing set
		a.add(4); //testing add(element)
		a.add(1, 6); //testing add(index,elemt)
		

		//a.add(null); //testing add(t) null
		//a.set(1, null); //testing set null
		//a.add(3, null); //testing add(index, t) null
	
		for(int i : a) {
			System.out.println(i);
		}
	}
}