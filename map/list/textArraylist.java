package ���ҵ������ҵ.map.list;
/*
 *  ��ϤArraylist ����ɾ�Ĳ�
 * 
 * 1.��������ͬ�������͵����򼯺�
 * 2������Ҳ�Ƕ�������Ԫ���൱�ڶ���ĳ�Ա����
 * ���鳤����ȷ���ģ����ɱ�ģ����Խ�磬�򱨣�ArrayIndexOutofBoundsException(���鳬�������쳣)
 */ 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class textArraylist {
	
	public static void main(String[] args){
		List list = new ArrayList();
		//��
		list.add("aaa");
		list.add(111);
		list.add(new Date());
		//�Ƴ�����
		//list.remove("aaa");
		
		//��
		list.set(1, "bbb");
		
		//����
		System.out.println(list.get(2));
		
	}
}
