
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] startAry = new int[] {0, 4, 7, 6, 2, 1, 3};
    int tgt = 10;
    int[] soln = new int[2];
    Solution mySoln = new Solution();
    soln = mySoln.twoSum(startAry, tgt);
    System.out.println(
      "["+soln[0]+", "+soln[1]+"]");
  }
}
