package hometasks.lesson8.Task3;

import java.util.Date;

public abstract class Document {
    public String docNumber;
    public Date docDate;

    void getInfo() {
    }
    public Document (String docNumber, Date docDate){
        this.docNumber = docNumber;
        this.docDate = docDate;
    }
}
