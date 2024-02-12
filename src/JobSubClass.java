// Subclass of file type job. Holds the unfinished get net profit function. Will
// hold more values later on.
public class JobSubClass extends FileBaseClass {
    public String type;
    public String description;

    JobSubClass(String description, int refrenceNumber, String type) {
        super(refrenceNumber, type);
        this.type = type;
        this.description = description;
    }

    public void getNetProfit() {
        System.out.println("can't get net profit right now.");
    }

    public String getFileType() {
        return type;
    }
    public String getFileDescription() {
        return description;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
