
class Time {
  private int hour;
  private int minute;
  private int second;
  Time(int hour, int minute, int second) throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
    if(hour > 23){
      throw new InvalidHourException("hour can't be > 23");
    }
    if(minute > 59) {
      throw new InvalidMinuteException("minute can't be > 59");
    }
    if(second > 59) {
      throw new InvalidSecondException("second can't be > 59");
    }
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  public String toUniversal() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
  public String toStandard() {
    String end = (hour == 0 || hour / 12 < 1) ? "AM" : "PM";
    int temp = ((hour > 12) ? hour - 12 : hour);
    if(hour == 0) temp = 12;
    return String.format("%02d:%02d:%02d %s", temp, minute, second, end );
  }
  public void add(Time t) {
    hour = (hour + t.hour) % 24;
    minute = (minute + t.minute) % 60;
    second = (second + t.second) % 60;
  }
  public static Time add(Time t1, Time t2) {
    t1.add(t2);
    return t1;
  }
  public static class InvalidHourException extends Exception {
    InvalidHourException(String msg){
      super(msg);
    }
  }
  public static class InvalidMinuteException extends Exception {
    InvalidMinuteException(String msg) {
      super(msg);
    }
  }
  
  public static class InvalidSecondException extends Exception {
    InvalidSecondException(String msg) {
      super(msg);
    }
  }
}
