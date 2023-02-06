public class Main {
    public static void hw2(String[] args) {

        int age = 18;
        if (age >= 18) {
            System.out.println("man is adult ");
        }
        if (age <= 18) {
            System.out.println(" this man isn't adult, should to wait ");
        }
        //task2;

        int grade = 5;
        if (grade <= 5) {
            System.out.println("Should wear a hat");
            if (grade >= 5) {
                System.out.println("you can go without a hat");
            }
            //task3
            int speed = 60;
            if (speed >= 60) {
                System.out.println("your speed is to high, you can get a penalty");
            }
            if (speed <= 60) {
                System.out.println("you can drive");

                //task4
                int vozrast = 4;
                boolean needGotoKinderGarden = vozrast > 2 || vozrast < 4;
                if (needGotoKinderGarden) {
                    System.out.println(" you have to go to kindergarten");

                    int vozrast2 = 12;
                    boolean needGoToSchool = vozrast2 > 7 || vozrast2 < 18;
                    if (needGoToSchool) {
                        System.out.println("if " + needGoToSchool + " you have to go to school");
                        int vozrast3 = 21;
                        boolean needGoToUniversity = vozrast3 > 18 || vozrast3 < 24;
                        if (needGoToUniversity) {
                            System.out.println("you have to go to university");
                        }
                    }//task 5

                    int kidage = 5;
                    if (kidage < 5) ;
                    System.out.println("you can't ride the carousel");

                    int kidage2 = 10;
                    if (kidage2 >= 5 && kidage2 <= 14) ;
                    {
                        System.out.println("you can ride with adults, but you can't without adults");

                        if (kidage2 > 14) ;
                        System.out.println("you can ride the carousel");

                        //task 6


                        int totalSeats = 102;
                        int seating = 60;
                        int standing = (totalSeats - seating);
                        if (totalSeats < seating + standing) ;{
                        System.out.println("there are still same places");
                    }else{
                        System.out.println("there are not seats");

                        //task 7


                        int one = 1;
                        int two = 2;
                        int three = 3;
                        if (three > one && three > two) ;{
                        System.out.println("three is biggest number");

                    }}












