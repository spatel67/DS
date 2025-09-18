import java.io.*;
import java.util.*;

public class TicTacToe
{
    static char[][] board =
            {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
            };
    static boolean playerTurn = true;
    static String filelala = "TicTacToe";


    static void loadGame()
    {
        try {
            File file = new File(filelala);
            if (file.exists()) {
                Scanner reader = new Scanner(file);
                for (int i = 0; i < 3; i++) {
                    String line = reader.nextLine();
                    for (int j = 0; j < 3; j++) {
                        board[i][j] = line.charAt(j);
                    }
                }
                playerTurn = Boolean.parseBoolean(reader.nextLine());
                reader.close();
                System.out.println("Game loaded!");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error loading game.");
        }
    }


    static void saveGame()
    {
        try
        {
            PrintWriter writer = new PrintWriter(new FileWriter(filelala));
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    writer.print(board[i][j]);
                }
                writer.println();
            }
            writer.println(playerTurn);
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println("Error saving game.");
        }
    }


    static void deleteF()
    {
        File file = new File(filelala);
        if (file.exists()) file.delete();
    }


    static void printBoard()
    {
        System.out.println();
        for (int i = 0; i < 3; i++)
        {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("-----------");
        }
        System.out.println();
    }


    static boolean checkWin(char symbol)
    {
        for (int i = 0; i < 3; i++)
        {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) return true;
        return false;
    }


    static boolean isDraw()
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }


    static void OMove()
    {
        Random rand = new Random();
        int r, c;
        while (true)
        {
            r = rand.nextInt(3);
            c = rand.nextInt(3);
            if (board[r][c] == ' ')
            {
                board[r][c] = 'O';
                break;
            }
        }
    }


    public static void main(String[] args)
    {
        loadGame();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            printBoard();

            if (checkWin('X'))
            {
                System.out.println("X wins!");
                deleteF();
                break;
            }
            if (checkWin('O'))
            {
                System.out.println("O wins!");
                deleteF();
                break;
            }
            if (isDraw())
            {
                System.out.println("It's a draw!");
                deleteF();
                break;
            }

            if (playerTurn)
            {
                System.out.println("Enter row (0-2) or 3 to save & quit:");
                int row = scanner.nextInt();
                if (row == 3)
                {
                    saveGame();
                    System.out.println("Game saved.");
                    break;
                }
                System.out.println("Enter col (0-2) or 3 to save & quit:");
                int col = scanner.nextInt();
                if (col == 3)
                {
                    saveGame();
                    System.out.println("Game saved.");
                    break;
                }

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = 'X';
                    playerTurn = false;
                }
                else
                {
                    System.out.println("Invalid move, try again.");
                }
            }
            else
            {
                OMove();
                playerTurn = true;
            }
        }
        scanner.close();
    }
}