
class Problem_1 implements Problem{
  class PrintMyName {
    PrintMyName(String name) {
      StringBuilder header = buildHeader(name)
                            .append('\n')
                            .append(buildBody(name))
                            .append('\n')
                            .append(buildHeader(name));
      System.out.println(header);
    }
    private static StringBuilder buildHeader(String name) {
      StringBuilder header = new StringBuilder("+");
      for (int i = 0; i < name.length(); i++) {
        header.append('-');
      }
      header.append('+');
      return header;
    }
    private static StringBuilder buildBody(String name) {
      StringBuilder body = new StringBuilder("|");
      body.append(name).append('|');
      return body;
    }
  }
  private String name;
  Problem_1(String name){
    this.name = name;
  }
  @Override
  public void solve() {
    new PrintMyName(name);
  }
}
