public class Tester {
	public static void main(String[] args) {
		//testing nonullarraylist 
		NoNullArrayList<Integer> a = new NoNullArrayList<>();
		
		a.add(1);
		a.set(0, 2);
		a.add(4);

		//a.add(null); //testing add(t) null
		a.set(1, null); //testing set null
	
		for(int i : a) {
			System.out.println(i);
		}
	}
}