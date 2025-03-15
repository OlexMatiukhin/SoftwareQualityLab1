
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.\
/*
Між наступними один за одним членами або ініціалізаторами класу: полями, конструкторами,
методами, вкладеними класами, статичними та динамічними блоками ініціалізації.
виняток: порожній рядок між двома послідовними полями (без коду між ними) використовується опціонально.
При необхідності порожні рядки використовуються для логічного групування полів
Звідси маємо помилки:
Відсутність пустого рядка  після поля imb, змінене значення
Відсутність пустого рядка перед функцією Result
*/


// В одному файлі тільки один клас верхнього рівня тому клас humanIMB має бути в іншому файлі
public class Main {
    public static void main(String[] args) {
        humanIMB humanIMB = new humanIMB(80,1.52);

        System.out.println(humanIMB.Result());
    }
}

//Назва класу має бути в camel case з великої літери 
// Наіменування класу має бути повним
class humanIMB {
    //Назва змінної має бути в lower camelCase результат: weight
    public double W;
    //Назва змінної має бути в lower camelCase результат: height
    public double H;
    // Змінна не має бути статичною оскільки індекс у всіх людей буде свій і назва змінною повинна бути інформативною, тут певно мається на увазі indexMassBody, тоді певно краще виправити на indexBodyMass
    private static double imb;

    // Назва конструктора має бути в  lowercase і бути як і назва класу  в camel case з великої літери тому треба змінити її на HumanBodyMassIndex
    // Назва змінних має бути в lower case  і бути повною аргументи конструктора w h і відповідно назви локальних змінних має бути змінена на : weight, height, bodyMassIndex
    // Змінна imb має вираховуватись динамічно у геттері
    public humanIMB(double w, double h) {
        W = w;
        H = h;
        imb = W / (H * H);
    }

    // Данна функція виконує функціонал геттеру, тому згідно гугл стайлу має бути дієсловом з lowerCamelCase: getWeight
    public double takeW() {
        return W;
    }

    // Данна функція виконує функціонал cеттера, тому згідно гугл стайлу має бути дієсловом з lowerCamelCase: setWeight
    public void putW(double w) {
        W = w;
        imb = W / (H * H);
    }
    // Данна функція виконує функціонал геттеру, тому згідно гугл стайлу має містит дієслово get і іменнник у форматі lowerCamelCase: getHeight
    public double takeH() {
        return H;
    }
    // Данна функція виконує функціонал cеттера, тому згідно гугл стайлу має міститb дієслово set і іменник у форматі  lowerCamelCase: setHeight
    public void putH(double h) {
        H = h;
        imb = W / (H * H);
    }
    public static double takeImt() {
        return imb;
    }

    // Назва має бути дієсловом, або містити дієслово getResult
    public static String Result() {
        //Не правильна назва, назва має бути іменником.
        // Назва змінною має бути інформативною, тому тут має бути назва resultString.
        // Для рефакторінгу краще зробити elif замість if для оптимізації коду і тоді вони будуть без переносу.
        String  string = null;
        if (imb >=18.5 & imb <25) {
            string ="Norm";
        }
        if (imb >=25 & imb <30) {
            string ="Warning! ";
        }
        if (imb >=30) {
            string ="Fat";
        }
        if (imb <18.5) {
            string ="Deficit";
        }
        return string;
    }
}