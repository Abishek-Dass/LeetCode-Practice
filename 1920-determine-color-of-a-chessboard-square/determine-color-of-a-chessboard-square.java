class Solution {
    public boolean squareIsWhite(String coordinates) {
        int row = (coordinates.charAt(1)-'0')-1;
        int col = (coordinates.charAt(0)-'a');

        if((row+col)%2==0)
        return false;
        else
        return true;
        
    }
}