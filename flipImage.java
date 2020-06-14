
/*
[[1,1,0],[1,0,1],[0,0,0]]
*/
public int[][] flipInvertImage(int[][]A)
{
/*
loop through the rows, and swap the values 
*/
   for(int i = 0; i < A.length;i++)
       int j = 0;
       int k = A[i].length - 1;
       while(j < k)
       {
	int temp = A[i][j];
	A[i][j++] = A[i][k];
	A[i][k--] = temp;
       }
       /* loop through columns, inverting numbers*/
       for(j = 0; j < A[i].length;j++)
         A[i][j] = A[i][j] == 1 ? 0:1;
	return A;
}
