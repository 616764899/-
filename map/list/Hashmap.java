package 红岩第五次作业.map.list;

import java.util.HashMap;
import java.util.Map;

/*
 * 熟悉使用Hashmap（key,value） 的增删改查
 * map的底层结构是数组+链表
 */
public class Hashmap {
	public static void main(String[] args){
		Map map =  new HashMap();
		//增
		map.put("梅梅", "帅哥梅");
		map.put(1, "第一名");
		map.put("梅梅的狗", new Dog("秋田鹿鹿"));
		
		Dog dog = (Dog)map.get("梅梅的狗");
		
		//删（移出容器map  并不是把数据删除了）
		//map.remove("梅梅");
		
		//修改   (map里有相同key，那么后来的value将前面的value 覆盖)
		//map.put(1, "倒数第一");
		
		//查询
		System.out.println(map.get("梅梅"));
		System.out.println(dog.name);
	}
}

class Dog{
	String name;
	public Dog(String name){
		super();
		this.name = name;
	}
}
