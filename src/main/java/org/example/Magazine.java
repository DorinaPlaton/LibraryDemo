package org.example;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getDescription() {
        return "Description of a magazine here";
    }
}
