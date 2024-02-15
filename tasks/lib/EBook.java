package lib;

public class EBook extends Book{


    // MB
    private int fileSizeMB;
    private String format;


    public EBook(String name, String author, int year, int fileSizeMB, String format) {
        super(name, author, year);
        this.fileSizeMB = fileSizeMB;
        this.format = format;
    }

    public int getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(int fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
