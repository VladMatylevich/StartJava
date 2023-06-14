class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("Задание (1)-Вывод характеристик компьютера:");
        byte core = 3; // ядро
        short ram = 16; // оперативная
        int dickC = 930;// диск С
        long internet = 100;// интернет
        float frequencyAMD = 3.5f;//частота
        double assemblyOC = 19045.2604;//сборка
        char dick = 'C';
        boolean Windows10Pro = true;
        System.out.println("Характеристики компьютера-" + "core:" + core + ";" + "RAM:" + ram + ";" + "dickC:" + dickC + ";" + "internet:" + internet + ";");
        System.out.println("frequencyAMD:" + frequencyAMD + ";" + "assemblyOC:" + assemblyOC + ";" + "dick:" + dick + ";" + "Windows10Pro:" + Windows10Pro + ".");

        System.out.println("Задание (2)-Расчет стоимости товара со скидкой:");
        int book = 200;
        int pen = 100;
        int sum = book + pen;
        int discount = sum * 11 / 100;
        int result = sum - discount;
        System.out.println("Общая стоимость товаров без скидки(руб.):" + sum);
        System.out.println("Сумма скидки(руб.):" + discount);
        System.out.println("Общая стоимость товаров со скидкой(руб.):" + result);

        System.out.println("Задание (3)-Вывод слова JAVA:");
        System.out.println(" J a v v a");
        System.out.println(" J a a v v a a");
        System.out.println("J J aaaaa V V aaaaa");
        System.out.println(" JJ a a V a a");

        System.out.println("Задание (4)-Вывод min и max значений целых числовых типов:");
        byte positive = 127;
        byte ink = positive++;
        byte dek = positive--;
        byte negative = -128;
        byte ink1 = negative++;
        byte dek1 = negative--;

        short positive1 = 32767;
        short ink3 = positive1++;
        short dek3 = positive1--;
        short negative1 = -32768;
        short ink4 = negative1++;
        short dek4 = negative1--;

        int positive2 = 2_147_483_647;
        int ink5 = positive2++;
        int dek5 = positive2--;
        int negative2 = -2_147_483_648;
        int ink6 = negative2++;
        int dek6 = negative2--;
        long positive3 = 9_223_372_036_854_775_807L;
        long ink7 = positive3++;
        long dek7 = positive3--;
        long negative3 = -9_223_372_036_854_775_808L;
        long ink8 = negative3++;
        long dek8 = negative--;
        System.out.println("byte:" + negative + "/" + positive + ";");
        System.out.println("byte positive:" + ink + "/" + dek);
        System.out.println("byte negative:" + ink1 + "/" + dek1);
        System.out.println("short:" + negative1 + "/" + positive1 + ";");
        System.out.println("short positive1:" + ink3 + "/" + dek3);
        System.out.println("short negative1:" + ink4 + "/" + dek4);
        System.out.println("int:" + negative2 + "/" + positive2 + ";");
        System.out.println("int positive:" + ink5 + "/" + dek5);
        System.out.println("int negative:" + ink6 + "/" + dek6);
        System.out.println("long:" + negative3 + "/" + positive3 + ";");
        System.out.println("long positive3:" + ink7 + "/" + dek7);
        System.out.println("long negative3:" + ink8 + "/" + dek8);

        System.out.println("Задание (5)-Перестановка значений переменных:");
        System.out.println("Вариант 1)С помощью 3 переменной:");
        int a = 2;
        int b = 5;
        int c = 0;
        System.out.println("исходные значения переменных:" + a + "/" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("новые значения переменных:" + a + "/" + b);

        System.out.println("Вариант 2)С помощью арифметических операций:");
        int num1 = 2;
        int num2 = 5;
        System.out.println("исходные значения переменных:" + num1 + "/" + num2);
        num1 += num2; // a1 = 7
        num2 -= num1; // b1 = 2
        num1-= num2; // a1 = 5
        System.out.println("новые значения переменных:" + num1 + "/" + num2);

        System.out.println("Вариант 3) помощью побитовой операции ^:");
        int num3 = 2;
        int num4 = 5;
        System.out.println("исходные значения переменных:" + num3 + "/" + num4);
        num3 ^= num4;
        num4 ^= num3;
        num3 ^= num4;
        System.out.println("новые значения переменных:" + num3 + "/" + num4);

        System.out.println("Задание (6)-Вывод символов и их кодов:");
        char signСH = '#';
        int cod = 35;
        char signCh1 = '&';
        int cod2 = 38;
        char singCh2 = '@';
        int cod3 = 64;
        char signCh3 = '^';
        int cod4 = 94;
        char signCh4 = '_';
        int cod5 = 95;
        System.out.println("char код и символ кода:" + cod + " = " + signСH);
        System.out.println("char код и символ кода:" + cod2 + " = " + signCh1);
        System.out.println("char код и символ кода:" + cod3 + " = " + singCh2);
        System.out.println("char код и символ кода:" + cod4 + " = " + signCh3);
        System.out.println("char код и символ кода:" + cod5 + " = " + signCh4);

        System.out.println("Задание (7)-Вывод в консоль ASCII-арт Дюка:");
        char character, getLetter, freqCPU, title, fulling;
        character = '/';
        getLetter = '\\';
        freqCPU = '_';
        title = '(';
        fulling = ')';
        System.out.println(" " + character + "" + getLetter);
        System.out.println(" " + character + " " + getLetter);
        System.out.println(" " + character + freqCPU + title + " " + fulling + "" + getLetter);
        System.out.println(" " + character + " " + getLetter);
        System.out.println(" " + character + freqCPU + freqCPU + freqCPU + freqCPU + character + getLetter + freqCPU + freqCPU + getLetter);

        System.out.println("Задание (8)-Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int aA = 1;
        int bB = 2;
        int cC = 3;
        int ten = 10;
        int hundred = 100;
        int numberOfTens = number / ten;
        int numberOfHundred = number / hundred;
        int numberOfUnits = number % ten + number % hundred;
        int sum1 = numberOfTens + numberOfHundred + numberOfUnits;
        int sum2 = aA + bB + cC;
        int result1 = aA - bB - cC;
        System.out.println("Число 123 содержит:");
        System.out.println("десятков:" + numberOfTens);
        System.out.println("Сотен:" + numberOfHundred);
        System.out.println("единиц:" + numberOfUnits);
        System.out.println("Сумма его значений:" + sum1);
        System.out.println("Сумма его цифр:" + sum2);
        System.out.println("Произведение:" + result1);

        System.out.println("Задание (9)-Вывод времени");
        int seconds = 86399;
        int minutes = seconds / 60;
        int sec2 = seconds % 60;
        int watch = minutes / 60;
        int min2 = minutes % 60;
        System.out.println(watch + ":" + min2 + ":" + sec2);

    }
}
