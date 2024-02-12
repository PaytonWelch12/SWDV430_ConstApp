// import java.util.ArrayList;

public class VisitorImplementation implements Visitor {
  // public void printReports(ArrayList<FileBaseClass> files) {
  //   for (FileBaseClass file : files) {
  //     file.accept(this);
  //   }
  // }

  @Override
  public void visit(JobSubClass job) {
    
    String output = "Filetype: (" + job.getFileType() + ")   Refrence Number: (" + job.getRefrenceNumber() + ")   Job Description: (" +  job.getFileDescription() + ")";
    System.out.println(output);
    
  }

  @Override
  public void visit(PaperWorkSubClass paper) {
    String output = "Filetype: (" + paper.getFileType() + ")   Refrence Number: (" + paper.getRefrenceNumber() + ")   Paper Work Type: (" +  paper.getPaperWorkType() + ")";
    System.out.println(output);
  }

  @Override
  public void visit(CustomerSheet cust) {
    String output = "Filetype: (" + cust.getFileType() + ")   Refrence Number: (" + cust.getRefrenceNumber() + ")   Customer Name: (" +  cust.getFullName() + ")";
    System.out.println(output);
  }
}
