public class Main {
    public static void main(String[] args) {
        int apple= 278897;
        byte orange = 67;
        short banana = 569;
        long lemon = 987678965549L;
        float melon = 27.12F;
        double grape = 2.786;

        System.out.println(apple);
        System.out.println(orange);
        System.out.println(banana);
        System.out.println(lemon);
        System.out.println(melon);
        System.out.println(grape);

        short paper = 480;
        byte ChilLudPavl = 23;
        byte ChilAnSerg = 27;
        byte ChilEkAn = 30;
        int AllChil = ChilEkAn+ChilAnSerg+ChilLudPavl;
        int ChilPaper = paper/ AllChil;
        System.out.println(ChilPaper);
        System.out.println("На каждого ученика рассчитано " + ChilPaper + " листов бумаги");

        byte bottle = 16;
        byte time = 2;
        int botMin = bottle / time ;
        int min20 = time * 10;
        int bot20min = botMin * min20;
        int Day = min20 * 72;
        int DayOne = Day/24/60;
        int botDay = botMin * Day;
        int Day3 = Day * 3;
        int DayThirt = DayOne*3;
        int bot3Day = botMin * Day3;
        int Day30 = Day * 30;
        int Month = Day30 / 30/24/60;
        int bot30Day = botMin * Day30;
        System.out.println("За " + min20 + " минут машина произвела " + bot20min + " штук бутылок");
        System.out.println("За " + DayOne + " день машина произвела " + botDay + " штук бутылок");
        System.out.println("За " + DayThirt + " дня машина произвела " + bot3Day + " штук бутылок");
        System.out.println("За " + Month + " месяц машина произвела " + bot30Day + " штук бутылок");

        byte paint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintClass = whitePaint + brownPaint;
        int allClass = paint/paintClass;
        int allWhite = whitePaint * allClass;
        int allBrown = brownPaint * allClass;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        byte bananas = 5;
        byte bananas1Weight = 80;
        short milk = 200;
        byte milk100Weight = 105;
        float milk1Weight = milk100Weight/100F;
        byte iceCream = 2;
        byte iceCream1Weight = 100;
        byte egg = 4;
        byte egg1Weight = 70;
        float coctail = bananas * bananas1Weight + milk * milk1Weight + iceCream * iceCream1Weight + egg * egg1Weight;
        System.out.println("Общий вес коктейля " + coctail + " грамм ");
        float coctailKg = coctail/1000F;
        System.out.println("Общий вес коктейля " + coctailKg + " килограмм ");

        byte ExcludeWeightKg = 7;
        int ExcludeWeightG = ExcludeWeightKg*1000;
        short ExcludeWeightG1 = 250;
        short ExcludeWeightG2 = 500;
        int Day1 = ExcludeWeightG / ExcludeWeightG1;
        int Day2 = ExcludeWeightG / ExcludeWeightG2;
        System.out.println("При похудении " + ExcludeWeightG2 + " грамм в день, спортсмен похудеет за " + Day2 + " дней");

        int SalaryMasha = 67760;
        int SalaryDenis = 83690;
        int SalaryKristina = 76230;
        float Premium = 1.1F;
        float PremiumMasha = SalaryMasha * Premium;
        float PremiumDenis = SalaryDenis * Premium;
        float PremiumKristina = SalaryKristina * Premium;
        float DiffMasha = PremiumMasha * 12-SalaryMasha * 12;
        float DiffDenis = PremiumDenis * 12-SalaryDenis * 12;
        float DiffKristina = PremiumKristina * 12-SalaryKristina * 12;
        System.out.println("Маша теперь получает " + PremiumMasha + " рублей. Годовой доход вырос на " + DiffMasha + " рублей.");


    }
}