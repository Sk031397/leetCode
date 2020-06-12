
class Solution {
	public int numIslands(char [][] grid)
	{
		if(grid == null || grid[0].length == null)
		{
			return 0;
		}
		int numI = 0;
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length;j++)
			{
				if(grid[i][j] == '1')
				{
					numI+=dfs(grid,i,j);
				}
			}
		}
			return numI;
	}
	public int dfs(char [][]grid,int i,int j)
	{
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
			return 0;
		grid[i][j] = '0';
		dfs(grid,i+1,j);
		dfs(grid,i-1,j);
		dfs(grid,i,j+1);
		dfs(grid,i,j-1);
		return 1;
	}
}
