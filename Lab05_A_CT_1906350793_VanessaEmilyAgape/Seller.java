package lab5;
/*
 * TO DO: 
 * Provide Constructor
 * Write setter and getter if needed
 * Complete all TO DOs
 */
class Seller {

	private String name;
	private int price;
    private int target;
    private int transactions;

    // TO DO
    public Seller (String name, int price, int target) {
    	this.name = name;
    	this.price = price;
    	this.target = target;
    	this.transactions = transactions;
    }

    public void addTransactions(int number) {
        // TO DO
    	transactions += number;	
    }

    public int getProfit() {
        // TO DO
    	//jml transaksi * harga per satuan
    	return this.transactions * this.price;
    }
    
    public int getTarget() {
    	return this.target;
    }
    
    public String getName() {
    	return this.name;
    }
    /**
     * @return string representation of the Seller
     */
    public String toString() {
        return String.format("%-10s  %7d  %10d", name, price, target);
    }

}