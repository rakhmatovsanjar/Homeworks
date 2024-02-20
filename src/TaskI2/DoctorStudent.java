package TaskI2;

public class DoctorStudent implements Abuturent, ChemistryAbuturent, BiologyAbuturent {
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
    public void biologyReading() {
        System.out.print("Mutaxasislik biologiya ");
    }

    @Override
    public void chemistryReading() {
        System.out.println("Mutaxasislik kimyo ");
    }
}
