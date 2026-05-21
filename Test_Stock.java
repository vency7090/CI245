package HW3VENCYPATEL;

public class Test_Stock {
	
	
	    public static void main(String[] args) {
	    	 System.out.println("HW3 Problem 9.2 - Stock Class by Vency Patel");

	        Stock stock = new Stock("ORCL", "Oracle Corporation");
	        stock.setPreviousClosingPrice(34.5);
	        stock.setCurrentPrice(34.35);

	        System.out.println("Symbol: " + stock.getSymbol());
	        System.out.println("Name: " + stock.getName());
	        System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
	        System.out.println("Current Price: " + stock.getCurrentPrice());
	        System.out.printf("Price Change Percentage: %.2f%%%n", stock.getChangePercent());
	    }
	}


