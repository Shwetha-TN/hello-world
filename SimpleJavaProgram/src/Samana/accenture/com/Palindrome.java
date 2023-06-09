package Samana.accenture.com;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome pd = new Palindrome();
	    
	    String pal = pd.findLongestPalindrome("ABCDCBAKMALYALAM123454321MALAYLAMJABAA");
	    System.out.println("" + pal);
	    
	    }
	    
	  public String findLongestPalindrome(String s) {
	    if (s.isEmpty()) {
	      return "Please enter a String";
	    }

	    if (s.length() == 1) {
	      return s;
	    }
	    String longest = s.substring(0, 1);
	    for (int i = 0; i < s.length(); i = i+1) {        
	      String tmp = checkForEquality(s, i, i);
	      if (tmp.length() > longest.length()) {
	        longest = tmp;
	      }

	     tmp = checkForEquality(s, i, i + 1);
	      if (tmp.length() > longest.length()) {
	        longest = tmp;
	      }
	    }
	    return longest;
	  }
	    
	  public String checkForEquality(String s, int begin, int end) {
	    while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
	      begin--;
	      end++;
	    }
	    return s.substring(begin + 1, end);    
	}

}
