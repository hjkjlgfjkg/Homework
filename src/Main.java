public class Main {
    public static void main(String[] args) {
    //Задание 1
        int a =1;
        byte b=1;
        short c=1;
        long d=3L;
        float g=a+b+c+d+1f;
        System.out.println("Задача №1:");
        System.out.println(g);
    //Задание 2
         double boxer1=78.2;
         double boxer2=82.7;
         double weightOfAllBoxers= boxer1+boxer2;
         double weightDifference=boxer2-boxer1;
        System.out.println("Задача №2:");
        System.out.println("Общий вес " + weightOfAllBoxers);
        System.out.println("Разница " + weightDifference);
    //Задание 3
         float banan=80f;
         float milk=2*100f;
         float iceMilk=2*100f;
         float eggs=4*70f;
         float breakfast=(banan+milk+iceMilk+eggs)/1000;
         System.out.println("Задача №3:");
         System.out.println("Вес спорт-завтрака " + breakfast +" кг");
    //Задание 4
         float loseWeight=1000*7f;
         float deyWeight250=loseWeight/250;
         float deyWeight500=loseWeight/500;
         float deyWeightMean=(deyWeight250+deyWeight500)/2;
         System.out.println("Задача №4:");
         System.out.println("по 250гр. составит " + deyWeight250 +" дней");
         System.out.println("по 500гр. составит " + deyWeight500 +" дней");
         System.out.println("среднее значение составит " + deyWeightMean +" день");
    //Задание 5
        int Mascha=(67760*10)/100;
        int Denis=(83690*10)/100;
        int Kristina=(76230*10)/100;
        int Mascha1=Mascha+67760;
        int Denis1=Denis+83690;
        int Kristina1=Kristina+76230;
        int annualIncomeBeforeIncreaseMascha=67760*12;
        int annualIncomeBeforeIncreaseDenis=83690*12;
        int annualIncomeBeforeIncreaseKristina=76230*12;
        int annualIncomeAfterPromotionMascha= (Mascha+67760)*12;
        int annualIncomeAfterPromotionDenis=(Denis+83690)*12;
        int annualIncomeAfterPromotionKristina=(Kristina+76230)*12;
        int differenceAfterIncreaseMascha=annualIncomeAfterPromotionMascha-annualIncomeBeforeIncreaseMascha;
        int differenceAfterIncreaseDenis=annualIncomeAfterPromotionDenis-annualIncomeBeforeIncreaseDenis;
        int differenceAfterIncreaseKristina=annualIncomeAfterPromotionKristina-annualIncomeBeforeIncreaseKristina;
        System.out.println("Задача №5:");
        System.out.println("Маша теперь получает " + Mascha1 +" рублей");
        System.out.println("Годовой доход вырос на " + differenceAfterIncreaseMascha +" рублей");
        System.out.println("Денис теперь получает " + Denis1 +" рублей");
        System.out.println("Годовой доход вырос на " + differenceAfterIncreaseDenis +" рублей");
        System.out.println("Кристина теперь получает " + Kristina1 +" рублей");
        System.out.println("Годовой доход вырос на " + differenceAfterIncreaseKristina +" рублей");




    }
}