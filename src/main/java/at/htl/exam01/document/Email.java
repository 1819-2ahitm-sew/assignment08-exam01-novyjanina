package at.htl.exam01.document;

class Email extends Document{

    private String subject;
    private String to;

    public String getSubject() {
        return this.subject;
    }

    public Email(String author,String subject, String to) {
        super(author);
        this.subject=subject;
        this.to=to;
    }




    @Override
    public String toString() {
        return "Email: '"+this.subject +"' von "+this.author+" an "+this.to;
    }
}