package genericExtends;

public class StorageImpl<T> implements Stoarge<T>{
	private T[] array;
	@Override
	public void add(T item, int index) {
		array[index]=item;
	}
	@Override
	public T get(int index) {
		return array[index];
	}
	
	public StorageImpl(int capacity) {
		array = (T[])(new Object[capacity]);//Ÿ���Ķ���ͷ� �迭�� ����
	}
}
