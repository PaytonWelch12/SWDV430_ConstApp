public class PaperWorkSubClass extends FileBaseClass {
  public String paperWorkType;

  PaperWorkSubClass(String paperWorkType, int refrenceNumber, String type) {
    super(refrenceNumber, type);
    this.paperWorkType = paperWorkType;
  }

  public String getPaperWorkType() {
    return this.paperWorkType;
}

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
