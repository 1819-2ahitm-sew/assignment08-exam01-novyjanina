package at.htl.exam01.document;

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

        Document[] documents = new Document[3];

        documents[0]= new Book("Rowlings","Harry Potter und der Stein der Weisen");
        documents[1]= new Email("Susi","Bewerbung","CoolCompany");
        documents[2]= new Book("Tolkien","LordOfTheRings");

        for (int i = 0; i < documents.length; i++) {
            System.out.println(documents[i]);
        }

        int bookcounter=0;
        int emailcounter=0;
        for (int k = 0; k < documents.length; k++) {

            if (documents[k] instanceof Book ){
                bookcounter++;
            }else if (documents[k] instanceof Email){
                emailcounter++;
            }
        }
        System.out.println("");
        System.out.println("Anzahl Books: "+bookcounter);
        System.out.println("Anzahl Emails: "+emailcounter);





    }
}



