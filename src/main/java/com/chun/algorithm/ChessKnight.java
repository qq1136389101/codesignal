package com.chun.algorithm;

/**
 * Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.
 *
 * The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.
 *
 * Example
 *
 *     For cell = "a1", the output should be
 *     chessKnight(cell) = 2.
 *
 *     For cell = "c2", the output should be
 *     chessKnight(cell) = 6.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string cell
 *
 *     String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.
 *
 *     Guaranteed constraints:
 *     cell.length = 2,
 *     'a' ≤ cell[0] ≤ 'h',
 *     1 ≤ cell[1] ≤ 8.
 *
 *     [output] integer
 *
 * @Author chun
 * @Date 2020/1/15 17:58
 */
public class ChessKnight {
    int chessKnight(String cell) {
        int x = cell.charAt(0) - 97;
        int y = cell.charAt(1) - 49;
        float a = 1;
        float b = 1;
        if(x == 0 || x == 7){
            a = 0.5f;
        }
        if(x == 1 || x == 6){
            a = 0.75f;
        }
        if(y == 0 || y == 7){
            b = 0.5f;
        }
        if(y == 1 || y == 6){
            b = 0.75f;
        }
        return (int)(8 * a * b);
    }

    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'h');
        System.out.println((int)'1');
        System.out.println((int)'8');
    }
}
