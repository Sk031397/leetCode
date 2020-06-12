public List<String> letterCombinations(String digits) {
	List<String> result = new ArrayList<String>();
	if(digits == null || digits.length() == 0)
	{
		return result;
	}
	String [] mappings = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	letters(result,digits,"",0,mappings);       
	return result;
}
private void letters(List<String>result,String digits,String current,int index,String[]mappings)
{
	if(index == digits.length())
	{
		result.add(current);
		return;
	}
	String let = mappings[digits.charAt(index)-'0'];
	for(int i = 0; i < let.length();i++)
	{
		letters(result,digits,current+let.charAt(i),index+1,mappings);
	}
}
