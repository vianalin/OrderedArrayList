public class Tester {
	public static void main(String[] args) {
		//testing nonullarraylist 
		NoNullArrayList<Integer> a = new NoNullArrayList<>();
		a.set(0, null);
		for(int i : a) { //testing set
			System.out.println(i);
		}
	}
}