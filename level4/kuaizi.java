package ���ҵ������ҵ.level4;
/**
 * ��ѧ�����������ߵĿ���,��ͬ����Դ
 * �źŵƷ�
 * wait():�ȴ�,�ͷ���     sleep():������˯��,���ͷ���
 * ����:notify() , notifyAll()
 * @author Administrator
 *
 */
public class kuaizi {
	 //����5��˽�˷���Ա�����Լ�����Ŀ�ѧ���ÿ��ӳԷ�ʱ������������������ѧ���ÿ���
	 int waiter0 = 0;
	 int waiter1 = 0;
	 int waiter2 = 0;
	 int waiter3 = 0;
	 int waiter4 = 0;
	
	//��ѧ��0�������ߵĿ���
	public synchronized void scikuaizi0(){ 
		//����һ�����ڿ�ѧ�����˿��ӣ����ȵȴ�
		if(waiter1==1 || waiter4==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter0 = 1;
		//��ʼ�ÿ��ӳԷ�
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��ѧ��0�����������ߵĿ��ӳԷ�");
		//���극�ѿ����ó�ȥ
		this.notifyAll();
		//�����ȴ�
		this.waiter0 = 0;
	}
	
	//��ѧ��1�������ߵĿ���
	public synchronized void scikuaizi1(){ 
		if(waiter0==1 || waiter2==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter1 = 1;
		//��ʼ�ÿ��ӳԷ�
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��ѧ��1�����������ߵĿ��ӳԷ�");
		//���극�ѿ����ó�ȥ
		this.notifyAll();
		//�����ȴ�
		this.waiter1 = 0;
	}
	
	//��ѧ��2�������ߵĿ���
	public synchronized void scikuaizi2(){ 
		if(waiter1==1 || waiter3==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter2 = 1;
		//��ʼ�ÿ��ӳԷ�
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��ѧ��2�����������ߵĿ��ӳԷ�");
		//���극�ѿ����ó�ȥ
		this.notifyAll();
		//�����ȴ�
		this.waiter2 = 0;
	}
	
	//��ѧ��3�������ߵĿ���
	public synchronized void scikuaizi3(){ 
		if(waiter2==1 || waiter4==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter3 = 1;
		//��ʼ�ÿ��ӳԷ�
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��ѧ��3�����������ߵĿ��ӳԷ�");
		//���극�ѿ����ó�ȥ
		this.notifyAll();		
		//�����ȴ�
		this.waiter3 = 0;
	}
	
	//��ѧ��4�������ߵĿ���
	public synchronized void scikuaizi4(){
		if(waiter3==1 || waiter0==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter4 = 1;
		//��ʼ�ÿ��ӳԷ�
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println("��ѧ��4�����������ߵĿ��ӳԷ�");
		//���극�ѿ����ó�ȥ
		this.notifyAll();		
		//�����ȴ�
		this.waiter4 = 0;
	}
	
}
