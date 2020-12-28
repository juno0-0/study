package genericExtends;

public interface Stoarge<T> {
	public void add(T item, int index);
	public T get(int index);
}
