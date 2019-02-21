import kr.or.bit.Pclass;

// 접근 제어자 : default, private, public 상속 관계에서 protected
// 상속 관계에서만 존재
// 양면성 : default, public(상속 관계에서)

// 상속 관계에서 protected (자식 클래스 안쪽 함수 안)
class Child2 extends Pclass {
	void method() {
		this.p = 1000; // 상속 관계에서 protected == public
		System.out.println(this.p);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

// why ? class Car { protected void turn() {} }
// 나를 상속하는 당신이 내가 만든 자원을 재정의했으면 좋겠는데...
public class Ex08_Inherit_protected {

	public static void main(String[] args) {
		Pclass pc = new Pclass();
		System.out.println("다른 폴더에서는 public : " + pc.j);
		
		Child2 ch = new Child2();
		ch.method();
		String s = "ne";
	}

}
