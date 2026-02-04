
/**
 * Problem3
 */
public class Problem3 implements Problem {
  private Time time;
  private Time addTime;
  Problem3(Time time, Time addTime){
    this.time = time;
    this.addTime = addTime;
  }
  public void solve(){
    System.out.println(time.toStandard());
    System.out.println(time.toUniversal());
    System.out.println(Time.add(time, addTime).toUniversal());
    
    
  }
  
}
