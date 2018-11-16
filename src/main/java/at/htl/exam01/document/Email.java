package at.htl.exam01.document;

class Email extends Document{
    private String subject;
    private String to;

    public String getSubject() {
        return this.subject;
    }

    public void email(String author,String subject, String to) {

    }

    public String getTo(){
        return this.to;
    }

}