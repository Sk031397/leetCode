



// loop through the two dimension array 
for(int i = 0; i < board.length;i++)
  for(int j = 0; j < board[i].length;j++)
  	if(board[i][j] == 'X')
	    numBattleShips++;
	    sink(board,i,j);
  	return numBattleships;

public void sink(char[][]board,int i, int j)
{
  if(i > 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != 'X')
     return 0;
   board[i][j] = '.';
   sink(board,i+1,j);
   sink(board,i-1,j);
   sink(board,i,j+1);
   sink(board,i,j-1);

}
