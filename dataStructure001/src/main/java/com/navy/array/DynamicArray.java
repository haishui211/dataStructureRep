package com.navy.array;


/**
 * 动态数组
 * @author win10
 *
 * @param <T>
 */
public class DynamicArray<T> {
	
	private Object[] arrays;
	private Integer usedSize;
	private Integer size;
	
	public DynamicArray() {
		arrays = new Object[8];
		usedSize = 0;
		size = 8;
	}
	
	/**
	 * 添加操作
	 * @param value
	 */
	public void add(T value){
		if(isNeedExpansion()){
			expansion();
		}
		arrays[usedSize] = value;
		usedSize++;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) throws Exception{
		if(index >= usedSize){
			throw new Exception("out of index.");
		}
		return (T)arrays[index];
	}
	
	public void printAll(){
		for(int i = 0; i < this.usedSize; i++){
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 删除操作
	 * 元素从后面往前挪
	 * @param index
	 */
	public boolean remove(int index){
		
		if(index >= usedSize){
			return false;
		}
		usedSize--;
		for(int i = index; i < usedSize; i++){
			arrays[i] = arrays[i+1];
		}
		arrays[usedSize] = null;
		return true;
	}
	
	/**
	 * 是否需要扩容
	 * @return
	 */
	private boolean isNeedExpansion(){
		if(usedSize < size){
			return false;
		}
		return true;
	}
	
	/**
	 * 扩容
	 */
	private void expansion(){
		Integer expansionSize = size + 8;
		Object[] expansionArrays = new Object[expansionSize];
		for(int i = 0; i < usedSize; i++){
			expansionArrays[i] = arrays[i];
		}
		size = expansionSize;
		arrays = expansionArrays;
		expansionArrays = null;
	}
}
