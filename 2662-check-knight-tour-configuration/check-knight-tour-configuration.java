class Solution {
    public boolean isvalid(int[][] grid, int x, int y ,   int expectval ) {

           if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y] !=expectval){
                return false;
           }
           if(expectval == grid.length* grid[0].length - 1){
            return true;
           }
         
         boolean ans1=isvalid(grid, x-2 , y-1 ,  expectval+1 );
         boolean ans2=isvalid(grid, x-2 , y+1 ,  expectval+1 );
         boolean ans3=isvalid(grid, x-1 , y+2 ,  expectval+1 );
         boolean ans4=isvalid(grid, x+1 , y+2 ,  expectval+1 );
         boolean ans5=isvalid(grid, x+2 , y+1 ,  expectval+1 );
         boolean ans6=isvalid(grid, x+2 , y-1 ,  expectval+1 );
         boolean ans7=isvalid(grid, x+1 , y-2 ,  expectval+1 );
         boolean ans8=isvalid(grid, x-1 , y-2 ,  expectval+1);
          
        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;


    }

     public boolean checkValidGrid(int [][] grid){

       return isvalid(grid,0,0,0);
      



  }    

}
