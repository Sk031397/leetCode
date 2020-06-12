class Solution {
	public void reverseString(char[] s) {
		helpers(s,0,s.length-1);
	}
	public void helpers(char[] s,int left,int right)
	{
		if(left >= right) return;
		char tmp = s[left];
		s[left++] = s[right];
		s[right--] = tmp;
		helpers(s,left,right);
	}
}
