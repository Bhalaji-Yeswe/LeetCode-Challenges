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
        char[][] board = new char[][]{{'X', 'O', 'X'}, {'X', 'O', 'X'}, {'X', 'O', 'X'}};
        solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + ' ');
            }
            System.out.print("\n");
        }
    }

    public static void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        if (m <= 1 || n <= 1)
            return;


        for(int j=0;j<n;j++)
        {
            if(board[0][j]=='O')
                dfs(0,j,board);
        }

        for(int j=0;j<n;j++)
        {
            if(board[m-1][j]=='O')
                dfs(m-1,j,board);
        }

        for(int i=0;i<m;i++)
        {
            if(board[i][0]=='O')
                dfs(i,0,board);
        }

        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O')
                dfs(i,n-1,board);
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='V')
                    board[i][j]='O';
            }
        }
    }

    public static void dfs(int i, int j, char[][] board) {
        if (i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j] == 'O') {
            board[i][j] = 'V';
            dfs(i + 1, j, board);
            dfs(i - 1, j, board);
            dfs(i, j + 1, board);
            dfs(i, j - 1, board);
        }
    }
}
