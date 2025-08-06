//Remove extra spaces – Trim + loop 
import java.util.*;
class RemoveExtraSpace{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String sb = sc.nextLine();
		System.out.println(sb.trim());
		StringBuilder res = new StringBuilder();
		boolean space = false;
		for( char c : sb.toCharArray()){
			if(c==' '){
				if(!space){
					res.append(c);
					space = true;
				}
			}
			else{
				res.append(c);
				space=false;
			}
		}
		System.out.println(res);
	}
}
