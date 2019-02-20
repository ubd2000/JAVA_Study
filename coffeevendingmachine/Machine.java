package coffeevendingmachine;

import java.util.Scanner;

public class Machine { //자판기
	private Scanner sc = new Scanner(System.in);
    private int password;
    private boolean power; // 전원
    private static int sales; // 매출(누적) 
    private static int[] maxRecipe = new int[] { 200, 1000, 50, 1000 };; // 최대 재료량(재료가 많아서 배열선택)
    private int[] changeMoney; // 거스름돈 단위
    private int[] inputMoney; // 받는돈 단위
    private int[] size; // 사이즈
    private int[][] recipes;
    private Coffee[] coffees;
    
    public Machine() {
    	password = 1234;
    	changeMoney = new int[] { 5000, 1000, 500, 100 };
    	inputMoney = new int[] { 5000, 1000, 500, 100 };
    	size = new int[] { 5, 10, 5, 10 };
    	recipes = new int[][] { // 원두, 우유, 설탕, 물
    		{ 20, 0, 0, 100 },
    		{ 20, 100, 5, 100 },
    		{ 20, 80, 5, 100 }
    	};
    	coffees = new Coffee[] { new Coffee("아메리카노", 1, recipes[0], 1500), 
                new Coffee("카푸치노", 2, recipes[1], 2000), 
                new Coffee("카페라떼", 3, recipes[2], 2500)
                };
    }
    
    public void admin() { //관리자모드
    setRecipe();
    setCoffeeName();
    displaySales();
    }
    
    public void setRecipe() { // 재료량 설정
        
    }
    public void setCoffeeName() {// 커피종류 변경
 
    }
    public int displaySales() { // 매출확인
        return 0;
    }
    public void enterAdmin(int password) { //관리자모드 접근
        if(this.password == password) {
            admin();
        }else {
            System.out.println("잘못된 접근입니다.");
            displayMenu();
        }
    }
    public void displayMenu1() { // 메뉴
        displayCoffee();
        selectCoffee();
    }
    
    public Coffee setUserRecipe(Coffee coffee) { //재료량 조절
        String[] recipeName = {"원두", "우유", "설탕", "물"};
        int[] tempRecipe = new int[4];
        for (int i = 0; i < tempRecipe.length; i++) {
        	tempRecipe[i] = coffee.getRecipe()[i];
        }
        Coffee tempCoffee = new Coffee(coffee.getCoffeeName(), coffee.getCoffeeId(), tempRecipe, coffee.getCoffeePrice());
        
        
        System.out.printf("%s 커피를 선택하셨습니다.\n", tempCoffee.getCoffeeName());
        
        for (int i = 0; i < tempRecipe.length; i++) {
        	if (tempRecipe[i] != 0) {
        		System.out.printf("%s의 양을 선택해주세요.\n", recipeName[i]);
        		System.out.println("1. 기본 2. 적게 3. 많게");
        		int sizeSelect = Integer.parseInt(sc.nextLine());
        		switch (sizeSelect) {
        		case 1:
        			System.out.println("기본으로 설정했습니다.");
        			break;
        		case 2:
        			System.out.println("적은 양으로 설정했습니다.");
        			tempRecipe[i] -= size[i];
        			break;
        		case 3:
        			System.out.println("많은 양으로 설정했습니다.");
        			tempRecipe[i] += size[i];
        			break;
        		default:
        			System.out.println("올바른 값을 입력해주세요.");
        			i--;
        			break;
        		}
        	}
        }
//        for (int i = 0; i < tempRecipe.length; i++) {
//        	System.out.print(tempRecipe[i] + " ");
//        }
        
    	return tempCoffee;
    }
    public void displaySum() { // 금액 표시
        
    }
    public void selectCoffee() { // 커피선택
        //setUserRecipe();
    }
    public void displayCoffee() { // 커피표시
        displaySum();
    }
    
    public void refund() {
    	
    }
    
    public Coffee displayMenu() { //메뉴
    	System.out.println("┌─────────────┐");
		System.out.println("│  커 피  메 뉴	  │");
		System.out.println("│=============│");
		System.out.println("│ 1.아메리카노	  │");
		System.out.println("│	          │");
		System.out.println("│ 2.카푸치노	  │");
		System.out.println("│			  │");
		System.out.println("│ 3.카페모카	  │");
		System.out.println("│-------------│");
		System.out.println("│ 4. 종  료	  │");
		System.out.println("└─────────────┘");

		
		int menu = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("메뉴를 선택해 주세요.");
				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 4) {
					break;
				} else {
					throw new Exception("문제발생");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("메뉴를 잘못 선택했어요");
				System.out.println("1,2,3,4 중에 선택해주세요");
			}
		} while (true);

		
		Coffee c = null;
		switch (menu) {
		case 1: c=coffees[0]; break;
		case 2: c=coffees[1]; break;
		case 3: c=coffees[2]; break; 
		case 4: System.exit(0); break;
		}
		
        //displayCoffee();
        //selectCoffee();
        
		//System.out.println("c: "+c);
        return c;
    }
    
    public void Coffee() {
    	Coffee c = displayMenu();
    	c = setUserRecipe(c);
    	System.out.println(c);
    	//displaySum(c);
//    	displaySum(Coffee c)
//    	print(c.getCoffeePrice())
    }
    
}