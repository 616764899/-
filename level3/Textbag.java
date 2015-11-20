package 红岩第五次作业.level3;

public class Textbag {
	public static <T> void main(String[] args) {
		Bag bag = new Bag();
		bag.add("aaa");
		bag.add("bbb");
		bag.add(123);
		bag.getAll();
		bag.containso("aaa");
		bag.remove("aaa");
		System.out.println(bag.isEmpty());
		System.out.println(bag.containso("aaa"));
	}
}
