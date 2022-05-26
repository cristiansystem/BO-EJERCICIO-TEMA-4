public class Main {
    public static void main(String[] args) {
        compareNumberIf(5); //Positive number
        compareNumberIf(-5); //Negative number
        compareNumberIf(0); //Cero

        //Bucle While
        whileDo();

        //DoWhile
        doWhile();

        //BucleFor
        bucleFor();

        //Switch
        switchFunction("Spring");
    }

    public static void compareNumberIf( int numberIf) {
        System.out.println("compareNumberIf");
        if ( numberIf > 0 ) {
            System.out.println("Número es positivo: " + numberIf);
        } else if (numberIf < 0 ) {
            System.out.println("Número es negativo: " + numberIf);
        } else {
            System.out.println("Número es cero: " + numberIf);
        }
    }

    public static void whileDo () {
        System.out.println("whileDo");
        int numberWhile = 0;
        while ( numberWhile < 3 ) {
            numberWhile++;
            System.out.println( numberWhile );
        }
    }

    public static void doWhile () {
        System.out.println("doWhile");
        int numberWhile = 0;
        do {
            numberWhile++;
            System.out.println(numberWhile);
        }
        while ( numberWhile < 1);
    }

    public static void bucleFor () {
        System.out.println("bucleFor");
        for (int numberFor = 0; numberFor <= 3 ; numberFor++) {
            System.out.println(numberFor);
        }
    }

    public static void switchFunction (String station) {
        System.out.println("switchFunction");
        switch (station) {
            case "Spring":
                System.out.println("You are in Spring");
                break;
            case "Summer":
                System.out.println("You are in Summer");
                break;
            case "Autumn":
                System.out.println("You are in Autumn");
                break;
            case "Winter":
                System.out.println("You are in Winter");
                break;
            default:
                System.out.println("This is not station");
                break;
        }
    }
}