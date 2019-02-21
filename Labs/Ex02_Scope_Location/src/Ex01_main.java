/* 클래스 == 설계도 == 타입이다
 * 클래스의 기본 구성 요소 : 필드(고유값, 상태값, 참조값), 함수(기능)
 * 접근자(한정자) : public, private, default(아무 것도 쓰지 않는 것), protected(상속 관계에서만 정의)
 * 
 * 1. public class Test {}
 * 2. class Test {} >> default 접근자가 생략되었다.
 * (default 접근자 : 같은 폴더 안에서 공유할 수 있다. 다른 폴더에 있으면 사용 불가능)
 * 
 * 3. default class는 같은 폴더에서 다른 클래스의 참조 목적으로 또는 연습 목적으로 사용
 * 
 * 4. 하나의 Java 파일은 여러 클래스를 가질 수 있다.
 *  >> Ex01 _main.java
 *  >> class Test{} 코딩 연습할 때 쓰고 실제로는 하나의 파일에는 하나의 클래스만
 *  단, public class는 하나만
 *  
 *  
 *  
 *  default : 같은 폴더 내에서 사용 시
 */

import kr.or.bit.Apt;
import kr.or.bit.Emp;

class Test {
	int i;
	void print() {
		System.out.println("default");
	}
}

public class Ex01_main {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "연습";
		
		// kr.or.bit 폴더 안에 있는 Car 클래스 사용
		// kr.or.bit.Apt apt = new kr.or.bit.Apt();
		Apt apt = new Apt();
		apt.aptname = "현대";
		apt.writeWindow(0);
		System.out.println(apt.readWindow());
		
		Test t = new Test();
		t.i = 100;
		
		Emp e = new Emp();
		e.setEmpno(7777); // ex) 사번을 반드시 4자리로 해야 한다면? set 함수에 제약조건 걸기 가능
		System.out.println(e.getEmpno());
		
		e.mgr = -8888;
		System.out.println(e.mgr);
	}
}
