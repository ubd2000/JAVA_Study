import java.util.Scanner;

import Kr.or.bit.Car;

public class WooseTest {

	public static void main(String[] args) {

//		//1. �ּ����� 
//		//�����ּ��� ����Ͽ� ���� ������ ��ü �ּ�ó���Ͻÿ�.
//		//Car car = new Car();
//		//car.name = "����";
//		/*
//		 �����ּ��� ����Ͽ� ���� ������ ��ü �ּ�ó���Ͻÿ�.
//	     Car car = new Car();
//	     car.name = "����";
//		 */
//		
//		//2. ��¹���
//		//��°��: 
//		//���� "'�ڹ�'�� ��մ�!"�� (�ٹٲ�) 
//		//���ߴ�.
//		//����) Ư����ȣ���� ��µǰ� �ϼ���.
//		String str = "�ڹٰ�";
//		char ch = '!';
//		System.out.println("���� " + str + " ��մ�"+'!'+"\n");  //���� �ڹٰ� ��մ�!
//		System.out.println("����\"\'�ڹٰ�\'\"��մ�!\n ���ߴ�");
//		System.out.printf("���� %s ��մ� %s",str,ch);  //���� �ڹٰ� ��մ�!
//		
//		//3. Ÿ�Թ���
//		//- ByteŸ�Կ� 10��, 20�� ���� a,b�� �����ϰ�, ���� ���� ����غ�����.
//		//- charŸ�Կ� 'A'�� 1 ���� a,b�� �����ϰ�, �ѿ� ���� char�� ����ϼ���(������, ������ ����ȯ �Ѵ� ����� ��)
//		byte a = 10;
//		byte b = 20;
//		int c = a+b;
//		System.out.println(a+b);  //30
//		
//		char a2 = 'A';
//		int b2 = 1;
//		int c2 = a2+b2;
//		System.out.println(a2+b2);  //66
//    	System.out.println((char)c2);  //B
//    	
//    	//4. Ŭ������������
//    	//- CarŬ������ ����� (���ϴ� Ÿ������) �����, �ڵ�����ȣ �ʵ带 �����ϼ���.
//    	//- CarŬ���� ��ü�� main�޼ҵ忡 �����ϰ�, �����, �ڵ��� ��ȣ�� red, 2022�� �����ѵ� ����� ����ϼ���.
//    	//- �ι�° CarŬ���� ��ü�� �����ϰ�, ��� �� �ּҰ� �Ҵ� ���� ���� ����� �Ȱ��� ������ �ϼ���.
//    	
//    	Car car = new Car();
//    	car.makeCar("red", 2022);
//    	
//    	
//    	//5. ������
//    	//- x�� 1�̰�, y�� -1�϶� x>0 && y<0 ��� �����?
//    	int x = 1;
//    	int y = -1;
//    	System.out.println(x>0 && y<0);  // true
//    	
//    	
//    	//5. ������
//    	//- '100 * 2 / 3 % 5'�� ��� �����?
//    	System.out.println(100 * 2 / 3 % 5);  // 1
//    	
//    	
//    	//5. ������
//    	//- 'a=b=c=5'�� a,b,c ��� �����?
//    	//a,b,c = 5
//    	
//    	
//    	//5. ������
//    	//- x�� 12�϶�, z=x++�� �����, y=++x�� z�� y�� ��� �����?
//    	int x2 = 12;
//    	int z = 0;
//    	int y2 = 0;
//    	z = x2++;
//    	System.out.println(z=x2++); //13
//    	System.out.println(y2=++x2);  //
//    	
//    	
//    	//5. ������
//    	//- boolean b = true;�� �����ϰ� �������ڸ� ����Ͽ� false�� ��� �ǰ� �ϼ���.
//    	boolean b3 = true;
//    	System.out.println(!b3);
//    	
//    	
//    	//5. ������
//    	//- ��ٸ��� ���̱��ϱ� (����=10, �غ�=5, ����=2)�϶� ���̸� ���ϰ� ��� �ϼ���.
//    	int top = 10;
//    	int down = 5;
//    	int high = 2;
//    	double a3 = 0.5;
//    	System.out.println(a3*(top+down)*high);  //15
//    	
//    	
//    	//5. ������
//    	//���Կ����ڸ��� ����Ͽ� '3���ϱ�, 3����, 3���ϱ�, 3������, 3������' �� ���� ���� ��� �ϼ���.
//    	int a4 = 11;
//    	a4+=1;
//        System.out.println(a4);  //12
//
//    	a4-=1;
//        System.out.println(a4);  //11
//
//    	a4*=3;
//        System.out.println(a4);  //33
//    	
//    	a4/=3;
//        System.out.println(a4);  //11???????!!!!!!!
//    	
//        //5. ������
//        //- ������ 534��, �л��� 30���϶�, �л� �Ѹ��� ���� �� �ִ� ������ ���� ���� ���� ���� �� �� �ΰ���?
//        int pencil = 534;
//        int student = 30;
//        int ps = pencil/student;
//        int ps2 = pencil%student;
//        System.out.println("���� : " + ps);
//        System.out.println("������ ���� : " + ps2);//�л� �Ѹ�� ���� 17���� ������ 24���� ���´�
//   
//    	
//        //6. ���ǹ�
//        //- a�� 10�̰� b�� ++10�϶�, ���� ������ "�����ϴ�." , �ٸ��� "�ٸ��ϴ�"�� ����ϼ���.
//        // ( ���� �����ڸ� �̿��ؼ��� Ǯ�����. : (���ǹ�) ? �� : ���� )
//        int a5 = 10;
//    	int b5 = 10;
//    	if(a5==++b5) {
//    		System.out.println("�����ϴ�");
//    	}else {
//    		System.out.println("�ٸ��ϴ�");
//    	}
//    	
//    	
//		String result = (a5==++b5)? "�����ϴ�" : "�ٸ��ϴ�";
//		System.out.println("����:" + result);  //����:11??????!!!!!
//		
//		
//	    //6. ���ǹ�
//	    //- if-else�� ����Ͽ�, ������ 85���϶� 90�� �̻��̸� "a���", 80�� �̻��̸� "b���" �ƴϸ� "c���"�� ��� �ϼ���.
//		int i = 85;
//		String score = "";
//	    if (i>=90) {
//	    	 score = "a���";
//	    }else if(i>=80) {
//	    	 score = "b���";
//	    }else {
//	    	 score = "c���"; 
//	    }
//  	    System.out.println(score);  //b���

		// - ��ø if�� ����Ͽ�, ����, ����, ���������� �Է� �޾Ƽ� ����� 95�̻��̸� "a+", ����� 90�̻��̸� "a",
		// ����� 85�̻��̸� "b+", ����� 80�̻��̸� "b"�� ��µǰ� �ϼ���.

		// 1.���� ���� ���� ������ �Է¹޴´�
		// 2.���� ���� ���� �Է¹��� ���� ����� ���Ѵ�
		// 3.if���� ����ؼ� 90���̻��̸� ���� 80���̻��̸� �� �����
		// 4.�� �������ȿ� �������� ����ؼ� 90��
		// ����

//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("����� ���� ������ �Է��ϼ���");
//		System.out.println("����� ���� ������ �Է��ϼ���");
//		System.out.println("����� ���� ������ �Է��ϼ���");
//		int jumsu7 = Integer.parseInt(sc3.nextLine());
//		int jumsu8 = Integer.parseInt(sc3.nextLine());
//		int jumsu9 = Integer.parseInt(sc3.nextLine());
//		int ess = (jumsu7 + jumsu8 + jumsu9) / 3;
//		String grade = "";
//		System.out.println(ess);
//
//		if (ess >= 90) {
//			grade = "a";
//			if (ess >= 95) {
//				grade = "a+";
//			}
//		} else if (ess >= 80) {
//			grade = "b";
//			if (ess >= 85) {
//				grade = "b+";
//			}
//
//		} else {
//			System.out.println("zzzzz");
//		}
//		System.out.println(grade);

		// 6. ���ǹ�
		// - 0~100�� ������ �������� �޾�, ������ 90���̻��̸� "a���", 80�� �̻��̸� "b���" �ƴϸ� "c���"�� switch������
		// Ǯ�� ������.
		// (��Ʈ: �������� ������ 10�� ���� ����ϼ���.)
//		int jumsu2 = (int) (Math.random() * 101);
//		System.out.println(jumsu2);
//		String score2 = "";
//
//		int i2 = jumsu2 / 10;
//		switch (i2) {
//		case 10:
//			score2 = "a+";
//			break;
//		case 9:
//			score2 = "a";
//			break;
//		case 8:
//			score2 = "b";
//			break;
//		default:
//			score2 = "c";
//			break;
//		}
//		System.out.printf("����� ������ %s ������ %s�Դϴ� \n", jumsu2, score2); 

		// 6 .���ǹ�
		// - 1~6�� �������� �޾� 1�̸� "1�� ���Խ��ϴ�." 2�̸�"2�����Խ��ϴ�." ... :6�� ���Խ��ϴ�"���� ��� �ϼ���.
//		int num = (int) ((Math.random() * 6) + 1);
//		
//		if(num == 1) {
//			System.out.println("1���� ���Խ��ϴ�.");
//		}else if(num == 2) {
//			System.out.println("2���� ���Խ��ϴ�");
//		}else if(num == 3) {
//			System.out.println("3���� ���Խ��ϴ�");
//		}else if(num == 4) {
//			System.out.println("4���� ���Խ��ϴ�");
//		}else if(num == 5) {
//			System.out.println("5���� ���Խ��ϴ�");
//		}else {
//			System.out.println("6���� ���Խ��ϴ�");
//		}
//		
//		System.out.printf("%s���� ���Խ��ϴ�", num);

		// 6. ���ǹ�
		// - 1~10�� ����ڿ��� �Է¹޾� ¦���̸� "¦��", Ȧ���̸� "Ȧ��"�� ��� �ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10�� ���� �� �ϳ��� �����ּ��� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		String str2 = "";

		if (0 <= num2 && num2 <= 10) {
			if (num2 % 2 == 0) {
				str2 = "¦�� �Դϴ�";
			} else if (num2 % 2 != 0) {
				str2 = "Ȧ�� �Դϴ�";
			}
		} else {
			System.out.println("�ٸ����� �Է��ϼ���");
		}

		System.out.printf("%s", str2);

		// 6. ���ǹ�
		// - Switch���� ����Ͽ� ������ �Է� ���� ���� A�Ǵ�a�̸� "�ְ�" B�Ǵ�b�̸�"������" �ٸ� ���� "�Ǹ���"�� ��� �ϼ���.
		Scanner sc2 = new Scanner(System.in);
		System.out.println("����� ������ �Է����ּ��� : ");
		String jumsu3 = sc2.nextLine();
		String res = "";

		switch (jumsu3) {
		case "A":
		case "a":
			res = "�ְ�";
			break;
		case "B":
		case "b":
			res = "������";
			break;
		default:
			res = "�Ǹ���";
			break;
		}
		System.out.printf("%s", res);

	}

}