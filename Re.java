import java.util.Arrays;
import java.util.Scanner;

/*
 * ��ü�� �� �޸𸮿� �ش��ϴ� �͸��ΰǰ�?
 * ��ü�� Ŭ������ 
 * 
 */

class Person9 {
	String name;
	int age;
}

public class Re {
	public static void main(String[] args) {
		int[] intarr = new int[10];
		System.out.println(Arrays.toString(intarr));
		boolean[] booarr = new boolean[5];
		System.out.println(Arrays.toString(booarr));
		String[] sarr = new String[3];
		System.out.println(Arrays.toString(sarr));

		Person9[] objarr = new Person9[3];
		System.out.println(Arrays.toString(objarr));

		objarr[0] = new Person9();
		System.out.println(Arrays.toString(objarr));

		// ��ü�� �迭�� �ڸ��� �����, �ּҰ��� �ְ�
		// 2�� �۾��ؾ��Ѵ�.
		objarr[0].name = "ȫ�浿";
		objarr[0].age = 100;
		System.out.println(objarr[0].name + objarr[0].age);

		
		
		// 1. 1~10������ ¦���� ���� ����Ͻÿ�.
		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < num.length; i++) {
			if (i % 2 != 0) {
				num[i] += i;
				System.out.println("1~10������ ¦���� ��:" + num[i]);
			}
		}

		// 2. 1~10���� ���� �� 2�� ����� ���� ����Ͻÿ�.
		int[] num2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < num2.length; i++) {
			if (i % 2 != 0) {
				num2[i] += i;
				System.out.println("1~10������ 2�� ����� ��:" + num2[i]);
			}
		}
		
		// 3. ����,����,���� ������ �Է¹޾� ����� ���ϰ� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���������Է�: ");
		int mat = Integer.parseInt(sc.nextLine());
		System.out.println("���������Է�: ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("���������Է�: ");
		int kor = Integer.parseInt(sc.nextLine());
		
		int[] score = {mat,eng,kor};
		int sum=0;
		int avg=0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			if(i==score.length-1) {
				avg = sum/3;
			}
		}
		
		System.out.println("����: "+mat+"/ ����: "+eng+"/ ����: "+kor
				+"\n/����: "+sum+"/ ���:"+avg);
				
		
	}
}
