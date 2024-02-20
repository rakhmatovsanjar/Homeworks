package TaskI2;

public class Main {
    public static void main(String[] args) {
        DoctorStudent doctorStudent=new DoctorStudent();
        doctorStudent.historyReading();
        doctorStudent.motherTongueReading();
        doctorStudent.mathReading();
        doctorStudent.biologyReading();
        doctorStudent.chemistryReading();
        System.out.println("-------------------------");
        GardenerStudent gardenerStudent=new GardenerStudent();
        gardenerStudent.historyReading();
        gardenerStudent.motherTongueReading();
        gardenerStudent.mathReading();
        gardenerStudent.mathSpecialistReadsing();
        gardenerStudent.chemistryReading();
    }
}
