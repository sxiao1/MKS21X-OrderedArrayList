public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
	public OrderedArrayList(){
		super();
	}
	public OrderedArrayList(int startingCapacity){
		super(startingCapacity);
	}
	public int index(T value){
		for(int i = 0; i < size(); i++){
			if (value.compareTo(this.get(i)) <= 0){
				return i;
			}
		}
		return size();
	}
	public boolean add(T element){
		int num = index(element);
		super.add(num, element);
		return this.get(num) == element;
	}
	public void add(int index, T element){
		int num = index(element);
		super.add(num, element);
	}
	public T set(int index, T element){
		T element1 = super.get(index);
		super.remove(index);
		add(element);
		return element1;
	}
}
