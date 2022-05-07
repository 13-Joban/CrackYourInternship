// Appraoch 1 - > 

class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean rowcheck = false;
        boolean colcheck = false;
        
        int row = matrix.length;
        int col = matrix[0].length;
     
        
        for(int i=0; i<row; i++){
            
            if(matrix[i][0] == 0){
                rowcheck = true;
            }
        }
        
        
        
        for(int j=0; j<col; j++){
            
            if(matrix[0][j] == 0){
                colcheck = true;
            }
        }
        
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i=1; i<row; i++){
           if(matrix[i][0] == 0){
               
               for(int j=0; j<col; j++){
                   
                   matrix[i][j] = 0;
               }
           }
        }
        
        for(int j=1; j<col; j++){
           if(matrix[0][j] == 0){
               
               for(int i=0; i<row; i++){
                   
                   matrix[i][j] = 0;
               }
           }
        }
        
        if(rowcheck){
            for(int i=0; i<row; i++){
                matrix[i][0] = 0;
            }
        }
        if(colcheck){
            for(int j=0; j<col; j++){
                matrix[0][j] = 0;
            }
        }
    }
}


// Approach -2 

class Solution {
    public void setZeroes(int[][] matrix) {
        
       boolean col=true;     //set column as true, if we find any zero in first column we intitialize as false so it can change the column with zero at last
    for(int i=0;i<matrix.length;i++){
        if(matrix[i][0]==0) col=false;        //then we traverse the matrix and changes first row and column with zero if we find zero at that coordinates
        for(int j=1;j<matrix[0].length;j++) {
            if(matrix[i][j]==0) matrix[i][0]=matrix[0][j]=0;
        }
    }
    //then we traverse from back and replace 1 with 0 if "matrix[i][0]==0 || matrix[0][j]==0" base condition is true
    for(int i=matrix.length-1;i>=0;i--) {
        for(int j=matrix[0].length-1;j>=1;j--) {
            if(matrix[i][0]==0 || matrix[0][j]==0) matrix[i][j]=0;
        }
        if(col==false) {
            matrix[i][0]=0;   
        }
    }
    }
}

Time - 2*O(m*n) Space - O(1)
  
