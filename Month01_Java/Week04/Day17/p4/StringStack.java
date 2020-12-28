package p4;

public class StringStack implements StackInterface{
	private String[] elements;
	private int index;
	
	public StringStack(int capacity) {
		elements = new String[capacity];
		index=0;
	}
	
	@Override
	public int length() {
		return index;
	}

	@Override
	public String pop() {
		if(index==0) {
			return null;
		}
		index--;
		return elements[index];
	}

	@Override
	public boolean push(String ob) {
		if(index==elements.length) return false;
		elements[index++]=ob;
		return true;
	}

}
