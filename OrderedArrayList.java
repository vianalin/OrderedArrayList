import java.util.ArrayList;
//An OrderedArrayList is an ArrayList that maintains all elements in order from least to greatest. 
//This requires that it is Comparable and that there are no null values, which is why it will extend the NoNullArrayList
//This is a NoNullArrayList that maintains all elements in a sorted order upon insertion.
//1. Override both add methods: 
     //First find the index where the new element should be added, then add() the new element into that position.
//2. Override set(index,value)
     //The new behavior is it will remove() the element at index, then add() the new value.
//3. Constructors: default + startingCapacity constructors.
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
//This is because the type needs to be comparable to the same type or you cannot sort the items.
	//3. constructors:
	public OrderedArrayList() {
		super();
	}
	public OrderedArrayList(int initialCapacity) {
		super(initialCapacity);
	}

	//1. override both add methods:
	public boolean add(T element) throws IllegalArgumentException {
		if(element == null) throw new IllegalArgumentException();
		int index = -1;
		for(int i = 0; i < this.size(); i++) {
			if(element.compareTo(this.get(i)) < 0) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			if(this.size() == 0) index = 0;
			else index = this.size();
		}
		super.add(index, element);
		return true;
	}
	
	public void add(int index, T element) throws IllegalArgumentException{
		add(element);
	}

	//2. override set index
	public T set(int index, T element) throws IllegalArgumentException {
		T result = remove(index);
		add(element);
		return result;
	}
}