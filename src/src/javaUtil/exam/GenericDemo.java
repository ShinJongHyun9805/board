package javaUtil.exam;

class StudentInfo {
	public int grade;

	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person<T> {
	public T info;

	Person(T info) {
		this.info = info;
	}
}

public class GenericDemo {

	public static void main(String[] args) {

		// TODO :제너릭
		// 인스턴스를 만들때 사용하는 타입을 지정하는 문법

		// TODO : 제너릭을 왜 사용하는가?
		// 타입의 안전성과 코드의 중복성을 제거

		// 제네릭<T, S> -> 객체를 넣어야함.
		//BrsOrderResult<BrsDeliveryPossibleResult> brsDeliveryPossibleResult = new BrsOrderResult<>();
		
		Person<EmployeeInfo> p1 = new Person<>(new EmployeeInfo(1));
		System.out.println(p1.info.rank);
	}

}
