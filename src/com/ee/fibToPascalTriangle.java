class Result {
    
    public static String printNumbers(int fibNumber) {
        if(fibNumber == 1){
            return "1";
        }
        String result = "";
        
        // Construct Pascal's Triangle
        int[][] triangle = new int[100][100];
        for(int x = 0; x < triangle.length; x++){
            triangle[x][0] = 1;
            for(int y = 1; y < x; y++){
                triangle[x][y] = triangle[x - 1][y - 1] + triangle[x - 1][y];
            }
            triangle[x][x] = 1;
            
            // Compute Sum
            int sum = 0;
            int a = x; 
            int b = 0;
            String temp = "";
            while(a >= 0 && b < triangle[0].length && triangle[a][b] != 0){
                sum += triangle[a][b];
                temp += triangle[a][b] + " ";
                a--;
                b++;
            }
                    
            // Check Answer
            if(sum == fibNumber){
                //printPascalTriangle(triangle);
                return temp;
            }
        }
        
        return result;
    }
    
    public static void printPascalTriangle(int[][] triangle){
        for(int x = 0; x < triangle.length; x++){
            for(int y = 0; y < x + 1; y++){
                System.out.print(triangle[x][y] + " ");
            }
            System.out.println();
        }
    }

}
