package Libraries;

import org.junit.Assert;

public class switchTest {

	EnumTest test;
	public switchTest(EnumTest test)
	{
		this.test = test;
	}
	public void switchtest()
	{
		switch (test)
		{
		
		case sunday:
			System.out.println("Today is sunday");
			break;
		case monday:
			System.out.println("Today is monday");
			break;
		default:
			System.out.println("Today is no day");
			break;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        switchTest test = new switchTest(EnumTest.monday);
        test.switchtest();
        
        
	}

}
