public class Merge_Dvds {

    private static final Dvds[] Array1 = new Dvds[5];

    private static final Dvds[] Array2 = new Dvds[5];

    private static final Dvds[] DvdsMerged = new Dvds[Array1.length + Array2.length];

    int count = 0;

    public void addArry1(Dvds dvd) {
        if (count < Array1.length) {
            Array1[count] = dvd;
            count++;
        }
    }

    public void addArry2(Dvds dvd) {
        if (count < Array2.length) {
            Array2[count] = dvd;
            count++;
        }
    }

    public void print1() {
        System.out.println("Dvds that are in the First array:");
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i].toString());

        }
    }

    public void print2() {
        System.out.println("Dvds that are in the Second array:");
        for (int i = 0; i < Array2.length; i++) {
            System.out.println(Array2[i].toString());
        }
    }

    public void print3() {
        System.out.println("Dvds Merged together:");
        for (int i = 0; i < DvdsMerged.length; i++) {
            System.out.println(DvdsMerged[i].toString());
        }
    }
    
    public static void sort() {
        for (int i = 1; i < DvdsMerged.length; i++) {
            for (int j = 0; j < DvdsMerged.length - i; j++) {
                if (DvdsMerged[j].getId() > DvdsMerged[j + 1].getId()) {
                    Dvds tempArray = DvdsMerged[j];
                    DvdsMerged[j] = DvdsMerged[j + 1];
                    DvdsMerged[j + 1] = tempArray;
                }
            }
        }
    }

    public static void Merge() {
        int i = 0, j = 0, k = 0;
        while (i < Array1.length && j < Array2.length) {
            if (Array1[i].getId() < Array2[j].getId()) {
                DvdsMerged[k++] = Array1[i++];
            } else {
                DvdsMerged[k++] = Array2[j++];
            }
        }
        while (i < Array1.length) {
            DvdsMerged[k++] = Array1[i++];
        }
        while (j < Array2.length) {
            DvdsMerged[k++] = Array2[j++];
            
        }
        sort();
    }

    public static void main(String[] args) {

        Merge_Dvds addDvds1 = new Merge_Dvds();

        Merge_Dvds addDvds2 = new Merge_Dvds();

        Dvds dvd1 = new Dvds(1, "Mission Impossible", "Blu-Ray", 2);
        Dvds dvd2 = new Dvds(7, "Batman", "Dvd", 3);
        Dvds dvd3 = new Dvds(3, "The Crow", "VHS", 16);
        Dvds dvd4 = new Dvds(8, "The secret garden", "Blu-Ray", 7);
        Dvds dvd5 = new Dvds(9, "Iron Man", "Dvd", 5);

        Dvds dvd6 = new Dvds(10, "The Van", "Dvd", 12);
        Dvds dvd7 = new Dvds(2, "Hop", "Dvd", 1);
        Dvds dvd8 = new Dvds(4, "Death Race", "Blu-Ray", 4);
        Dvds dvd9 = new Dvds(5, "Fight Club", "Dvd", 15);
        Dvds dvd10 = new Dvds(6, "InterMission", "VHS", 2);

        addDvds1.addArry1(dvd1);
        addDvds1.addArry1(dvd2);
        addDvds1.addArry1(dvd3);
        addDvds1.addArry1(dvd4);
        addDvds1.addArry1(dvd5);

        addDvds2.addArry2(dvd6);
        addDvds2.addArry2(dvd7);
        addDvds2.addArry2(dvd8);
        addDvds2.addArry2(dvd9);
        addDvds2.addArry2(dvd10);

        addDvds1.print1();
        System.out.println("");

        addDvds2.print2();
        System.out.println("");

        
        Merge();
        addDvds2.print3();

    }

}
