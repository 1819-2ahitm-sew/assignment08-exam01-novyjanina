package at.htl.exam01.document;

public abstract class Document{
    protected String author;

    public Document(){
    }
    public Document(String author){
      this.author = author;
    }

    public abstract String toString();

}