/*
 * Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
*/

class Solution {
	public boolean isPalindrome(int x) {
		// x % 10 gives rightmost number
		// x/10 gives leftmost number
		if (x < 0 || x % 10 == 0 && x != 0) // x%10 means that first digit isn't a zero
			return false;
		if (x == 0)
			return true;
		
		int reversedNumber = 0;
		
		while (x > reversedNumber) {
			int lastDigit = x % 10; //get rightmost digit
			reversedNumber = (reversedNumber * 10) + lastDigit; //multiplying reverseNUmber by 10 and adding lastdigit stores lastidigt into the next digit place of reverseNumber
			x /= 10; //removes lastDigit from x
		}
		
		return (x == reversedNUmber || x == reversedNumber / 10);
		//2nd case is for odd palindromes in order to remove the middle part
	}
}

