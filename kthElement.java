

public int findKth(int[] nums, int k)
{
//O(nlogn)
 Arrays.sort(nums);
 return num[nums.length - k];
//O(n)
PriortyQueue<Integer> minHeap = new PriorityQueue<Integer>();
for(int i: nums)
{
  minHeap.add(i);
  if(mHeap.size() > k)
    minHeap.remove();
}
return minHeap.remove();
}
