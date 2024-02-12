// Base class for files. Type and refrence number are the super values.

public abstract class FileBaseClass {
    private static String sep = System.lineSeparator();
    private int refrenceNumber;
    private String type;

    public FileBaseClass(int refrenceNumber, String type) {
        this.refrenceNumber = refrenceNumber;
        this.type = type;
    }

    public int getRefrenceNumber() {
        return this.refrenceNumber;
    }

    public String getFileType() {
        return this.type;
    }

    public String toString() {
        String returnString = "File" + "\n" +
                "\tRefrence Number: " + this.getRefrenceNumber() + sep +
                "\tFile Type: " + this.getFileType();
        return returnString;
    }

    public abstract void accept(Visitor visitor);
}