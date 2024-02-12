//import java.util.Scanner;

public class ConstructionApp {
    public static void main(String[] args) throws Exception {
        FileListActions fileActList = new FileListActions();
        // Add files
        fileActList.addFile(new JobSubClass("DeckBuild", 5, "Job"));
        fileActList.addFile(new JobSubClass("Bathroom Remodel", 6, "Job"));
        fileActList.addFile(new JobSubClass("Paint Project", 7, "Job"));

        fileActList.addFile(new CustomerSheet("John", "Doe", 45, "CustomerSheet"));
        fileActList.addFile(new CustomerSheet("Jill", "Doe", 46, "CustomerSheet"));
        fileActList.addFile(new CustomerSheet("Joe", "Dirte", 47, "CustomerSheet"));
        

        fileActList.addFile(new PaperWorkSubClass("File", 101, "PaperWork"));
        fileActList.addFile(new PaperWorkSubClass("XML", 102, "PaperWork"));
        fileActList.addFile(new PaperWorkSubClass("PDF", 103, "PaperWork"));

        
        fileActList.printReport();
        

        
    }
}
