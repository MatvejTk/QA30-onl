package hometasks.lesson8.Task3;

import java.util.Date;

public class SupplyContract extends Document {
    private final String cargoType;
    private final int cargoAmount;

    public SupplyContract
            (String docNumber, Date docDate, String cargoType, int cargoAmount) {
        super(docNumber, docDate);
        this.cargoType = cargoType;
        this.cargoAmount = cargoAmount;
    }

    public String getDocNumber() {
        return docNumber;
    }

    @Override
    public void getInfo() {
        System.out.println("Cargo number " + docNumber + "\n" + "Cargo date " + docDate + "\n" +
                "Cargo type " + cargoType + "\n" + "Cargo Amount " + cargoAmount + "\n");
    }
}
