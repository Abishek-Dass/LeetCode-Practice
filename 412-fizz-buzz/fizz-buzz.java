class Solution {
    public List<String> fizzBuzz(int n) {
      ArrayList<String> list = new ArrayList<>();
      for(int i=1; i<=n; i++){
        list.add(((i%3==0)?(i%5==0) ? "FizzBuzz" : "Fizz":(i%5==0)?"Buzz":String.valueOf(i)));
      }  
      return list;
    }
}