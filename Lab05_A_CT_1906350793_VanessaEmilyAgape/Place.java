package lab5;
import java.util.ArrayList;

/*
 * TO DO: 
 * Provide Constructor
 * Complete all TO DOs
 * Write setter and getter if needed
 */
class Place {

    private static ArrayList<Seller> sellers = new ArrayList<>();
    private String name;

    // TO DO
    public Place(String name) {
    	this.name = name;
    }
    
    public void add(Seller seller) {
        // TO DO
    	sellers.add(seller);
    }

	public static Seller getSpecificSeller(String name) {
        // TO DO
		for (Seller seller : sellers) {
			if (seller.getName().equals(name)) {
				return seller;
			}
		}
		return null;
	}

	public static int getTotalTarget() {
		// TO DO
		int sumTarget = 0;
		for (Seller seller : sellers) {
			sumTarget = sumTarget + seller.getTarget();
		}
		return sumTarget;
    }

    public static int getTotalProfit() {
		// TO DO
    	int sumProfit = 0;
    	for (Seller seller : sellers) {
    		sumProfit = sumProfit + seller.getProfit();
    	}
    	return sumProfit;
    }

	public static int getNumOfSellers() {
		// TO DO
		int sumSellers = 0;
		for (Seller seller : sellers) {
			sumSellers++;
		}
		return sumSellers;
    }

    /**
     * @return string representation of the Place
     */
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (Seller seller: sellers) {
            builder.append(seller.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}