import java.util.Scanner;
public class CheoTheGoodDoggo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Masukkan tanggal: ");
	    int day=input.nextInt();
	    System.out.print("Masukkan bulan: ");
	    int month=input.nextInt();
	    System.out.print("Masukkan tahun: ");
	    int year=input.nextInt();
	    System.out.print("Masukkan ucapan: ");
	    input.nextLine();
	    String message=input.nextLine();

	    
	    boolean date_is_correct=false;
	    boolean message_is_correct=false;
	    if (day%2==0 && month%2==0 && year%2==0)
	        date_is_correct=true;
	    if (message.equals("good doggo"))  
	        message_is_correct=true;
	    if (message_is_correct==true && date_is_correct==true)
	    	System.out.println("Cheo the good doggo wishes you good luck and fortune this semester");
	    else if (message_is_correct==true && date_is_correct==false)
	    	System.out.println("The message is correct but the date is not");
	    else if (date_is_correct==true && message_is_correct==false)
	    	System.out.println("The date is correct but the message is not");
	    else
	    	System.out.println("Cheo the good doggo cannot give you luck and fortune");

	}

}
