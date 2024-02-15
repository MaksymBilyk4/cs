package lib;

public class Magazine extends Book {

    private int issueNumber;
    private int issueMonth;

    public Magazine(String name, String author, int year, int issueNumber, int issueMonth) {
        super(name, author, year);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(int issueMonth) {
        this.issueMonth = issueMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", issueMonth=" + issueMonth +
                '}';
    }

}
