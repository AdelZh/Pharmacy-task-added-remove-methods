// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Medicine medicine=new Medicine("Adel", 34, 1);
        Medicine medicine1=new Medicine("Alina", 55, 8);
        Medicine medicine22=new Medicine("sdfgh", 567, 90);


        Medicine[] medicines={medicine, medicine1};

        Worker worker=new Worker("Elina", 24, "@zhyldyzbekova");
        Worker worker1=new Worker("Eliza", 21, "@afghj");

        Worker[] workers={worker, worker1};

        Medicine medicine2=new Medicine("Aziz", 78, 9);
        Medicine medicine3=new Medicine("Anara", 89, 6);

        Worker worker2=new Worker("Jan", 78, "@sdfgh");
        Worker worker3=new Worker("Zhandar", 88, "@zhandar");

        Medicine[] medicines1={medicine2, medicine3};
        Worker [] workers1={worker2, worker3};

        Pharmacy pharmacy=new Pharmacy("Neman", "Moscow",medicines, workers);
        Pharmacy pharmacy1=new Pharmacy("Neman22", "Japan", medicines1, workers1);

        DataBase dataBase= new DataBase();
        dataBase.setPharmacies(new Pharmacy[]{pharmacy,pharmacy1});
        dataBase.getAllMedicinesPharmacyName("Neman");
        System.out.println("-----------------------------------------");
        dataBase.getAllMedicinesPharmacyName("Neman22");
        System.out.println("---------------------------------------------");


        System.out.println(dataBase.getAllSortedWorkersNameByPharmacyAddress("Moscow"));
        System.out.println("----------------------");
        System.out.println(dataBase.getAllSortedWorkersNameByPharmacyAddress("Japan"));
        System.out.println("-----------------------");
        System.out.println("------------------------");

        pharmacy.updateMedicineByPrice("Adel", 100);
        System.out.println("-------------------------");



        pharmacy.deleteMedicineByName("Alina");
        System.out.println("---------------------------");


        pharmacy1.deleteWorkerByName("Zhandar");
        System.out.println("-----------------------------");

        dataBase.getPharmacyByWorkerName("Eliza");
        System.out.println("------------------");

        dataBase.addMedicineToPharmacy("Neman",medicine22);
    }
}