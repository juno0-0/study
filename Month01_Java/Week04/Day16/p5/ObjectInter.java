package p5;

public interface ObjectInter {
	//���
	static final int MAX=99999;
	static final int MIN=-99999;
	//�߻�޼ҵ�
	public abstract void calc();
	public abstract void avg();
	//�ν��Ͻ��޼ҵ�
	default void number() { }
	//�����޼ҵ�
	static void stnumber() { }
	
}
