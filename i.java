import java.util.*;
import java.lang.*;
import java.math.*;
public class i{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int sets = kb.nextInt();
		int z = 0;
		while(z < sets){
			int set = kb.nextInt();
			int loops = kb.nextInt();
			ArrayList<String> arr = new ArrayList<String>();
			BigInteger bi = new BigInteger(kb.next());
				arr.add(bi.toString());
			for(int i =0; i < loops;i ++){
				
				BigInteger bi2 = new BigInteger(new StringBuilder(bi.toString()).reverse().toString());
				BigInteger biHold = bi;
				bi = bi.add(bi2);
				bi = new BigInteger(bi.toString().replaceAll("0",""));
				ArrayList<Integer> ab = new ArrayList<Integer>();
				for(int k = 0; k < bi.toString().length(); k++){
					ab.add(Integer.parseInt(Character.toString(bi.toString().charAt(k))));
				}
				Collections.sort(ab);
				String b = "";
				for(int k = 0; k < ab.size(); k++)
					b+=ab.get(k).toString();
				bi = new BigInteger(b);
				if((biHold.toString().indexOf("1233")==bi2.toString().indexOf("444")+1&& bi2.toString().contains("444")&&biHold.toString().contains("1233") )||( biHold.toString().indexOf("5566") == bi2.toString().indexOf("7777")&&biHold.toString().contains("5566")&&bi2.toString().contains("7777"))){
					int w = arr.size()+1;
					System.out.println(set+" C "+arr.size());
					i = loops;
				}
				else if(arr.contains(bi.toString())){
					int w = arr.size()+1;
					System.out.println(set+" R "+w);
					i = loops;
				}
				else if(arr.size() ==(loops-1)){
					System.out.println(set+" "+bi.toString());
					i=loops;
				}
				else{
					arr.add(bi.toString());
				}
			}
			z++;
		}
	}

}
