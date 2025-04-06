package hometasks.lesson8.Task3;

import java.util.Date;

public class SupplyContract extends Document{
    private String cargoType;
    private int cargoAmount;

    public SupplyContract
            (int docNumber, Date docDate, String cargoType, int cargoAmount) {
        super(docNumber, docDate);
    }
    public int getDocNumber(){
        return docNumber;
    }

    @Override
    public void getInfo () {
        System.out.println("Cargo number " + docNumber + "\n" + "Cargo date " + docDate + "\n" +
                "Cargo type " + cargoType + "\n" + "Cargo Amount " + cargoAmount + "\n");
    }
}
