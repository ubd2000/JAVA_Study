package kr.or.bit;

public class Apt {
	public String aptname;
	// int door; //default 바보
	private int window; // 캡슐화, 은닉화
	
	// 간접할당
	// 캡슐화의 목적은 직접할당을 막고 간접할당을 통한 데이터 보호
	public void writeWindow(int w) { // 캡슐화된 자원에 write 함수
		if (w == 0) { // 0의 값을 넣을 수 없게 만든다. 개발자가 원하는 대로
			window = 100;
		} else {
		    window = w;
		}
	}
	
	public int readWindow() { // 캡슐화된 자원에 read 함수
		return window;
	}
}
