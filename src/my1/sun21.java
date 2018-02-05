package my1;

public class sun21 {

	public static void main(String[] args) 
	{
		//customFun custFun = new customFun();
		// TODO Auto-generated method stub
		customFun.stringReverse();
		customFun.reverseNumber(123);
	}
	
}

class customFun {
	
	public static int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
    }
	
	public static void stringReverse() 
	{
		String str = "123";
		int len=str.length();
		int i;
		for(i=len-1;i>=0;i--) {
			char letter=str.charAt(i);
			System.out.print(letter);
		}
	}

}

