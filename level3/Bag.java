package ���ҵ������ҵ.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * ʵ��һ��Bag, ��������Ԫ���ظ�
 * ���뷽����add();
 * ɾ��������remove();
 * ����bag�Ƿ�Ϊ�գ�isEmpty();
 * �õ�bag�е�Ԫ�أ�getAll();
 * �ж�һ��Ԫ����bag���Ƿ����: containso();
 */
public class Bag<T> implements Interface<T>{
	
	List[] bag = new List[100];  //����һ�����List�����飬List�ڴ������
	
	
	//����Ԫ��o
	public void add(T o){
		int a = o.hashCode()%100; //��a��ȡÿ�����ݵĹ�ϣ�룬����ϣ�������0-99
		if(bag[a]==null){
			List<T> baglist = new LinkedList<T>();
			baglist.add(o);
			bag[a] = baglist;
		}
		else{
			bag[a].add(o);
		}
	}
	
	//��ȡbag������Ԫ��
	public void getAll(){
		for(int i=0;i<bag.length;i++){
			if(bag[i]!=null){ //bag���baglist��Ϊ�վ����
				for(int j=0;j<bag[i].size();j++){
					System.out.println(bag[i].get(j));
				}
			}
		}
	}
	
	//�ж��Ƿ����oԪ��
	public boolean containso(T o){
		int a = o.hashCode()%100;
		if(bag[a] != null){
			for(int i=0;i<bag[a].size();i++){//����bag[a].list�����Ԫ�� ������o��ͬ��
				if(bag[a].get(i).equals(o)){ 
					return true;
				}
			}
		}
		return false;
	}
	//�Ƴ�һ��Ԫ��o
	public void remove(T o){
		int a = o.hashCode()%100;//���ù�ϣ�룬�����ҵ�Ԫ�ص�λ��
		bag[a].remove(o);
	}
	
	//�ж�bag�Ƿ�Ϊ��
	public boolean isEmpty(){
		for(int i=0;i<bag.length;i++){
			if(bag[i]!=null)
				return false;
		}
		return true;
	}

	
}




