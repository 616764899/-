package ���ҵ������ҵ.level4;

public class App {
	public static void main(String[] args) {
		//��ͬ�Ŀ���
		kuaizi k = new kuaizi();
		
		//���߳�
		scientists sci = new scientists(k);
		scientists1 sci1 = new scientists1(k);
		scientists2 sci2 = new scientists2(k);
		scientists3 sci3 = new scientists3(k);
		scientists4 sci4 = new scientists4(k);
		
		new Thread(sci).start();
		new Thread(sci1).start();
		new Thread(sci2).start();
		new Thread(sci3).start();
		new Thread(sci4).start();
	}
}
