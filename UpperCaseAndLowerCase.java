package change;

public class UpperCaseAndLowerCase {

	public static void main(String[] args) {
		String name="RamysoRipFUepguj";
		String lowerCase=name.toLowerCase();
		System.out.println(lowerCase);
		for(int i=0;i<lowerCase.length();i++) {
			if(i%2==0) {
				System.out.println("lowerCase= "+lowerCase.substring(i,i+1).toLowerCase());
			}else {
				System.out.println("UpperCase= "+lowerCase.substring(i,i+1).toUpperCase());
		}
	}

	
	}

}
