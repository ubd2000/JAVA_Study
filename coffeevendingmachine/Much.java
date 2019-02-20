import java.util.Scanner;

class Machine { // 자판기
	private int password;
	boolean power; // 전원
	static int sales; // 매출(누적)
	static int[] maxRecipe = { 200, 1000, 50, 1000 }; // 최대 재료량(재료가 많아서 배열선택)
	int[] changeMoney; // 거스름돈 단위
	int[] inputMoney; // 받는돈 단위
	int[] size; // 사이즈(소,중,대)
	int[][] recipes;
	Coffee[] coffees;
	Scanner sc = new Scanner(System.in);

	public Machine() {
		password = 1234;
		changeMoney = new int[] { 5000, 1000, 500, 100 };
		inputMoney = new int[] { 5000, 1000, 500, 100 };
		size = new int[] { 5, 10, 5, 10 };
		recipes = new int[][] { // 원두, 우유, 설탕, 물
				{ 20, 0, 0, 100 }, { 20, 100, 5, 100 }, { 20, 80, 5, 100 } };
		coffees = new Coffee[] { new Coffee("아메리카노", 1, recipes[0], 1500), new Coffee("카푸치노", 2, recipes[1], 2000),
				new Coffee("카페라떼", 3, recipes[2], 2500) };
	}


	public void setRecipe() { // 재료량 설정
		System.out.println("바꾸실 재료의 커피를 선택해주세요.");
		System.out.printf("1.[%s] ,2[%s] ,3[%s]", coffees[0].getCoffeeName(), coffees[1].getCoffeeName(),
				coffees[2].getCoffeeName());
		System.out.println();
		int coffee1 = Integer.parseInt(sc.nextLine());
	exit:	while (true) {
			switch (coffee1) {
			case 1:
				System.out.println(coffees[0].getCoffeeName());
				for (int i = 0; i < recipes[0].length; i++) {
					System.out.printf("[%d] 원두 > 우유 > 설탕 > 물 순입니다.", i + 1);
					recipes[0][i] = Integer.parseInt(sc.nextLine());
				}
				System.out.printf("[%d],[%d],[%d],[%d] 바뀐 레시피입니다.",recipes[0][0],recipes[0][1],recipes[0][2],recipes[0][3]);
				break exit;
			case 2:
				System.out.println(coffees[1].getCoffeeName());
				for (int i = 0; i < recipes[1].length; i++) {
					System.out.printf("[%d] 원두 > 우유 > 설탕 > 물 순입니다.", i + 1);
					recipes[1][i] = Integer.parseInt(sc.nextLine());
				}
				System.out.printf("[%d],[%d],[%d],[%d] 바뀐 레시피입니다.",recipes[1][0],recipes[1][1],recipes[1][2],recipes[1][3]);
				break exit;
			case 3:
				System.out.println(coffees[2].getCoffeeName());
				for (int i = 0; i < recipes[2].length; i++) {
					System.out.printf("[%d] 원두 > 우유 > 설탕 > 물 순입니다.", i + 1);
					recipes[2][i] = Integer.parseInt(sc.nextLine());
				}
				System.out.printf("[%d],[%d],[%d],[%d] 바뀐 레시피입니다.",recipes[2][0],recipes[2][1],recipes[2][2],recipes[2][3]);
				break exit;
			default:
				System.out.println("잘못 입력하였습니다.");
			}

		}
		admin();

	}

	public void setCoffeeName() {// 커피종류 변경
		System.out.printf("1.[%s], 2.[%s], 3.[%s]", coffees[0].getCoffeeName(), coffees[1].getCoffeeName(),
				coffees[2].getCoffeeName());
		System.out.println();
		System.out.println("변경할 커피 번호 입력 : ");
		int numbers = Integer.parseInt(sc.nextLine());
		if (numbers == 1) {
			System.out.println("변경할 이름을 입력해주세요 :");
			coffees[0].setCoffeeName(sc.nextLine());
			System.out.println("바뀐이름 :"+coffees[0].getCoffeeName());
		} else if (numbers == 2) {
			System.out.println("변경할 이름을 입력해주세요 :");
			coffees[1].setCoffeeName(sc.nextLine());
			System.out.println("바뀐이름 :"+coffees[1].getCoffeeName());
		} else if (numbers == 3) {
			System.out.println("변경할 이름을 입력해주세요 :");
			coffees[2].setCoffeeName(sc.nextLine());
			System.out.println("바뀐이름 :"+coffees[2].getCoffeeName());
		} else {
			System.out.println("잘못 입력하였습니다.");
			setCoffeeName();
		}
		admin();
	}
	public void admin() { // 관리자모드
	  	System.out.println("┌─────────────┐");
		System.out.println("│  커 피  메 뉴	  │");
		System.out.println("│=============│");
		System.out.println("│ 1.재료량 설정	  │");
		System.out.println("│	          │");
		System.out.println("│ 2.커피종류 변경  │");
		System.out.println("│			  │");
		System.out.println("│ 3.매출확인	  │");
		System.out.println("│-------------│");
		System.out.println("│ 4. 종  료	  │");
		System.out.println("└─────────────┘");

			
			int menu = 0;
			do {
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("메뉴를 선택해 주세요.");
					menu = Integer.parseInt(sc.nextLine());
					break;
				}catch(NumberFormatException e){
					System.out.println("다시 입력해주세요");
				}
				} while(true);

			
			switch (menu) {
			case 1: setRecipe(); break;
			case 2: setCoffeeName(); break;
			case 3: displaySales(); break; 
			case 4: displayMenu(); break;
			}
	    }
	
	
	public void displaySales() { // 매출확인
		System.out.printf("현재까지 커피 매출은 [%d]입니다.", sales);
		admin();
	}

	public void enterAdmin(int password) { // 관리자모드 접근
		if (this.password == password) {
			admin();
		} else {
			System.out.println("잘못된 접근입니다.");
			displayMenu();
		}
	}

	public void displayMenu() { // 메뉴
		System.out.println("┌─────────────┐");
		System.out.println("│  커 피  메 뉴   ");
		System.out.println("│=============");
		System.out.printf("│ 1  %s   \n",coffees[0].getCoffeeName());
		System.out.println("│             ");
		System.out.printf("│ 2  %s    \n",coffees[1].getCoffeeName());
		System.out.println("│             ");
		System.out.printf("│ 3  %s     \n",coffees[2].getCoffeeName());
		System.out.println("│-------------");
		System.out.println("│ 4   종  료      ");
		System.out.println("└─────────────┘");
		int menu = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("메뉴를 선택해 주세요.");
				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 4 || menu == password) {
					break;
				} 
			} catch (Exception e) {
				System.out.println("메뉴를 잘못 선택했어요");
				System.out.println("1,2,3,4 중에 선택해주세요");
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
					System.out.println("관리자 모드에 진입하였습니다.");
		break;
		}

	}

	public int setUserRecipe() { // 재료량 조절
		return 0;
	}

	public void displaySum() { // 금액 표시
		sc.nextLine();
		System.out.println("아메리카노");
	}

	public void selectCoffee() { // 커피선택
		setUserRecipe();
	}
}

class Coffee {
	private String coffeeName; // 커피 이름
	private int coffeeId; // 커피 고유번호
	private int coffeePrice; // 커피 가격

	private int[] recipe; // 커피 재료 사용량

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public Coffee(String coffeeName, int coffeeId, int[] recipe, int coffeePrice) { // 커피 생성자 함수
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
