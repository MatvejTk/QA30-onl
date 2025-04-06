package hometasks.lesson8.Task3;

public class Register {
    Document[] documents = new Document[10];
    private int list = 0;

    public void saveDocument(Document files) {
        if (list < 10) {
            documents[list] = files;
            list++;
        }
        else {
            System.out.println("You can't add new document to the array");
        }
    }
    public void getDocumentInfo(Document files) {
        files.getInfo();
    }
}
