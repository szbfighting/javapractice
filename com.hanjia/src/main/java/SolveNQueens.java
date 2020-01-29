import java.util.ArrayList;
import java.util.List;

/**
 * @Author 大狼狗skr~
 * @Date 2020/1/29 12:44
 * @Version 1.0
 */
public class SolveNQueens {

    public static void main(String[] args) {

        System.out.println(new Solution().solveNQueens(5));
    }

    static class Solution {
        public List<List<String>> solveNQueens(int n) {
            boolean[][] isOk = new boolean[n][n];
            char[][] map = new char[n][n];
            List<List<String>> lists = new ArrayList<>();
            for (int i = 0;i<n;i++){
                for (int j = 0;j<n;j++)
                    isOk[i][j]=true;
            }
            backStrack(lists,isOk,map,0);
            return lists;
        }

        public void backStrack(List<List<String>> lists,boolean[][] isOk,char[][] map,int row){
            if (row==map.length){
                List<String> list = new ArrayList<>();
                for (int i = 0;i<map.length;i++){
                    String s = new String(map[i]);
                    list.add(s);
                }

                lists.add(list);
            }else {
                for (int i = 0; i < map[0].length; i++) {
                    char[][] nMap = new char[map.length][map.length];
                    boolean[][] nIsOk = new boolean[isOk.length][isOk.length];
                    copyArray(map,nMap,isOk,nIsOk);
                    if (isOk[row][i]) {
                        nMap[row][i] = 'Q';
                        checkMap(nIsOk, nMap, row, i);
                        backStrack(lists, nIsOk, nMap, row + 1);
                    }

                }
            }
        }

        public void copyArray(char[][] map,char[][] nMap,boolean[][] isOk,boolean[][] nIsOk){
            for (int i = 0;i<map.length;i++){
                for (int j = 0;j<map.length;j++){
                    nMap[i][j]=map[i][j];
                    nIsOk[i][j]=isOk[i][j];
                }
            }
        }

        public void checkMap(boolean[][] isOk,char[][] map,int row,int col){
            for (int i = 0;i<map.length;i++){
                for (int j = 0;j<map[0].length;j++){
                    if (i==row&&j==col)
                        continue;
                    if (i==row&&j!=col){
                        isOk[i][j]=false;
                        map[i][j]='.';
                    }
                    if (j==col&&i!=row){
                        isOk[i][j]=false;
                        map[i][j]='.';
                    }
                    if ((i+j==row+col)||(i-j==row-col)){
                        isOk[i][j]=false;
                        map[i][j]='.';
                    }
                }
            }
        }
    }
}
