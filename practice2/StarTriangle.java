
class StarTriangle {
  private int width;
  StarTriangle(int width) {
    this.width = width;
  }
  @Override
  public String toString() {
    String chunk = "[*]";
    StringBuilder returnable = new StringBuilder();
    for(int i = 0; i < width; i++){
      for(int j = 0; j <= i; j++){
        returnable.append(chunk);
      }
      returnable.append('\n');
    }
    return returnable.toString();
  }
}
