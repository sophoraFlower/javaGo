package InheritanceAndPolymorphism;

import java.util.ArrayList;

public class Database {

    private ArrayList<CD> listCD = new ArrayList<>();
    private ArrayList<DVD> listDVD = new ArrayList<>();

    public void add(CD cd){
        listCD.add(cd);
    }

    public void list(){
        for (CD cd: listCD) {
            System.out.println(cd.toString());
        }
    }

    public static void main(String[] args) {
        Database database = new Database();
        CD cd1 = new CD("a", "tom", 130, "a_tom");
        CD cd2 = new CD("b", "kid", 120, "b_kid");
        database.add(cd1);
        database.add(cd2);
        database.list();

        Database database1 = new Database();
        DVD dvd1 = new DVD("c", "tom", 130, "c_tom");
        DVD dvd2 = new DVD("d", "kid", 120, "d_kid");
        database1.add(dvd1);
        database1.add(dvd2);
        database1.list();

        System.out.println(dvd1.isDVD());  // true
    }

}
