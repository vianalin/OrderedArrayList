import java.util.ArrayList;
//NoNullArrayList is an ArrayList of T that cannot take a null as a value.
//1. Override set and both add methods
//a) Check the method signatures of add() add(index) and set(index,value) so you override correctly. The return types are important!
//b) They should all throw an IllegalArgumentException when null is added, otherwise call the old add method.
//2. Write 2 constructors: default + startingCapacity.
//tdlr: rejects null values with an IllegalArgumentException
public class NoNullArrayList<T> extends ArrayList<T> {
	//2. constructors:
	public NoNullArrayList() {
		super();
	}
	public NoNullArrayList(int startingCapacity) {
		super(startingCapacity);
	}

	//1. override set and both add methods:
	public boolean add(T t) throws IllegalArgumentException {
		if(t == null) throw new IllegalArgumentException();
		return super.add(t);
	}

	public void add(int index, T t) throws IllegalArgumentException {
		if(t == null) throw new IllegalArgumentException();
		super.add(index, t);
	}

	public T set(int index, T t) throws IllegalArgumentException {
		if(t == null) throw new IllegalArgumentException();
		return super.set(index, t); 
	}
}