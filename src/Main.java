public class Main {
    public static void main(String[] args) {

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
                    if(needGoToSchool){
                        System.out.println(" you have to go to school");
                        int vozrast3 = 21;
                        boolean needGoToUniversity = vozrast3>18 || vozrast3<24;
                        if(needGoToUniversity){
                            System.out.println("you have to go to university");
                        }
                    }
                }
            }

        }

    }


}

