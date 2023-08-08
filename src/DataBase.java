import java.util.Arrays;

public class DataBase {

    private Pharmacy[] pharmacies;

    public DataBase() {

    }

    public Pharmacy[] getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(Pharmacy[] pharmacies) {
        this.pharmacies = pharmacies;
    }

    public void getAllMedicinesPharmacyName(String pharmacyName) {
        for (int i = 0; i < pharmacies.length; i++) {
            if (pharmacies[i].getName().equals(pharmacyName)) {
                System.out.println(pharmacies[i]);
            }
        }

    }

    public String getAllSortedWorkersNameByPharmacyAddress(String address) {
        for (int i = 0; i < pharmacies.length; i++) {
            if (pharmacies[i].getAddress().equals(address)) {
                System.out.println(pharmacies[i]);
            }
        }
        return null;
    }

    public void getPharmacyByWorkerName(String workerName){
        for (Pharmacy p:pharmacies) {
            for (Worker w:p.getWorkers()) {
                if(w.getName().equals(workerName)){
                    System.out.println(w);

                }

            }
        }
        }
        public void addMedicineToPharmacy(String pharmacyName, Medicine medicine){
        for(Pharmacy b: pharmacies){
            if(b.getName().equals(pharmacyName)){
                Medicine [] medicines1;
                medicines1=Arrays.copyOf(b.getMedicines(), b.getMedicines().length);
                medicines1[medicines1.length-1]=medicine;
                b.setMedicines(medicines1);
                System.out.println(b);
            }
        }
        }



    public void getAll(){
        for(int i=0; i<pharmacies.length; i++){
            System.out.println(pharmacies[i]+" ");
        }
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "pharmacies=" + Arrays.toString(pharmacies) +
                '}';
    }

}
