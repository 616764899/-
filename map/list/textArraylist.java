package 红岩第五次作业.map.list;
/*
 *  熟悉Arraylist 的增删改查
 * 
 * 1.数组是相同数据类型的有序集合
 * 2。数据也是对象，数组元素相当于对象的成员变量
 * 数组长度是确定的，不可变的，如果越界，则报：ArrayIndexOutofBoundsException(数组超出界线异常)
 */ 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class textArraylist {
	
	public static void main(String[] args){
		List list = new ArrayList();
		//增
		list.add("aaa");
		list.add(111);
		list.add(new Date());
		//移出容器
		//list.remove("aaa");
		
		//改
		list.set(1, "bbb");
		
		//查找
		System.out.println(list.get(2));
		
	}
}
