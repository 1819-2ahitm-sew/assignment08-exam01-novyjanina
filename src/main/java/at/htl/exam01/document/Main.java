package at.htl.exam01.document;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Main {



    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {


    }
}

abstract class Document{
    String author;

    public void document(String Author){

    }

    public String getAuthor(){

        return this.author;
    }

}

class Book extends Document{
    String title;

    public void book(String author, String title ){

    }

    public String getTitle(){
        return this.title;
    }

}

class Email extends Document{
    String subject;


}


