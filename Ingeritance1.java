class vehical {
    public void conds() {
        System.out.println("The present car is ");
    }
}

class supra extends vehical {
    public void conds() {
        System.out.println("The car is being repaired");
    }
}

public class Ingeritance1 {
    public static void main(String[] args) {
        vehical veh = new vehical();
        supra sup1 = new supra();
        veh.conds();
        sup1.conds();

    }
}