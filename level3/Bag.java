package 红岩第五次作业.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 实现一个Bag, 无序，允许元素重复
 * 插入方法：add();
 * 删除方法：remove();
 * 测试bag是否为空：isEmpty();
 * 得到bag中的元素：getAll();
 * 判断一个元素在bag中是否存在: containso();
 */
public class Bag<T> implements Interface<T>{
	
	List[] bag = new List[100];  //创建一个存放List的数组，List内存放数据
	
	
	//插入元素o
	public void add(T o){
		int a = o.hashCode()%100; //用a存取每个数据的哈希码，将哈希码控制在0-99
		if(bag[a]==null){
			List<T> baglist = new LinkedList<T>();
			baglist.add(o);
			bag[a] = baglist;
		}
		else{
			bag[a].add(o);
		}
	}
	
	//获取bag中所有元素
	public void getAll(){
		for(int i=0;i<bag.length;i++){
			if(bag[i]!=null){ //bag里的baglist不为空就输出
				for(int j=0;j<bag[i].size();j++){
					System.out.println(bag[i].get(j));
				}
			}
		}
	}
	
	//判断是否存在o元素
	public boolean containso(T o){
		int a = o.hashCode()%100;
		if(bag[a] != null){
			for(int i=0;i<bag[a].size();i++){//遍历bag[a].list里面的元素 查找与o相同的
				if(bag[a].get(i).equals(o)){ 
					return true;
				}
			}
		}
		return false;
	}
	//移出一个元素o
	public void remove(T o){
		int a = o.hashCode()%100;//运用哈希码，快速找到元素的位置
		bag[a].remove(o);
	}
	
	//判断bag是否为空
	public boolean isEmpty(){
		for(int i=0;i<bag.length;i++){
			if(bag[i]!=null)
				return false;
		}
		return true;
	}

	
}




