import java.util.Arrays;

public class Pharmacy {

    private String name;
    private String address;
    private Medicine[] medicines;
    private Worker[] workers;

    public Pharmacy(String name, String address, Medicine[] medicines, Worker[] workers) {
        this.name = name;
        this.address = address;
        this.medicines = medicines;
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Medicine[] getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine[] medicines) {
        this.medicines = medicines;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public void updateMedicineByPrice(String medicineName, int newPrice) {
        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i].getName().equals(medicineName)) {
                medicines[i].setPrice(newPrice);
                System.out.println(medicines[i]);
            }
        }
    }

    public void deleteMedicineByName(String medicineName) {
        int indexRemove = -1;
        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i].getName().equals(medicineName)) {
                indexRemove = i;
            }
        }
        if (indexRemove != -1) {
            Medicine[] arr = new Medicine[medicines.length - 1];
            int j = 0;
            for (int i = 0; i < medicines.length; i++) {
                if (i != indexRemove) {
                    arr[i] = medicines[i];
                    j++;

                    System.out.println(medicines[i]);

                }
            }
            medicines = arr;
        }

    }
    public void deleteWorkerByName(String medicineName){
        int indexRemove = -1;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(medicineName)) {
                indexRemove = i;
            }
        }
        if (indexRemove != -1) {
            Medicine[] arr = new Medicine[workers.length - 1];
            int j = 0;
            for (int i = 0; i < workers.length; i++) {
                if (i != indexRemove) {

                    j++;

                    System.out.println(workers[i]);

                }
            }

        }

    }








    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", medicines=" + Arrays.toString(medicines) +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
