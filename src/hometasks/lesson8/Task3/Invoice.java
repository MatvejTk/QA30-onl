package hometasks.lesson8.Task3;

import java.util.Date;

public class Invoice extends Document{
    private final int sumPrice;
    private final int departmentID;

    public Invoice(String docNumber, Date docDate, int sumPrice, int departmentID) {
        super(docNumber, docDate);
        this.sumPrice = sumPrice;
        this.departmentID = departmentID;
    }
    public String getDocNumber() {
        return docNumber;
    }
    @Override
    public void getInfo () {
        System.out.println("Invoice number " + docNumber + "\n" + "Invoice date " + docDate + "\n" +
                "Invoice total price " + sumPrice + "\n" + "Code of department " + departmentID + "\n");
    }
}
