import java.util.*;

public class a{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int sets = keyboard.nextInt();
		int z = 0;
		while(z<sets){
			int set = keyboard.nextInt();
			int index = keyboard.nextInt();
			int pos = 0;
			int evens = 0;
			int odds = 0;
			for(int i = 1; i <= index; i++)
				pos+=i;
			for(int i = 2; i <= index*2; i+=2)
				evens += i;
			for(int i = 1; i <= index*2; i+=2)
				odds+=i;
			System.out.println(set+" "+pos +" "+odds+" "+evens);
		}		
	}
}
