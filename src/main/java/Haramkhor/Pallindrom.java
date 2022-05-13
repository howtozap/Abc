package Haramkhor;

public class Pallindrom {
	public static void main(String[] args) {
		String s="wow";
		String x="";
		for(int i=0;i<s.length()-1;i++)
		{
		 x=x+s.charAt(i);	
		}
		System.out.println(x);
		for(int i=0;i<x.length()-1;i++) {
			System.out.println(x);
		}
	}

}
