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
        System.out.println("Характеристики компьютера-" + "core:" + core + ";" + "RAM:" + ram + ";" + "dickC:"
                + dickC + ";" + "internet:" + internet + ";");
        System.out.println("frequencyAMD:" + frequencyAmd + ";" + "assemblyOC:" + assemblyOc + ";" +
                "dick:" + dick + ";" + "Windows10Pro:" + windowsPro + ".");

        System.out.println("");

        System.out.println("Задание (2)-Расчет стоимости товара со скидкой:");
        int priceBook = 200;
        int pricePen = 100;
        int sum = priceBook + pricePen;
        int discount = sum / 100 * 11;
        int discountPrice = sum - discount;
        System.out.println("Общая стоимость товаров без скидки(руб.):" + sum);
        System.out.println("Сумма скидки(руб.):" + discount);
        System.out.println("Общая стоимость товаров со скидкой(руб.):" + discountPrice);

        System.out.println("");

        System.out.println("Задание (3)-Вывод слова JAVA:");
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        System.out.println("");

        System.out.println("Задание (4)-Вывод min и max значений целых числовых типов:");
        byte number = 127;
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        System.out.println("");

        short number1 = 32767;
        number1++;
        System.out.println(number1);
        number1--;
        System.out.println(number1);

        System.out.println("");

        int number2 = 2_147_483_647;
        number2++;
        System.out.println(number2);
        number2--;
        System.out.println(number2);

        System.out.println("");

        long number3 = 9_223_372_036_854_775_807L;
        number3++;
        System.out.println(number3);
        number3--;
        System.out.println(number3);

        System.out.println("");

        System.out.println("Задание (5)-Перестановка значений переменных:");
        System.out.println("Вариант 1)С помощью 3 переменной:");
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("исходные значения переменных:" + a + "/" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("новые значения переменных:" + a + "/" + b);

        System.out.println("");

        System.out.println("Вариант 2)С помощью арифметических операций:");
        a = 2;
        b = 5;
        System.out.println("исходные значения переменных:" + a + "/" + b);
        a += b;
        b -= a;
        a -= b;
        System.out.println("новые значения переменных:" + a + "/" + b);

        System.out.println("");

        System.out.println("Вариант 3) помощью побитовой операции ^:");
        b = 2;
        c = 5;
        System.out.println("исходные значения переменных:" + b + "/" + c);
        b ^= c;
        c ^= b;
        b ^= c;
        System.out.println("новые значения переменных:" + b + "/" + c);

        System.out.println("");

        System.out.println("Задание (6)-Вывод символов и их кодов:");
        char numberOne = '#';
        System.out.println("char код и символ кода" + " = " + numberOne);
        char ampersand = '&';
        System.out.println("char код и символ кода" + " = " + ampersand);
        char atsign = '@';
        System.out.println("char код и символ кода" + " = " + atsign);
        char circumflex = '^';
        System.out.println("char код и символ кода" + " = " + circumflex);
        char underscorenum = '_';
        System.out.println("char код и символ кода" + " = " + underscorenum);

        System.out.println("");

        System.out.println("Задание (7)-Вывод в консоль ASCII-арт Дюка:");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftparenthesis = '(';
        char rightparenthesis = ')';
        System.out.println("   " + slash + "" + backslash);
        System.out.println("  " + slash + "  " + backslash);
        System.out.println( " " +  slash +  underscore  + leftparenthesis  + " " + rightparenthesis + "" + backslash);
        System.out.println(""+ slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore +backslash );

        System.out.println("");

        System.out.println("Задание (8)-Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int one = 1;
        int two = 2;
        int three = 3;
        int unit = 123 % 10;
        int tens = 123 % 100 / 10;
        int hundred = 123 % 1000 / 10;
        int sum1 = unit + tens + hundred;
        int sum2 = one + two + three;
        int result = 1 * 2 * 3;
        System.out.println("Число num содержит:" + num);
        System.out.println("десятков:" + tens);
        System.out.println("Сотен:" + hundred);
        System.out.println("единиц:" + unit);
        System.out.println("Сумма его значений:" + sum1);
        System.out.println("Сумма его цифр:" + sum2);
        System.out.println("Произведение:" + result);

        System.out.println("");

        System.out.println("Задание (9)-Вывод времени");
        int seconds = 86399;
        int minutes = seconds / 60;
        int sec2 = seconds % 60;
        int watch = minutes / 60;
        int min2 = minutes % 60;
        System.out.println(watch + ":" + min2 + ":" + sec2);

    }
}
