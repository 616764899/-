package ���ҵ������ҵ.Thread;

/**
 * ģ���������
 1���������߳�  �̳�Thread +  ��дrun(�߳���)
 2��ʹ���̣߳������������

 * @author Administrator
 *
 */
public class Ribbit extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("��������"+i+"��");
		}
	}
	
	public static void main(String[] args) {
		//�����������
		Ribbit rib = new Ribbit();
		Tortoise tor = new Tortoise();
		//���� start ����
		/*
		��Ҫ����run������ֱ�ӵ���run����ֻ����ͨ�ĵ���
		����start�����൱�ڰ�rab����������߳�Ҫִ�е�������׼����ʼִ��
		 */
		rib.start();
		tor.start();
	}
}

class Tortoise extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("�ڹ�����"+i+"��");
		}
	}
}
