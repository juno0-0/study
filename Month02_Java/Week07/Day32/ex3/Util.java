package ex3;

public class Util<K, V> {
//	public static<K,V> V getValue(Pair<K,V> p, K k){//Pair Ÿ�Ը� �ޱ�
//		if(p.getKey().equals(k))return p.getValue();
//		else return null;
//	}
	public static<P extends Pair<K,V>,K, V> V getValue(P p, K k) {//Pair Ÿ�԰� ����Ÿ��
		if(p.getKey().equals(k))return p.getValue();
		else return null;
	}

	
}
