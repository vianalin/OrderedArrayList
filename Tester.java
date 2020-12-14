public class Tester {
	public static void main(String[] args) {
		//testing nonullarraylist 
		NoNullArrayList<Integer> a = new NoNullArrayList<>();
		a.add(5);
		for(int i : a) { //testing add
			System.out.println(i);
		}
	}
}