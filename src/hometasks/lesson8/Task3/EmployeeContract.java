package hometasks.lesson8.Task3;

import java.util.Date;

public class EmployeeContract extends Document{
    private Date contractEndDate;
    private String employeeName;

    public EmployeeContract(int docNumber, Date docDate, Date contractEndDate, String employeeName) {
        super(docNumber, docDate);
    }
    public int getDocNumber(){
        return docNumber;
    }
    @Override
    public void getInfo() {
        System.out.println("Contract number " + docNumber + "\n" + "Contract date " + docDate + "\n" +
                "Contract end date " + contractEndDate + "\n" + "Employee name " + employeeName + "\n");
    }
}
