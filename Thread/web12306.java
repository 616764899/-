package 红岩第五次作业.Thread;

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
		//真实角色
		web12306 web = new web12306();
		//代理
		Thread t1 = new Thread(web,"帅哥梅");
		Thread t2 = new Thread(web,"大傻");
		Thread t3 = new Thread(web,"大笨");
		//启动线程
		t1.start();
		t2.start();
		t3.start();
		
	}
	//线程安全     锁定正确     锁定范围大了效率低，锁定范围小了线程不安全
	public /*synchronized*/ void text(){
		synchronized(this){
			if(num<=0){
				return;
			}
			try {
				Thread.sleep(100);  //停止当前线程自定义时间  继续进行其他线程  模拟售票网络延时
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到了第"+num--+"张票");
		}
	}
}
