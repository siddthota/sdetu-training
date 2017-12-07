package basics;

public class StringAPI {

	public static void main(String[] args) {
		
		String bookTitle = "The Lord of Rings";
		String wordChoice = "Ring";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains word " + wordChoice);
		}
		
		String browser = "Chrome";
		//if(browser == "chrome")
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Sid";
		String lastName = "Thota";
		String SSN = "121213321";
		
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0, 3));
		System.out.println(SSN.substring(5));
		
		
	}

}
