package ���ҵ������ҵ.Thread;

/**
�Ƽ� Runnable �����߳�
1)�����ⵥ�̳еľ�����
2)�����ڹ�����Դ

ʹ��Runnable  �����߳�
1�� ����һ����ʵ��Runnable�ӿ� + ��дrun()      -->��ʵ��ɫ��
2�����ö��߳�  ʹ�þ�̬����
   1)��������ʵ��ɫ
   2)�����������ɫ + ��ʵ��ɫ����
   3)������.start()  �����߳�
   
   
@author Administrator
*
*/
public class Programer implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("һ���ô���....");
		}
	}
	
	public static void main(String[] args) {
		Programer pro  = new Programer();
		Thread proxy = new Thread(pro);
		
		proxy.start();
		for(int i=0;i<1000;i++){
			System.out.println("һ����QQ");
		}
	}
}
