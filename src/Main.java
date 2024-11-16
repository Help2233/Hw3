public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание номер 1");

        byte a = 26;
        System.out.println(a);
        short b = -1324;
        System.out.println(b);
        int c = 1003543;
        System.out.println(c);
        long d = 1304242844;
        System.out.println(d);
        float e = 443.3424533f;
        System.out.println(e);
        double g = 24525.247259259432856f;
        System.out.println(g);

        System.out.println("Задание номер 2 ");

        float q = 27.12f;
        long w = 987678965549L;
        float r = 2.786f;
        short t = 569;
        short y = -159;
        short u = 27897;
        byte o = 67;

        System.out.println("Задание номер 3 ");

        short lyudmilaPavlovna = 23;
        short annaSergeevna = 27;
        short ekaterinaAndreevna = 30;
        short totalPaper = 480;
        short allStudents = (short) (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + totalPaper / allStudents + " листов бумаги");

        System.out.println("Задание номер 4");

        int machinePerformance2 = 16;
        int time2 = 2;
        int time20 = 20;
        int machinePerformance1 = machinePerformance2 / time2;
        System.out.println("За " + time20 + " минут машина произвела " + machinePerformance1 * time20 + " штук бутылок");
        int hours24 = 24 * 60;
        System.out.println("За " + hours24 + " минут машина произвела " + machinePerformance1 * hours24 + " штук бутылок");
        int days3 = hours24 * 3;
        System.out.println("За " + days3 + " минут машина произвела " + machinePerformance1 * days3 + " штук бутылок");
        int month1 = 30 * hours24;
        System.out.println("За " + month1 + " минут машина произвела " + machinePerformance1 * month1 + " штук бутылок");

        System.out.println("Задача номер 5");

        int paint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int totalClasses = paint / (whitePaint + brownPaint);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint * totalClasses + " банок белой краски и  " + brownPaint * totalClasses + " банок коричневой краски");

        System.out.println("Задача номер 6");

        int bananas5 = 5 * 80;
        int milk200 = 2 * 105;
        int iceCream2 = 2 * 100;
        int eggs4 = 4 * 70;
        int weightInGrams = bananas5 + milk200 + iceCream2 + eggs4;
        float weightInKilograms = weightInGrams / 1000f;
        System.out.println("Вес в граммах сотовляет " + weightInGrams + " такого завтрака");
        System.out.println("Вес в килограммах состовляет " + weightInKilograms + " такого завтрака");

        System.out.println("Задача номер 7");

        int weightLoss1 = 250;
        int weightLoss2 = 500;
        float loseWeight = 7 * 1000f;
        System.out.println("Если каждый день терять вес " + weightLoss1 + " грамм, то за " + loseWeight / weightLoss1 + " дней можно добиться результата похудения");
        System.out.println("Если каждый день терять вес " + weightLoss2 + " грамм, то за " + loseWeight / weightLoss2 + " дней можно добиться результата похудения");
        float minimum = loseWeight / weightLoss2;
        float maximum = loseWeight / weightLoss1;
        System.out.println("В среднем понадобиться " + (maximum + minimum) / 2 + " дней, чтобы добиться результат похудения");

        System.out.println("Задача номер 8");

        float masha = 67760;
        System.out.println("Маша получает " + masha + " рублей в месяц");
        float raisingMasha = 67760 * 0.1f;
        System.out.println("После увеличения зарплаты Маши стало " + (raisingMasha + masha) + " рублей в месяц");
        float mashasAnnualIncome = masha * 12;
        float mashaNewAnnualIncome = (raisingMasha + masha) * 12;
        System.out.println("старый годовой доход Mаши состовлял " + mashasAnnualIncome + " рублей, а новый состовляет " + mashaNewAnnualIncome + " рублей");
        float differenceMasha = mashaNewAnnualIncome - mashasAnnualIncome;
        System.out.println("Маша теперь получает в год " + mashaNewAnnualIncome + " рублей.Годовой доход вырос на " + differenceMasha + " рублей");


        float denis = 83690f;
        System.out.println("Денис получает " + denis + " рублей в месяц");
        float raisingDenis = 83690 * 0.1f;
        System.out.println("После увеличения зарплаты Дениса стало " + (raisingDenis + denis) + " рублей в месяц");
        float denisAnnualIncome = denis * 12;
        float denisNewAnnualIncome = (raisingDenis + denis) * 12;
        System.out.println("старый годовой доход Дениса состовлял " + denisAnnualIncome + " рублей, а новый состовляет " + denisNewAnnualIncome + " рублей");
        float differenceDenis = denisNewAnnualIncome - denisAnnualIncome;
        System.out.println("Денис теперь получает в год " + denisNewAnnualIncome + " рублей.Годовой доход вырос на " + differenceDenis + " рублей");


        float kristina = 76230f;
        System.out.println("Кристина получает " + kristina + " рублей в месяц");
        float raisingKristina = 76230 * 0.1f;
        System.out.println("После увеличения зарплаты Кристины стало " + (raisingKristina + kristina) + " рублей в месяц");
        float kristinaAnnualIncome = kristina * 12;
        float kristinaNewAnnualIncome = (raisingKristina + kristina) * 12;
        System.out.println("старый годовой доход Кристины состовлял " + kristinaAnnualIncome + " рублей, а новый состовляет " + kristinaNewAnnualIncome + " рублей");
        float differenceKristina = kristinaNewAnnualIncome - kristinaAnnualIncome;
        System.out.println("Кристина теперь получает в год  " + kristinaNewAnnualIncome + " рублей. Годовой доход вырос на " + differenceKristina + " рублей"); 


    }}

