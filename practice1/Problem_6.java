import java.util.Scanner;

class Problem_6 {
  static class MyString {
    private String string;
    MyString(String string) {
      this.string = string;
    }
    public boolean isPalindrome() {
      int l = 0, r = string.length() - 1;
      while(l < r){
        if(string.charAt(l++) != string.charAt(r--)) return false;
      }
      return true;
    }
    @Override
    public String toString() {
      return this.string;
    }
  }
  public static void solve(Scanner sc) {
    String str = sc.nextLine();
    MyString mstr = new MyString(str);
    System.out.printf("%s is %s", mstr, (mstr.isPalindrome()) ? "a Palindrome" : "not a Palindrome");
  }
  
}
