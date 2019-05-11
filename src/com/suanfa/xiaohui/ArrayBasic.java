package com.suanfa.xiaohui;
/** 
* @author nilzxq
* @version 2019年5月11日 下午8:54:44 
* 类说明 
*/
public class ArrayBasic {
	private int[] array;
	private int size;
	
	public ArrayBasic(int capacity) {
		this.array=new int[capacity];
		size=0;
	}
	/**
	 * 数组插入元素
	 * @param element 插入元素
	 * @param index 插入位置
	 * @throws Exception
	 */
	public void insert(int element,int index) throws Exception{
		//判断访问下标是否超出范围
		if(index<0||index>size) {
			throw new IndexOutOfBoundsException("超出数组实际元素范围！");
		}
		//从右向左循环，将元素逐个向右挪1位
		for(int i=size-1;i>=index;i--) {
			array[i+1]=array[i];
		}
		//腾出的位置放入新元素
		array[index]=element;
		size++;
	}
	
	/**
	 * 输出数组
	 */
	public void output() {
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) throws Exception{
		ArrayBasic arrayBasic=new ArrayBasic(10);
		arrayBasic.insert(3,0);
		arrayBasic.insert(7, 1);
		arrayBasic.insert(9, 2);
		arrayBasic.insert(5, 3);
		arrayBasic.insert(6, 1);
		arrayBasic.output();
	}
}

