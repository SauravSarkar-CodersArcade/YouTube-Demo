public class ForEachLoop {
    public static void main(String[] args) {
        // Multi Dimensional Array with unequal number of elements in
        // each row is called a jagged array.
        // Each row is an array -> row.length
        int[][] jagged = {{1,2,3},
                          {4,5,6,7,8},
                          {7,8,9,0,1,2,3}};
        for (int i=0; i< jagged.length; i++){ // Rows
            for (int j=0; j<jagged[i].length; j++){ // Columns
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] arr : jagged){
            for (int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
