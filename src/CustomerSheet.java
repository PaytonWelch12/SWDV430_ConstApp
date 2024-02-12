public class CustomerSheet extends FileBaseClass {
  public String FName, LName;

  CustomerSheet(String FName, String LName, int refrenceNumber, String type) {
    super(refrenceNumber, type);
    this.FName = FName;
    this.LName = LName;
  }

  public String getFullName() {
    String output = LName + " " + FName;
    return output;
}

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
