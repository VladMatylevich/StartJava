class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Задание (1)-Вывод характеристик компьютера:");
        byte core = 3;
        short ram = 16;
        int dickC = 930;
        long internet = 100;
        float frequencyAmd = 3.5f;
        double assemblyOc = 19045.2604;
        char dick = 'C';
        boolean windowsPro = true;
        System.out.println("\n Характеристики компьютера - " + "core:" + core + ";" + "RAM:" + ram + ";" + "dickC:"
                + dickC + ";" + "internet:" + internet + ";");
        System.out.println("\n frequencyAMD:" + frequencyAmd + ";" + "assemblyOC:" + assemblyOc + ";" +
                "dick:" + dick + ";" + "Windows10Pro:" + windowsPro + ".");

        System.out.println();
        System.out.println("Задание (2)-Расчет стоимости товара со скидкой:");
        int priceBook = 200;
        int pricePen = 100;
        int sum = priceBook + pricePen;
        int discount = sum / 100 * 11;
        int discountPrice = sum - discount;
        System.out.println("Общая стоимость товаров без скидки :" + sum + "рублей");
        System.out.println("Сумма скидки(руб.):" + discount);
        System.out.println("Общая стоимость товаров со скидкой(руб.):" + discountPrice);

        System.out.println();

        System.out.println("Задание (3)-Вывод слова JAVA:");
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        System.out.println();

        System.out.println("Задание (4)-Вывод min и max значений целых числовых типов:");
        byte maxSum = 127;
        byte maxByte  = 127;
        maxByte++;
        System.out.println(maxSum);
        System.out.println(maxByte);
        maxByte--;
        System.out.println(maxByte);

        System.out.println();

        short newMaxSumShort = 32767;
        short maxShort = 32767;
        maxShort++;
        System.out.println(newMaxSumShort);
        System.out.println(maxShort);
        maxShort--;
        System.out.println(maxShort);

        System.out.println();

        int newMaxSumInt = 2_147_483_647;
        int maxInt  = 2_147_483_647;
        maxInt++;
        System.out.println(newMaxSumInt);
        System.out.println(maxInt);
        maxInt--;
        System.out.println(maxInt);

        System.out.println();

        long maxSumLong = 9_223_372_036_854_775_807L;
        long maxLong  = 9_223_372_036_854_775_807L;
        maxLong++;
        System.out.println(maxSumLong);
        System.out.println(maxLong);
        maxLong--;
        System.out.println(maxLong);

        System.out.println();

        System.out.println("Задание (5)-Перестановка значений переменных:");
        System.out.println("Вариант 1)С помощью 3 переменной:");
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("исходные значения переменных:" + a + "/" + b);
        a = b;
        b = c;
        System.out.println("новые значения переменных:" + a + "/" + b);

        System.out.println();

        System.out.println("Вариант 2)С помощью арифметических операций:");
        System.out.println("исходные значения переменных:" + a + "/" + b);
        a += b;
        b -= a;
        a -= b;
        System.out.println("новые значения переменных:" + a + "/" + b);

        System.out.println();

        System.out.println("Вариант 3) помощью побитовой операции ^:");

        System.out.println("исходные значения переменных:" + b + "/" + c);
        b ^= c;
        c ^= b;
        b ^= c;
        System.out.println("новые значения переменных:" + b + "/" + c);

        System.out.println();

        System.out.println("Задание (6)-Вывод символов и их кодов:");
        char numberOne = '#';
        System.out.println("char код и символ кода" + " = " + numberOne);
        char amperSand = '&';
        System.out.println("char код и символ кода" + " = " + amperSand);
        char atSign = '@';
        System.out.println("char код и символ кода" + " = " + atSign);
        char circumFlex = '^';
        System.out.println("char код и символ кода" + " = " + circumFlex);
        char underscore = '_';
        System.out.println("char код и символ кода" + " = " + underscore);

        System.out.println();

        System.out.println("Задание (7)-Вывод в консоль ASCII-арт Дюка:");
        char slash = '/';
        char backslash = '\\';
        underscore = '_';
        char leftparenthesis = '(';
        char rightparenthesis = ')';
        System.out.println("    " + slash +  "" + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println( "  " +  slash +  underscore  + leftparenthesis  + " " +
                rightparenthesis +  "" + backslash);
        System.out.println(" "+ slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore+ underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println();

        System.out.println("Задание (8)-Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int units = (num / 1) % 10;
        int tens = (num / 10) % 10;
        int hundred = (num / 100);
        int newSum = units+ tens + hundred;
        int multiplication = units * tens * hundred;
        System.out.println("Число num содержит :" + num);
        System.out.println("Едениц :" + units);
        System.out.println("Десятков :" + tens);
        System.out.println("Сотен :" + hundred);
        System.out.println("Сумма чисел :" + newSum);
        System.out.println("Произведение чисел :" + multiplication);

        System.out.println();

        System.out.println("Задание (9)-Вывод времени");
        int totalSec = 86399;
        int hh = totalSec / 3600;
        int mm = totalSec / 60 % 60;
        int ss = totalSec % 60;
        System.out.println(hh + ":" + mm + ":" + ss);

    }
}

