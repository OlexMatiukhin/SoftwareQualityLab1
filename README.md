1) Згідно google java style в одному файлі може міститись тільки один клас верхнього рівня, тому клас humanIMB має бути розташований в окремому файлі.

2) Відсутній пустий рядок після поля imb в класі humanIMB в вихідній версії файлу.

3) Відсутній пустий рядок після конструктора класу humanIMB. (рядок 17 файлу oldcodevariant\Main.java)

4) Відсутністній пустий рядок після геттера takeW в вихідній версії файлу. (рядок 20 файлу oldcodevariant\Main.java)

5) Відсутністній пустий рядок після сеттера putW в вихідній версії файлу. (рядок 24 файлу oldcodevariant\Main.java)

6) Відсутністній пустий рядок після геттера takeH в вихідній версії файлу. (рядок 27 файлу oldcodevariant\Main.java)

7) Відсутністній пустий рядок після сеттера putH. (рядок 31 файлу oldcodevariant\Main.java)

8) Відсутністній пустий рядок після takeImt перед функцією Result в вихідній версії файлу. (рядок 34 файлу oldcodevariant\Main.java)

Помилки 2 -6 базовані на правилі пункту 4 java google style:
"Між наступними один за одним членами або ініціалізаторами класу: полями, конструкторами,
методами, вкладеними класами, статичними та динамічними блоками ініціалізації.
виняток: порожній рядок між двома послідовними полями (без коду між ними) використовується опціонально.
При необхідності порожні рядки використовуються для логічного групування полів."

9) Назва класу має бути в camelСase з великої літери та основою назви має бути іменник.
 Початкова версія назви: humanIMB. Нова версія: HumanBodyMassIndex. (рядок 9 файлу oldcodevariant\Main.java)

10) Назва змінної W має бути в lower camelCase та основою назви має бути іменник.
Початкова версія назви:W. Нова версія: weight. (рядок 10 файлу oldcodevariant\Main.java)

11) Назва змінної H має бути в lower camelCase та основою назви має бути іменник. Початкова версія назви:H. Нова версія: height. (рядок 11 файлу oldcodevariant\Main.java)

13) Змінна imb має бути динамічною, оскільки у кожної людини свій індекс маси, тому модифіктор static має бути прибраний. (рядок 12 файлу oldcodevariant\Main.java)

14) Функція Result має бути динамічною, тому модифіктор static має бути прибраний. (рядок 35 файлу oldcodevariant\Main.java)

15) Змінна imb не має розраховуватись в конструкторі humanIMB, змінна imb має бути розраховна в гетеррі takeImt. (рядок 16 файлу oldcodevariant\Main.java)

16) Зміна imb не має розраховутватись в putW, змінна imb має розраховуватись динамічно в гетеррі takeImt. (рядок 23 файлу oldcodevariant\Main.java)

17) Змінна imb не має розраховуватись в putH, змінна imb має розраховуватись динамічно в  гетеррі takeImt. (рядок 30 файлу oldcodevariant\Main.java)

18) Назва конструктора humanIMB має бути в upper camelcase, і при цьому відповідати назві класу.
Початкова версія назви: humanIMB. Нова версія: HumanBodyMassIndex. (рядок 13 файлу oldcodevariant\Main.java)

19) Назва аргументів конструктора класу humanIMB має бути в lower camelcase і бути повною. Початкова версія назви аргументів:  w і h.
Пропоновані назви: weight, height. (рядок 13 файлу oldcodevariant\Main.java)

20) Назви локальних змінних всередені конструктора humanIMB мають бути в lower camelcase і бути повними.
Початкова версія назви: w, h. Пропоновані назви: weight, height. (рядки 14,15 файлу oldcodevariant\Main.java)

21) Функція takeW виконує функціонал геттеру, тому згідно гугл стайлу має бути у форматі: дієслово "get" + іменник у lowerCamelCase.
Початкова версія назви: takeW. Пропонована версія назви: getWeight. (рядок 18 файлу oldcodevariant\Main.java)

22) Функція putW виконує функціонал cеттера, тому згідно гугл стайлу має бути у форматі: дієслово "set" + іменник в lower CamelCase.
Початкова версія назви: putW. Пропонована версія назви: setWeight. (рядок 21 файлу oldcodevariant\Main.java).

23) Аргумент сеттера putW має бути в lower camelCase та основою назви має бути іменник. Початкова версія назви: w.
Пропонована версія назва: weight. (рядок 21 файлу oldcodevariant\Main.java).

24) Локальна зміна сеттера putW (w) має бути в lower camelCase та основою назви має бути іменник. Початкова версія назви: w.
Пропонована версія назва: weight. (рядок 22 файлу oldcodevariant\Main.java).

25) Функція takeH виконує функціонал геттеру, тому згідно гугл стайлу має бути у форматі: дієслово "get" + іменник у lower CamelCase.
Початкова версія назви: takeH. Пропонована версія назви: getHeight. (рядки 25 файлу oldcodevariant\Main.java)

26) Функція putH виконує функціонал cеттера, тому згідно гугл стайлу має бути у форматі: дієслово "set" + іменник в lower CamelCase.
Початкова версія назви: putH. Пропонована версія назви: setHeight. (рядок 28 файлу oldcodevariant\Main.java)

27) Аргумент сеттера putH має бути в lower camelCase та основою назви має бути іменник.
Початкова версія назви: h. Пропонована версія назва: heigh. (рядок 28 файлу oldcodevariant\Main.java).

28) Локальна зміна сеттера putH (h) має бути в lower camelCase та основою назви має бути іменник.
Початкова версія назви: h. Пропонована версія назва: heigh. (рядок 29 файлу oldcodevariant\Main.java).

29) Функція у коді має неправильну назву замість takeImt, спершу назва має бути takeImb і потім вже назва має бути у форматі: "get" + іменник.
Початкова версія назви: takeImt. Пропонована: getBodyMassIndex. (рядки 22 файлу oldcodevariant\Main.java)

30) В takeImt змінна imb має розраховуватись динамічно. (рядки 33 файлу oldcodevariant\Main.java)

31) Назвав функії Result має бути lowerCamelCase містити дієслово і бути інформативною. (рядки 35 файлу oldcodevariant\Main.java)

32) Змінна string функції Result є зайвою можна одразу робити return в елементах if, прибрати останній if і замість нього зробити return. (рядки 36 - 50  файлу oldcodevariant\Main.java).

33) Краще замінити 2 останніх if в функції Result на elif, і тоді прибрати пернос на наступний рядок згідно правил google java code style. (рядки 36 - 50  файлу oldcodevariant\Main.java).

