package coffeevendingmachine;
 
public class Machine { //자판기
    private int password;
    private boolean power; // 전원
    private static int sales; // 매출(누적) 
    private int[] maxRecipe; // 최대 재료량(재료가 많아서 배열선택)
    private int[] changeMoney; // 거스름돈 단위
    private int[] inputMoney; // 받는돈 단위
    private int[] size; // 사이즈
    
    Coffee[] coffees = { new Coffee("아메리카노", 1, americanoRecipe, 1500), 
            new Coffee("카페라떼", 2, caffeLatteRecipe, 2000), 
            new Coffee("카푸치노", 3, cappucinoRecipe, 2500)
            };
    
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
    public int setUserRecipe() { //재료량 조절
        return 0;
    }
    public void displaySum() { // 금액 표시
        
    }
    public void selectCoffee() { // 커피선택
        setUserRecipe();
    }
    public void displayCoffee() { // 커피표시
        displaySum();
        
    }
    
}