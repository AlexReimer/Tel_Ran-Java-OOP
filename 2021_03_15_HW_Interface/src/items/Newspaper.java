package items;

import interfaces.IPrintable;

public class Newspaper extends MassMedia implements IPrintable {
    String issueNumber;
    int numberOfPages;


    public Newspaper(String name, String issueNumber, int numberOfPages) {
        super(name);
        this.issueNumber = issueNumber;
        this.numberOfPages = numberOfPages;
    }

    public Newspaper(String issueNumber, int numberOfPages) {
        this.issueNumber = issueNumber;
        this.numberOfPages = numberOfPages;
    }

    public Newspaper() {
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    @Override
    public String toString() {
        return "Newspaper{" +
                " name= '" + name +
                ", issueNumber='" + issueNumber + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public void print() {
        System.out.println("We are a print media");
    }
}
