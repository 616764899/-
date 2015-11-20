package 红岩第五次作业.Thread;

/**
推荐 Runnable 创建线程
1)、避免单继承的局限性
2)、便于共享资源

使用Runnable  创建线程
1、 创建一个类实现Runnable接口 + 重写run()      -->真实角色类
2、启用多线程  使用静态代理
   1)、创建真实角色
   2)、创建代理角色 + 真实角色引用
   3)、调用.start()  启动线程
   
   
@author Administrator
*
*/
public class Programer implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("一边敲代码....");
		}
	}
	
	public static void main(String[] args) {
		Programer pro  = new Programer();
		Thread proxy = new Thread(pro);
		
		proxy.start();
		for(int i=0;i<1000;i++){
			System.out.println("一边聊QQ");
		}
	}
}
