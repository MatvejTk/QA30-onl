package hometasks.lesson8.Task3;

import java.util.Date;

public class EmployeeContract extends Document{
    private final Date contractEndDate;
    private final String employeeName;

    public EmployeeContract(String docNumber, Date docDate, Date contractEndDate, String employeeName) {
        super(docNumber, docDate);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }
    public String getDocNumber() {
        return docNumber;
    }
    @Override
    public void getInfo() {
        System.out.println("Contract number " + docNumber + "\n" + "Contract date " + docDate + "\n" +
                "Contract end date " + contractEndDate + "\n" + "Employee name " + employeeName + "\n");
    }
}
