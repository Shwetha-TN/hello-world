package Samana.accenture.com;
import java.io.*;
import java.util.*;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int len=s.length();
		char c;
		String result ="";
		for(int i=0; i<len; i++)
		{
			c=s.charAt(i);
			if(c!=' ')
				result+=c;
				s=s.replace(c, '*');
			
		}
		System.out.println("After replacing dupplicate value "+ result);
	}

}
