package ���ҵ������ҵ.map.list;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
 * ��ϤLinklist����ɾ�Ĳ�
 */
public class textLinklist {
	public static void main(String[] args){
		
		List list = new LinkedList();
		//��
		list.add("aaa");
		list.add(111);
		list.add(new Date());
		
		//�Ƴ�����
		//list.remove("aaa");
				
		//��
		list.set(1, "bbb");
			
		//����
		System.out.println(list.get(1));
	}
}
