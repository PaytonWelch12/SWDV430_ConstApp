// File List class. Holds the methods for adding files and printing the lists
// and searching the lists.

import java.util.ArrayList;
import java.util.Scanner;

public class FileListActions {
    private ArrayList<FileBaseClass> files;
    String type;

    public void Search() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the type of file to look for(Job, CustomerSheet,PaperWork): ");
        String inputAfter = scan.nextLine();
        type = inputAfter;
        scan.close();
        System.out.println("the type you entered is: " + type);

        if (type.equalsIgnoreCase("Job") || type.equalsIgnoreCase("PaperWork")
                || type.equalsIgnoreCase("CustomerSheet")) {
            System.out.println("Here are all of the file refrence numbers of type " + type);
            printList(type);

        } else {
            System.out.print(type + " is not an option exiting search");
        }

    }

    public FileListActions() {
        this.files = new ArrayList<FileBaseClass>();
    }

    public void addFile(FileBaseClass filePass) {
        files.add(filePass);
    }

    public void printList(String type) {
        for (FileBaseClass file : files) {
            file.getFileType();
            if (file.getFileType().equals(type)) {
                System.out.println(file.getRefrenceNumber());
            }

        }

    }
    public void printReport(){
        
        Visitor visitor = new VisitorImplementation();
        System.out.println("Printing all Cataloged Files\n____________________________\n");
        for(FileBaseClass file : files){
            file.accept(visitor); 
        }
        
    }
    // public void batonPass() {
    //     PrintReports pr = new PrintReports();
    // pr.printReports(files);

    // }
}


