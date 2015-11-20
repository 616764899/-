package 红岩第五次作业.level4;
/**
 * 科学家们左右两边的筷子,共同的资源
 * 信号灯法
 * wait():等待,释放锁     sleep():抱着锁睡觉,不释放锁
 * 唤醒:notify() , notifyAll()
 * @author Administrator
 *
 */
public class kuaizi {
	 //这是5个私人服务员，在自己管理的科学家拿筷子吃饭时不允许其相邻两个科学家拿筷子
	 int waiter0 = 0;
	 int waiter1 = 0;
	 int waiter2 = 0;
	 int waiter3 = 0;
	 int waiter4 = 0;
	
	//科学家0左右两边的筷子
	public synchronized void scikuaizi0(){ 
		//任意一个相邻科学家拿了筷子，我先等待
		if(waiter1==1 || waiter4==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter0 = 1;
		//开始拿筷子吃饭
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("科学家0拿了左右两边的筷子吃饭");
		//吃完饭把筷子让出去
		this.notifyAll();
		//继续等待
		this.waiter0 = 0;
	}
	
	//科学家1左右两边的筷子
	public synchronized void scikuaizi1(){ 
		if(waiter0==1 || waiter2==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter1 = 1;
		//开始拿筷子吃饭
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("科学家1拿了左右两边的筷子吃饭");
		//吃完饭把筷子让出去
		this.notifyAll();
		//继续等待
		this.waiter1 = 0;
	}
	
	//科学家2左右两边的筷子
	public synchronized void scikuaizi2(){ 
		if(waiter1==1 || waiter3==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter2 = 1;
		//开始拿筷子吃饭
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("科学家2拿了左右两边的筷子吃饭");
		//吃完饭把筷子让出去
		this.notifyAll();
		//继续等待
		this.waiter2 = 0;
	}
	
	//科学家3左右两边的筷子
	public synchronized void scikuaizi3(){ 
		if(waiter2==1 || waiter4==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter3 = 1;
		//开始拿筷子吃饭
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("科学家3拿了左右两边的筷子吃饭");
		//吃完饭把筷子让出去
		this.notifyAll();		
		//继续等待
		this.waiter3 = 0;
	}
	
	//科学家4左右两边的筷子
	public synchronized void scikuaizi4(){
		if(waiter3==1 || waiter0==1)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.waiter4 = 1;
		//开始拿筷子吃饭
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println("科学家4拿了左右两边的筷子吃饭");
		//吃完饭把筷子让出去
		this.notifyAll();		
		//继续等待
		this.waiter4 = 0;
	}
	
}
