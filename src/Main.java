public class Main {
    public static void main(String[] args) {

        System.out.println("Задача номер 1");

      int age = 21;
       if (age >= 18) {
           System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
       } else {
           System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
       }

        System.out.println("Задача номер 2 ");

       int temperature = 2;
       if (temperature < 5 || temperature > 5) {
           System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
       } else {
        System.out.println("На улице " + temperature + " градусов, можно идти без шапки"); }

        System.out.println("Задача номер 3");

       int speed = 76;
       if (speed > 60 || speed < 60) {
           System.out.println("Если скорость " + speed + " то придется заплатить штраф");
       }else {
           System.out.println("Если скорость " + speed + " можно ездить спокойно"); }

        System.out.println("Задча номер 4");

       int theAgeOfThePerson = 16;
       if (theAgeOfThePerson >= 2 && theAgeOfThePerson <=6) {
           System.out.println("Если возраст человека равен " + theAgeOfThePerson + " , то ему нужно ходить в детский сад.");
       }
        if (theAgeOfThePerson > 7 && theAgeOfThePerson <=17) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " , то ему нужно ходить в школу");
        }
        if (theAgeOfThePerson >= 18 && theAgeOfThePerson < 24) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " , то его место в университете");
        }
        if (theAgeOfThePerson > 24) {
            System.out.println("Если возраст человека равен " + theAgeOfThePerson + " , то ему пора ходить на работу");
        }
        System.out.println("Задача номер 5");

        int ageOfTheChild = 7;
        if (ageOfTheChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageOfTheChild > 5 && ageOfTheChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageOfTheChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задача номер 6");

        int ticketNumber = 67;
        if (ticketNumber < 60) {
            System.out.println("Есть сидячие место");
        } else
            if (ticketNumber > 60 && ticketNumber < 102 ) {
                System.out.println("Есть стоячие места");
            } else if ( ticketNumber > 102)  {
                System.out.println("Нет мест в вагоне");

        }

        System.out.println("Задача номер 7");

            int one = 16;
            int two = 432;
            int three = 3;
            if ( one > two && one > three) {
                System.out.println("Число " + one + " больше всех");
            } else if (two > one && two > three) {
                System.out.println("Число " + two + " больше всех");
            } else {
                System.out.println("Число " + three + " больше всех");
            }



    }}


