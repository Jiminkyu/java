package ch07.ex06.case05;

public class Cabinet<T extends A> {//A이하
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
//	super는 이상
	public <S extends C> S getFinalVal(S[] arr){
		return arr[arr.length - 1];//C이하
	}
}
