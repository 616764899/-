package ���ҵ������ҵ.map.list;

import java.util.HashMap;
import java.util.Map;

/*
 * ��Ϥʹ��Hashmap��key,value�� ����ɾ�Ĳ�
 * map�ĵײ�ṹ������+����
 */
public class Hashmap {
	public static void main(String[] args){
		Map map =  new HashMap();
		//��
		map.put("÷÷", "˧��÷");
		map.put(1, "��һ��");
		map.put("÷÷�Ĺ�", new Dog("����¹¹"));
		
		Dog dog = (Dog)map.get("÷÷�Ĺ�");
		
		//ɾ���Ƴ�����map  �����ǰ�����ɾ���ˣ�
		//map.remove("÷÷");
		
		//�޸�   (map������ͬkey����ô������value��ǰ���value ����)
		//map.put(1, "������һ");
		
		//��ѯ
		System.out.println(map.get("÷÷"));
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
