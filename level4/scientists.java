package 红岩第五次作业.level4;
/**
 * 科学家们
 * @author Administrator
 *
 */
public class scientists implements Runnable{
	private kuaizi k;
	
	public scientists(kuaizi k) {
		super();
		this.k = k;
	}
	
	@Override
	public void run() {
			k.scikuaizi0();
		
	}
}

class scientists1 implements Runnable{
	private kuaizi k;
	
	public scientists1(kuaizi k) {
		super();
		this.k = k;
	}

	@Override
	public void run() {
		k.scikuaizi1();
		
	}
}

class scientists2 implements Runnable{
	private kuaizi k;
	
	public scientists2(kuaizi k) {
		super();
		this.k = k;
	}

	@Override
	public void run() {
		k.scikuaizi2();
	
	}
}

class scientists3 implements Runnable{
	private kuaizi k;
	
	public scientists3(kuaizi k) {
		super();
		this.k = k;
	}

	@Override
	public void run() {
		k.scikuaizi3();
		
	}
}

class scientists4 implements Runnable{
	private kuaizi k;
	
	public scientists4(kuaizi k) {
		super();
		this.k = k;
	}
	
	@Override
	public void run() {
		k.scikuaizi4();
		
	}
}