package ���ҵ������ҵ.Thread;

public class web12306 implements Runnable{

	private int num = 50;
	private boolean bool = true;
	@Override
	public void run() {
		while(bool){
			text();
		}
	}
	public static void main(String[] args) {
		//��ʵ��ɫ
		web12306 web = new web12306();
		//����
		Thread t1 = new Thread(web,"˧��÷");
		Thread t2 = new Thread(web,"��ɵ");
		Thread t3 = new Thread(web,"��");
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
		
	}
	//�̰߳�ȫ     ������ȷ     ������Χ����Ч�ʵͣ�������ΧС���̲߳���ȫ
	public /*synchronized*/ void text(){
		synchronized(this){
			if(num<=0){
				return;
			}
			try {
				Thread.sleep(100);  //ֹͣ��ǰ�߳��Զ���ʱ��  �������������߳�  ģ����Ʊ������ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"�����˵�"+num--+"��Ʊ");
		}
	}
}
