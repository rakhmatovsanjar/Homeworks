package TaskI2;

public class GardenerStudent implements Abuturent,ChemistryAbuturent,MathSpecialistAbuturent{
    @Override
    public void mathReading() {
        System.out.print("Majbutiry matematika ");
    }

    @Override
    public void historyReading() {
        System.out.print("Majburiy tarix ");
    }

    @Override
    public void motherTongueReading() {
        System.out.print("Majburiy ona-tili ");
    }

    @Override
    public void mathSpecialistReadsing() {
        System.out.print("Mutaxasislik matematika ");
    }
    @Override
    public void chemistryReading() {
        System.out.println("Mutaxasislik kimyo ");
    }


}
