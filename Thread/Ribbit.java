package 红岩第五次作业.Thread;

/**
 * 模拟龟兔赛跑
 1、创建多线程  继承Thread +  重写run(线程体)
 2、使用线程：创建子类对象

 * @author Administrator
 *
 */
public class Ribbit extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("兔子跑了"+i+"步");
		}
	}
	
	public static void main(String[] args) {
		//创建子类对象
		Ribbit rib = new Ribbit();
		Tortoise tor = new Tortoise();
		//调用 start 方法
		/*
		不要调用run方法，直接调用run方法只是普通的调用
		调用start方法相当于把rab的任务放入线程要执行的任务中准备开始执行
		 */
		rib.start();
		tor.start();
	}
}

class Tortoise extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("乌龟跑了"+i+"步");
		}
	}
}
