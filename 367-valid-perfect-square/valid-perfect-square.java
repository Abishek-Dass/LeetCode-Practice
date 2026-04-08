class Solution {
    public boolean isPerfectSquare(int num) {
        double a = Math.pow(num, 0.5);
        double b = Math.floor(a);
        return a==b;
    }
}