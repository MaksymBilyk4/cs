public class WordSearchII {
    static int calc = 0;
    static void findWord(int i, int j, int n, int m, char[][] matrix, String word, int curPos){
        if(curPos == word.length() - 1){
            calc++;
            return ;
        }

        if(i + 1 < n && matrix[i + 1][j] == word.charAt(curPos + 1)) {
            findWord(i + 1, j, n, m, matrix, word, curPos + 1);
        }

        if(j + 1 < m && matrix[i][j + 1] == word.charAt(curPos + 1)){
            findWord(i, j + 1, n, m, matrix, word, curPos + 1);
        }

    }
    public static void main(String[] args) {

        char[][] matrix = {
                {'c', 'o', 'f', 'x'},
                {'a', 'd', 'a', 'g'},
                {'r', 'f', 'x', 'y'}
        };

        String[] words = {"code", "car", "fex"};

        System.out.println(wordSearch(matrix, words));
    }

    static int wordSearch(char[][] matrix, String[] words){

        // bound of array and matrix
        int n = matrix.length, m = matrix[0].length;

        for(String word : words){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(word.charAt(0) == matrix[i][j]) findWord(i, j, n, m, matrix, word, 0);
                }
            }
        }
        return calc;
    }
}
