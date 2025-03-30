package hometasks.lesson7.hospital;

class Patient {
    private final int medicalPlan;
    private Doctor doctor;

    public Patient(int medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public int getMedicalPlan() {
        return medicalPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
