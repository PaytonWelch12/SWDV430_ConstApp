public interface Visitor {
  public void visit(JobSubClass job);

  public void visit(PaperWorkSubClass paper);

  public void visit(CustomerSheet cust);
}
