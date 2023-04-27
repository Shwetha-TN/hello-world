package Samana.accenture.com;

public class LongestPalindrome {

	static void printSubStr(String str, int low, int high)
	{
		System.out.println(str.substring(low,high+1));
	}
	static int longestPalindrome(String str)
	{
		int maxLength = 1;
		int start = 0;
		int len = str.length();
		int low, high;
		
		for ( int i=1; i<len; ++i)
		{
			low=i-1;
			high =i;
			while(low>=0 && high<len && str.charAt(low) == str.charAt(high))
			{
				--low;
				++high;
			}
			++low;
			--high;
			if(str.charAt(low) == str.charAt(high) && high - low+1 > maxLength)
			{
				start = low;
			maxLength = high - low +1;
			
		}
		low=i-1;
		high=i+1;
		while(low>=0 && high <len && str.charAt(low) == str.charAt(high)) {
			--low;
			++high;
			
		}
		++low;
		--high;
		if(str.charAt(low)==str.charAt(high) && high - low+1 > maxLength) 
		{
			start=low;
			maxLength = high - low+1;
		}
	}
	System.out.print("Longest palindrome substring is : ");
	printSubStr(str, start, start + maxLength - 1);
	return maxLength;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDCBAKMALYALAM123454321MALAYLAMJABAA";
		System.out.println(longestPalindrome(str));
	}

}
