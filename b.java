import java.util.*;
import java.lang.*;
import java.math.*;
public class b{
	public static BigInteger combs(int total, int choose){
		BigInteger t = BigInteger.valueOf(1);
		for(int i = 1; i <= total; i++)
			t =t.multiply(BigInteger.valueOf(i));
		BigInteger c = BigInteger.valueOf(1);
		for(int i=1; i<=choose; i++)
			c = c.multiply(BigInteger.valueOf(i));
		total-=choose;
		BigInteger tc = BigInteger.valueOf(1);
		for(int i = 1; i <= total; i++)
			tc = tc.multiply(BigInteger.valueOf(i));
		return (t.divide(tc.multiply(c)));
	}	
	public static BigInteger rec(int twos, int ones){
		if(twos>=ones){
			if(ones==0)
				return BigInteger.valueOf(1).add(rec(twos-1,ones+2));
			else
				return combs(twos+ones,ones).pow(2).add(rec(twos-1,ones+=2));
			
		}
		else
			return BigInteger.valueOf(0);
		
	}	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int sets = kb.nextInt();
		int set = 0;
		while(set < sets){
			int setNum = kb.nextInt();
			int steps = kb.nextInt();
			if(((steps/2)%2) ==1){
				int oneStep = 1;
				int twoStep = ((steps/2)-1)/2;
				System.out.println(setNum+" "+rec(twoStep,oneStep));
			}
			else{
				int twoStep = (steps/2)/2;
				System.out.println(setNum+" "+rec(twoStep,0));
			}
		set++;
		}
		
		
		
		
		
	}
}
