package com.company;

import java.util.LinkedList;
import java.util.Queue;

class Point{
    int x,y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
public class Main {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
	    System.out.print(orangeRotting(grid));
    }

    public static int orangeRotting(int[][] grid)
    {
        int n=grid[0].length;
        int m=grid.length;
        int count = 0;

        if(m==0 || n==0)
            return -1;

        Queue<Point> queue = new LinkedList<>();

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                    queue.offer(new Point(i,j));
            }
        }

        while (!queue.isEmpty())
        {
            int size = queue.size();
            while (size-->0) {
                Point p = queue.poll();
                int x = p.x;
                int y = p.y;

                if ((x < 0 || y < 0) || (x >= m || y >= n) || grid[x][y] <= 0) {
                    continue;
                }
                grid[x][y] = -1;

                if (x >= 1 && grid[x - 1][y] == 1) {
                    grid[x - 1][y] = 3;
                    queue.offer(new Point(x - 1, y));
                }

                if (x < m - 1 && grid[x + 1][y] == 1) {
                    grid[x + 1][y] = 3;
                    queue.offer(new Point(x + 1, y));
                }

                if (y >= 1 && grid[x][y - 1] == 1) {
                    grid[x][y - 1] = 3;
                    queue.offer(new Point(x, y - 1));
                }

                if (y < n - 1 && grid[x][y + 1] == 1) {
                    grid[x][y + 1] = 3;
                    queue.offer(new Point(x, y + 1));
                }
            }
                count++;
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return (count==0)?0:count-1;
    }

}
