package 红岩第五次作业.map.list;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
 * 熟悉Linklist的增删改查
 */
public class textLinklist {
	public static void main(String[] args){
		
		List list = new LinkedList();
		//增
		list.add("aaa");
		list.add(111);
		list.add(new Date());
		
		//移出容器
		//list.remove("aaa");
				
		//改
		list.set(1, "bbb");
			
		//查找
		System.out.println(list.get(1));
	}
}
