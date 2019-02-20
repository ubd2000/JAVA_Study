package coffeevendingmachine;
 
public class Machine { //자판기
    private int password;
    private boolean power; // 전원
    private static int sales; // 매출(누적) 
    private static int[] maxRecipe = new int[] { 200, 1000, 50, 1000 };; // 최대 재료량(재료가 많아서 배열선택)
    private int[] changeMoney; // 거스름돈 단위
    private int[] inputMoney; // 받는돈 단위
    private int[] size; // 사이즈
    private int[][] recipes;
    
    Coffee[] coffees = { new Coffee("아메리카노", 1, recipes[0], 1500), 
            new Coffee("카푸치노", 2, recipes[1], 2000), 
            new Coffee("카페라떼", 3, recipes[2], 2500)
            };
    
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
    public void displayMenu() { // 메뉴
        displayCoffee();
        selectCoffee();
    }
    public Coffee setUserRecipe(Coffee coffee) { //재료량 조절
        int[] tempRecipe = coffee.getRecipe();
        
        
    	return coffee;
    }
    public void displaySum() { // 금액 표시
        
    }
    public void selectCoffee() { // 커피선택
        setUserRecipe();
    }
    public void displayCoffee() { // 커피표시
        displaySum();
    }
    
    public void refund() {
    	
    }
    
}