import java.util.Scanner;

class Machine { // ���Ǳ�
	private int password;
	boolean power; // ����
	static int sales; // ����(����)
	static int[] maxRecipe = { 200, 1000, 50, 1000 }; // �ִ� ��ᷮ(��ᰡ ���Ƽ� �迭����)
	int[] changeMoney; // �Ž����� ����
	int[] inputMoney; // �޴µ� ����
	int[] size; // ������(��,��,��)
	int[][] recipes;
	Coffee[] coffees;
	Scanner sc = new Scanner(System.in);

	public Machine() {
		password = 1234;
		changeMoney = new int[] { 5000, 1000, 500, 100 };
		inputMoney = new int[] { 5000, 1000, 500, 100 };
		size = new int[] { 5, 10, 5, 10 };
		recipes = new int[][] { // ����, ����, ����, ��
				{ 20, 0, 0, 100 }, { 20, 100, 5, 100 }, { 20, 80, 5, 100 } };
		coffees = new Coffee[] { new Coffee("�Ƹ޸�ī��", 1, recipes[0], 1500), new Coffee("īǪġ��", 2, recipes[1], 2000),
				new Coffee("ī���", 3, recipes[2], 2500) };
	}


	public void setRecipe() { // ��ᷮ ����
		System.out.println("�ٲٽ� ����� Ŀ�Ǹ� �������ּ���.");
		System.out.printf("1.[%s] ,2[%s] ,3[%s]", coffees[0].getCoffeeName(), coffees[1].getCoffeeName(),
				coffees[2].getCoffeeName());
		System.out.println();
		int coffee1 = Integer.parseInt(sc.nextLine());
	exit:	while (true) {
			switch (coffee1) {
			case 1:
				System.out.println(coffees[0].getCoffeeName());
				for (int i = 0; i < recipes[0].length; i++) {
					System.out.printf("[%d] ���� > ���� > ���� > �� ���Դϴ�.", i + 1);
					recipes[0][i] = Integer.parseInt(sc.nextLine());
				}
				System.out.printf("[%d],[%d],[%d],[%d] �ٲ� �������Դϴ�.",recipes[0][0],recipes[0][1],recipes[0][2],recipes[0][3]);
				break exit;
			case 2:
				System.out.println(coffees[1].getCoffeeName());
				for (int i = 0; i < recipes[1].length; i++) {
					System.out.printf("[%d] ���� > ���� > ���� > �� ���Դϴ�.", i + 1);
					recipes[1][i] = Integer.parseInt(sc.nextLine());
				}
				System.out.printf("[%d],[%d],[%d],[%d] �ٲ� �������Դϴ�.",recipes[1][0],recipes[1][1],recipes[1][2],recipes[1][3]);
				break exit;
			case 3:
				System.out.println(coffees[2].getCoffeeName());
				for (int i = 0; i < recipes[2].length; i++) {
					System.out.printf("[%d] ���� > ���� > ���� > �� ���Դϴ�.", i + 1);
					recipes[2][i] = Integer.parseInt(sc.nextLine());
				}
				System.out.printf("[%d],[%d],[%d],[%d] �ٲ� �������Դϴ�.",recipes[2][0],recipes[2][1],recipes[2][2],recipes[2][3]);
				break exit;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}

		}
		admin();

	}

	public void setCoffeeName() {// Ŀ������ ����
		System.out.printf("1.[%s], 2.[%s], 3.[%s]", coffees[0].getCoffeeName(), coffees[1].getCoffeeName(),
				coffees[2].getCoffeeName());
		System.out.println();
		System.out.println("������ Ŀ�� ��ȣ �Է� : ");
		int numbers = Integer.parseInt(sc.nextLine());
		if (numbers == 1) {
			System.out.println("������ �̸��� �Է����ּ��� :");
			coffees[0].setCoffeeName(sc.nextLine());
			System.out.println("�ٲ��̸� :"+coffees[0].getCoffeeName());
		} else if (numbers == 2) {
			System.out.println("������ �̸��� �Է����ּ��� :");
			coffees[1].setCoffeeName(sc.nextLine());
			System.out.println("�ٲ��̸� :"+coffees[1].getCoffeeName());
		} else if (numbers == 3) {
			System.out.println("������ �̸��� �Է����ּ��� :");
			coffees[2].setCoffeeName(sc.nextLine());
			System.out.println("�ٲ��̸� :"+coffees[2].getCoffeeName());
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			setCoffeeName();
		}
		admin();
	}
	public void admin() { // �����ڸ��
	  	System.out.println("������������������������������");
		System.out.println("��  Ŀ ��  �� ��	  ��");
		System.out.println("��=============��");
		System.out.println("�� 1.��ᷮ ����	  ��");
		System.out.println("��	          ��");
		System.out.println("�� 2.Ŀ������ ����  ��");
		System.out.println("��			  ��");
		System.out.println("�� 3.����Ȯ��	  ��");
		System.out.println("��-------------��");
		System.out.println("�� 4. ��  ��	  ��");
		System.out.println("������������������������������");

			
			int menu = 0;
			do {
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("�޴��� ������ �ּ���.");
					menu = Integer.parseInt(sc.nextLine());
					break;
				}catch(NumberFormatException e){
					System.out.println("�ٽ� �Է����ּ���");
				}
				} while(true);

			
			switch (menu) {
			case 1: setRecipe(); break;
			case 2: setCoffeeName(); break;
			case 3: displaySales(); break; 
			case 4: displayMenu(); break;
			}
	    }
	
	
	public void displaySales() { // ����Ȯ��
		System.out.printf("������� Ŀ�� ������ [%d]�Դϴ�.", sales);
		admin();
	}

	public void enterAdmin(int password) { // �����ڸ�� ����
		if (this.password == password) {
			admin();
		} else {
			System.out.println("�߸��� �����Դϴ�.");
			displayMenu();
		}
	}

	public void displayMenu() { // �޴�
		System.out.println("������������������������������");
		System.out.println("��  Ŀ ��  �� ��   ");
		System.out.println("��=============");
		System.out.printf("�� 1  %s   \n",coffees[0].getCoffeeName());
		System.out.println("��             ");
		System.out.printf("�� 2  %s    \n",coffees[1].getCoffeeName());
		System.out.println("��             ");
		System.out.printf("�� 3  %s     \n",coffees[2].getCoffeeName());
		System.out.println("��-------------");
		System.out.println("�� 4   ��  ��      ");
		System.out.println("������������������������������");
		int menu = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("�޴��� ������ �ּ���.");
				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 4 || menu == password) {
					break;
				} 
			} catch (Exception e) {
				System.out.println("�޴��� �߸� �����߾��");
				System.out.println("1,2,3,4 �߿� �������ּ���");
			}
		} while (true);

		//this.password = password;
		Coffee c = null ;
		switch (menu) {
		case 1: c=coffees[0]; 
		break;
		case 2: c=coffees[1]; 
		break;
		case 3: c=coffees[2]; 
		break; 
		case 4: System.exit(0); 
		break;
		case 1234 : admin();
					System.out.println("������ ��忡 �����Ͽ����ϴ�.");
		break;
		}

	}

	public int setUserRecipe() { // ��ᷮ ����
		return 0;
	}

	public void displaySum() { // �ݾ� ǥ��
		sc.nextLine();
		System.out.println("�Ƹ޸�ī��");
	}

	public void selectCoffee() { // Ŀ�Ǽ���
		setUserRecipe();
	}
}

class Coffee {
	private String coffeeName; // Ŀ�� �̸�
	private int coffeeId; // Ŀ�� ������ȣ
	private int coffeePrice; // Ŀ�� ����

	private int[] recipe; // Ŀ�� ��� ��뷮

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public Coffee(String coffeeName, int coffeeId, int[] recipe, int coffeePrice) { // Ŀ�� ������ �Լ�
		this.coffeeName = coffeeName;
		this.coffeeId = coffeeId;
		this.recipe = recipe;
		this.coffeePrice = coffeePrice;
	}

}


public class Much {

	public static void main(String[] args) {
		Machine m = new Machine();
		m.displayMenu();
	}

}
