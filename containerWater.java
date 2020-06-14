//O(n^2)
public int maxArea(int[] height)
{
	int max = Integer.MIN_VALUE;
	for(int i = 0; i < height.length;i++)
	{
		for(int j = i + 1; j < height.length;j++)
		{
			int min = Math.min(height[i],height[j]);
			max = Math.max(max,min * (j-i));
		}
	}
	return max;
}
// one pass solution O(n)
public int maxArea(int[]height)
{
 int a = 0;
 int b = height.length - 1;
 int max = Integer.MIN_VALUE:
 while(a < b)
 {
   int min = Math.min(height[a],height[b]);
   max = Math.max(max,min*(b-a));
   if(height[a] < height[b])
   {
	a++;
   }else{
     	b--;
   }
 }
return max; 
}
