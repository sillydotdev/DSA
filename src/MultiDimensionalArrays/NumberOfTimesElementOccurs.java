package MultiDimensionalArrays;//----------------Number of times a number occus in a 2D-array------------------

public class NumberOfTimesElementOccurs {
    public static void countNumber(int matrix[][], int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println("Number "+key+" appears "+count+" times...");

    }

    public static void main(String args[]){
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};

        countNumber(matrix, 8);            
        
    }
    
}
