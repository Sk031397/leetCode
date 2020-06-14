

public List<Integer> findDisappearingNumbers(int[] nums)
{
  List<Integer> missingNumbers = new ArrayList<Integer>();
  HashSet<Integer> numbers = new HashSet<>();
  for(int i: nums)
  {
	set.add(i);
  }
  for(int i = 1; i <= nums.length;i++)
  {
	if(!numbers.contains(i))
	{
           missingNumbers.add(i);
	}
  }
   return missingNumbers;
}
