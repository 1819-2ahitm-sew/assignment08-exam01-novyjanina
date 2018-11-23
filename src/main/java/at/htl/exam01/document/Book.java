package at.htl.exam01.document;

class Book extends Document{

    private String title;


    public Book(String author, String title ){
        super(author);
        this.title= title;

    }

    @Override
    public String toString() {
        return "Buch: '" +this.title+"' von "+this.author;
    }



}
