import java.util.Scanner;
public class Plus {
	private static char newN1[];
	private static char newN2[];
	private static char newN3[];
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a number.");
		String n1=input.next();
		int x=n1.length();
		while(x!=0) {
			newN1 = new char[n1.length()];
			for(int i=0;i<n1.length();i++)newN1[i] = n1.charAt(i);
			x=n1.length();
			for(int i=0;i<n1.length();i++) {
				if(Character.isDigit(newN1[i])) {
					x--;
				}
			}
			if(x!=0) {
				System.out.println("Please change another one,there must be something not belong to numbers.");
				n1=input.next();
			}
		}
		System.out.println("Please input another number.");
		String n2=input.next();
		x=n2.length();
		while(x!=0) {
			newN2 = new char[n2.length()];
			for(int i=0;i<n2.length();i++)newN2[i] = n2.charAt(i);
			x=n2.length();
			for(int i=0;i<n2.length();i++) {
				if(Character.isDigit(newN2[i])) {
					x--;
				}
			}
			if(x!=0) {
				System.out.println("Please change another one,there must be something not belong to numbers.");
				n2=input.next();
			}
		}
		if(n1.length()<n2.length()) {
			String n3=n1;
			n1=n2;
			n2=n3;
		}
		newN1 = new char[n1.length()];
		for(int i=0;i<n1.length();i++)newN1[i] = n1.charAt(i);
		newN2 = new char[n2.length()];
		for(int i=0;i<n2.length();i++)newN2[i] = n2.charAt(i);
		x=newN1.length;
		int y=newN2.length;
		int b=0;
		newN3=new char[x+1];
		for(int i=x-1;i>=0;i--) {
			if(i==x-1) {
				for(int a=y-1;a>=0;a--) {
					newN3[i+1]=Integer.toString((Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b)%10).charAt(0);
					if((Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b)>=10) {
						b=1;
					}
					if(Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b<10) {
						b=0;
					}
					i--;
				}
			}
			if(i<0) {
				break;
			}
			newN3[i+1]=Integer.toString((Integer.parseInt(String.valueOf(newN1[i]))+b)%10).charAt(0);
			if(Integer.parseInt(String.valueOf(newN1[i]))+b>=10) {
				b=1;
			}
			if(Integer.parseInt(String.valueOf(newN1[i]))+b<10) {
				b=0;
			}
		}
		if(b!=0) {
			newN3[0]=Long.toString(b).charAt(0);
		}
		System.out.println(String.valueOf(newN3));
	}
}
