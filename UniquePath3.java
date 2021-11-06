package com.company;
public class Main {

    public static void main(String[] args) {
	    int[][] grid = new int[][] {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        int ans  = uniquePathsIII(grid);
        System.out.print(ans);
    }

    public static int uniquePathsIII(int[][] grid)
    {
        if(grid.length<=1 && grid[0].length<=1)
            return 0;

        int zeroCount = 0;
        int m = grid.length;
        int n = grid[0].length;
        int oneX=0;int oneY=0;

        //Finding the starting point
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    zeroCount++;
                }
                else if(grid[i][j]==1) {
                    oneX = i;
                    oneY = j;
                }
            }
        }

        return dfs(oneX,oneY,grid,zeroCount);
    }

    public static int dfs(int x,int y,int[][] grid,int zeroCount)
    {
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]==-1)
            return 0;
        if(grid[x][y]==2){
            return zeroCount==-1?1:0;
        }
        grid[x][y]=-1;
        zeroCount--;

        int totalPath = dfs(x-1,y,grid,zeroCount)+
                dfs(x+1,y,grid,zeroCount)+
                dfs(x,y-1,grid,zeroCount)+
                dfs(x,y+1,grid,zeroCount);

        grid[x][y]=0;
        zeroCount++;

        return totalPath;
    }
}