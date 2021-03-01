package javaUtil.exam;

abstract class Info {
	public abstract int getLevel();
}

class EmployeeInfo1 extends Info {
	public int rank;

	EmployeeInfo1(int rank) {
		this.rank = rank;
	}

	public int getLevel() {
		return this.rank;
	}
}

class Person1<T extends Info> {
	public T info;

	Person1(T info) {
		this.info = info;
		info.getLevel();
	}
}

//TODO : Person에 들어올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한할 수 있음. 
//		이게 제네릭의 제한
public class GenericLimit {

	public static void main(String[] args) {
		Person1 p1 = new Person1(new EmployeeInfo1(1)); // Person에서 extends로 Info를 부모를 지정했기에 int형만 들어올 수 있음.
		// Person<String> p2 = new Person<String>("부장"); //String 타입으로 선언하면 컴파일 에러가 뜸.

		System.out.println(p1.info.getLevel());
	}

}
