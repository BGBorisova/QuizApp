package com.example.quizapp.data

import android.text.style.QuoteSpan

class QuestionGenerator {

    fun getFirstModuleQuestions() = listOf(
        Question(
            id = 1,
            "Десетичният запис на числото 10011011 е:Десетичният запис на числото 10011011 е:",
            listOf(
                Answer(1, "155", true),
                Answer(2, "156", false),
                Answer(3, "911", false),
                Answer(4, "103", false)
            )
        ),
        Question(
            id = 1, "Двоичният запис на числото 62 е:", listOf(
                Answer(1, "100001", false),
                Answer(2, "10001010 ", false),
                Answer(3, "111110", true),
                Answer(4, "10001000", false)
            )
        ),
        Question(
            id = 1, "Сборът на числата 1101 и 101 e:", listOf(
                Answer(1, "1001", false),
                Answer(2, "10001", false),
                Answer(3, "1010", false),
                Answer(4, "10010", true)
            )
        ),
        Question(
            id = 1, "Коя от следните дейности е пример за събиране на информация?", listOf(
                Answer(1, "Проверка на показанията на водомера ", true),
                Answer(
                    2,
                    "Изчисляване на стойността на потреблението на вода на база на показанията от водомера",
                    false
                ),
                Answer(
                    3,
                    "Въвеждане на показанията от водомера в информационната система на водоснабдителното дружество",
                    false
                ),
                Answer(
                    4,
                    "Изпращане на фактура до клиента, съдържаща информация за потреблението на вода и неговата стойност",
                    false
                )
            )
        ),
        Question(
            id = 1,
            "Посочете вярното твърдение, отнасящо се до циклични алгоритми с предусловие.",
            listOf(
                Answer(
                    1,
                    "Условието се състои от всички действия, които трябва да се изпълнят преди цикъла. ",
                    false
                ),
                Answer(2, "Цикличният процес може да не се изпълни нито веднъж.", true),
                Answer(3, "Цикличният процес задължително ще се изпълни поне два пъти.", false),
                Answer(4, "Всички повтарящи се действия трябва да предшестват условието.", false)
            )
        ),
        Question(
            id = 1,
            "На която и позиция да е написан даден символ той винаги има една и съща стойност. Това твърдение се отнася за:",
            listOf(
                Answer(1, "Не се отнася за бройни системи.", false),
                Answer(2, "И двата вида бройни системи.", false),
                Answer(3, "Непозиционните бройни системи.", true),
                Answer(4, "Позиционните бройни системи.", false)
            )
        ),
        Question(
            id = 1,
            "Посочи кой е верният отговор след извършване на аритметичната операция: 100(2) х 10(2)",
            listOf(
                Answer(1, "1000 (2)", true),
                Answer(2, "100000 (2)", false),
                Answer(3, "10000(2)", false),
                Answer(4, "100(2)", false)
            )
        ),
        Question(
            id = 1, "Посочи начините за описание на алгоритмите:", listOf(
                Answer(1, "словесно", true),
                Answer(2, "чрез езици за програмиране ", true),
                Answer(3, "чрез блок-схеми", true),
                Answer(4, "чрез жестове", false)
            )
        ),
        Question(
            id = 1,
            "Ако в един алгоритъм едно или повече действия се повтарят, той се нарича:",
            listOf(
                Answer(1, "Линеен", true),
                Answer(2, "Последователен", true),
                Answer(3, "Цикличен", true),
                Answer(4, "Повтарящ ", false)
            )
        ),
        Question(
            id = 1, "Кое НЕ е свойство на алгоритмите?", listOf(
                Answer(1, "Дискретност", false),
                Answer(2, "Формалност", false),
                Answer(3, "Резултатност ", false),
                Answer(4, "Съгласуваност ", true)
            )
        ),
        Question(
            id = 1, "Итерация е:", listOf(
                Answer(1, "Едно преминаване през цикъла", true),
                Answer(2, "Някои оператори от цикъла", false),
                Answer(3, "Всички преминавания през цикъла ", false),
                Answer(4, "Оператори извън цикъла ", false)
            )
        ),
        Question(
            id = 1, "За кои алгоритми е характерно свойството крайност?", listOf(
                Answer(1, "Всичките", true),
                Answer(2, "Разклонените", false),
                Answer(3, "Цикличните", false),
                Answer(4, "Линейните ", false)
            )
        ),
        Question(
            id = 1, "Рекурсивните алгоритми са вид:", listOf(
                Answer(1, "Циклични алгоритми без разклонение", false),
                Answer(2, "Линейни алгоритми", false),
                Answer(3, "Разклонени алгоритми без цикъл", false),
                Answer(4, "Циклични алгоритми ", true)
            )
        ),
        Question(
            id = 1, "Кои са двата стила на програмиране?", listOf(
                Answer(1, "Императивен", true),
                Answer(2, "Декларативен ", true),
                Answer(3, "Транзитивен ", false),
                Answer(4, "Интерпретивен", false)
            )
        ),
        Question(
            id = 1, "Кои от изброените термини са видове транслатори?", listOf(
                Answer(1, "Компилатор", true),
                Answer(2, "Итератор ", false),
                Answer(3, "Интерпретатор ", true),
                Answer(4, "Модератор", false)
            )
        ),
        Question(
            id = 1,
            "Как се нарича правило в език за програмиране, което показва какво означава дадено действие и как компютърът го разбира?",
            listOf(
                Answer(1, "Семантично", true),
                Answer(2, "Компилиращо ", false),
                Answer(3, "Синтактично ", false),
                Answer(4, "Транслиращо", false)
            )
        ),
        Question(
            id = 1,
            "Как се нарича процесът на превеждане на програмата от език за програмиране на машинен език?",
            listOf(
                Answer(1, "Транслатор", false),
                Answer(2, "Превод", false),
                Answer(3, "Транспортиране  ", false),
                Answer(4, "Транслиране ", true)
            )
        ),
        Question(
            id = 1, "Посочи десетичния запис на двоичното число 10111:", listOf(
                Answer(1, "25", false),
                Answer(2, "24", false),
                Answer(3, "22", false),
                Answer(4, "23", true)
            )
        ),
        Question(
            id = 1, "Кое е най-голямото число, което може да запише с осем двоични цифри?", listOf(
                Answer(1, "8", false),
                Answer(2, "15", false),
                Answer(3, "225", true),
                Answer(4, "63", false)
            )
        ),
        Question(
            id = 1,
            "При преобразуване на числа от осмична в двоична БС всяка цифра от осмичната БС (без първата) се представя в три позиции. Кои твърдения са верни?",
            listOf(
                Answer(
                    1,
                    "Ако цифрата в осмична БС е по-малка от 2, се добавят две водещи нули",
                    true
                ),
                Answer(2, "Само при цифрата 4 не се добавят водещи нули", false),
                Answer(
                    3,
                    "Ако цифрата в осмична БС е по-голяма или равна на 3, се добавят две водещи нули",
                    false
                ),
                Answer(
                    4,
                    "Ако цифрата в осмична БС е по-голяма от 3, не се добавят водещи нули",
                    true
                )
            )
        ),

        )

    fun getSecondModuleQuestions() = listOf(
        Question(
            id = 2, "Интегрирана среда за програмиране IDE (integrated development environment) е:",
            listOf(
                Answer(1, "Набор от библиотеки", false),
                Answer(
                    2,
                    "Софтуерно приложение, което предоставя цялостна среда за разработване на софтуер",
                    true
                ),
                Answer(3, "Текстов редактор", false),
                Answer(4, "Графичен редактор", false)
            )
        ),
        Question(
            id = 2, "Java виртуалната машина (Java Virtual Machine) е:", listOf(
                Answer(1, "Интегрирана среда за програмиране", false),
                Answer(2, "Набор от библиотеки, събрани в машина", false),
                Answer(
                    3,
                    "Софтуер, който позволява на компютъра да стартира Java програмата",
                    true
                ),
                Answer(4, "Машина за създаване на програми", false)
            )
        ),
        Question(
            id = 2, "Посочи елементите на IDE:", listOf(
                Answer(1, "Дебъгер (Debugger)", true),
                Answer(2, "Набор от папки", false),
                Answer(3, "Компилатор", true),
                Answer(4, "Директория", false)
            )
        ),
        Question(
            id = 2, "Посочи средите за програмиране:", listOf(
                Answer(1, "IntelliJ IDEA", true),
                Answer(2, "Eclipse", true),
                Answer(3, "Oracle", false),
                Answer(4, "Visual Studio", true)
            )
        ),
        Question(
            id = 2, "Case Sensitive е:", listOf(
                Answer(1, "Меню на средата за програмиране", false),
                Answer(2, "Помощен модул на езика C#", false),
                Answer(3, "Характеристика на група езици", true),
                Answer(4, "Правило за параметрите на C#o", false)
            )
        ),
        Question(
            id = 2, "Какъв тип грешки може да \"хване\" транслаторът?",
            listOf(
                Answer(1, "Синтактични", true),
                Answer(2, "Изпълнителски", false),
                Answer(3, "Логически", false),
                Answer(4, "И трите вида", false)

            )
        ),
        Question(
            id = 2, "Библиотеките – ", listOf(
                Answer(1, "Съдържат код, изпозлван често в процеса на програмиране", true),
                Answer(2, "Текстов интерфейс за стартиране на програмите", false),
                Answer(
                    3,
                    "Помагат да се проследи изпълнението на кода, като се откриват и отстраняват грешки",
                    false
                ),
                Answer(4, "Преобразуват изходния код до обектен", false)

            )
        ),
        Question(
            id = 2,
            "Как се нарича програмно средство, което има за цел да свърже в изпълнима програма един или повече компилирани обектни файла?",
            listOf(
                Answer(1, "Компилатор", false),
                Answer(2, "Свързващ редактор", true),
                Answer(3, "Дебъгер", false),
                Answer(4, "Нито едно от изброените", false),
            )
        ),
        Question(
            id = 2, "Кои елементи са част от IDE Visual Studio 2017 Community за езика C#?", listOf(
                Answer(1, "Свързващ редактор", true),
                Answer(2, "Файлов редактор", false),
                Answer(3, "Графичен редактор", false),
                Answer(4, "Текстов редактор", true)
            )
        ),
        Question(
            id = 2, "IntelliSense е:", listOf(
                Answer(1, "Основно меню във Visual Studio 2017 Community", false),
                Answer(2, "Команда за инсталиране на Visual Studio 2017 Community", false),
                Answer(3, "Помощна система във Visual Studio 2017 Community", true),
                Answer(4, "Помощно меню във Visual Studio 2017 Community", false)
            )
        ),
        Question(
            id = 2,
            "В процеса на преобразуване на програмата се преминава междинен код. Как се нарича още този междинен код?",
            listOf(
                Answer(1, "Компютърен", false),
                Answer(2, "Машинен", false),
                Answer(3, "Сорс-код", false),
                Answer(4, "Асемблерен", true)
            )
        ),
        Question(
            id = 2,
            "Посочи коя от изброените дейности е част от етапа на проектиране на компютърна програма:",
            listOf(
                Answer(1, "Определяне на входните данни", false),
                Answer(2, "Писане на кода на програмата", false),
                Answer(
                    3,
                    "Определяне под каква форма да бъде представена програмата на потребителя",
                    false
                ),
                Answer(4, "Създаване на математически модел на задачата", true)
            )
        ),
        Question(
            id = 2,
            "Как се нарича виртуална среда, която подпомага програмистите и при създаване на програми, и при откриването и отстраняването на грешки в тях?",
            listOf(
                Answer(1, "Машина за създаване на програми", false),
                Answer(2, "Интерфейс за стартиране на програми", false),
                Answer(3, "Виртуална машина", false),
                Answer(4, "Интегрирана среда за програмиране", true)
            )
        ),
        Question(
            id = 2,
            "От кой етап за създаване и тестване на компютърна програма е определянето на входните и изходните данни?",
            listOf(
                Answer(1, "Проектиране", false),
                Answer(2, "Анализ", true),
                Answer(3, "Тестване ", false),
                Answer(4, "Реализация", false)
            )
        ),
        Question(
            id = 2,
            "Алгоритъм за решаване на задачата в етап на проектиране на компютърна програма можеш да опишеш с:",
            listOf(
                Answer(1, "Описание чрез блок-схема", false),
                Answer(2, "Всички изброени", true),
                Answer(3, "Описание чрез мисловна карта ", false),
                Answer(4, "Словесно описание", false)
            )
        ),
        Question(
            id = 2,
            "Посочи дейностите, които се извършват по време на проектирането на компютърна програма: ",
            listOf(
                Answer(
                    1,
                    "Определяне под каква форма да бъде представена програмата на потребителя",
                    false
                ),
                Answer(2, "Разработване на алгоритъм за решаване на задачата", true),
                Answer(3, "Създаване на дизайн на графичния потребителски интерфейс", true),
                Answer(4, "Създаване на математически модел на задачата", true)
            )
        ),
        Question(
            id = 2, "Грешки при програмиране допускат:", listOf(
                Answer(1, "Само програмистите с опит, защото пишат големи програми", false),
                Answer(2, "Само начинаещите програмисти, защото нямат опит", false),
                Answer(3, "Само програмистите, които се занимават с QA (Quality Assurance)", false),
                Answer(4, "Всички изброени", true)
            )
        ),
        Question(
            id = 2, "Посочи основната компонента на графичния потребителски интерфейс:", listOf(
                Answer(1, "Форма", true),
                Answer(2, "Текстово поле", false),
                Answer(3, "Бутон", false),
                Answer(4, "Етикет", false)
            )
        ),
        Question(
            id = 2, "Как още се нарича графичната компонента в Java?", listOf(
                Answer(1, "Инструмент", false),
                Answer(2, "Контрола", true),
                Answer(3, "Графичен примитив", false),
                Answer(4, "Контейнер ", false)
            )
        ),
        Question(
            id = 2,
            "За смяна на надписа на бутон трябва да промениш стойността на свойството му text. Откъде можеш да видиш и промениш тази стойност?",
            listOf(
                Answer(1, "От прозореца Settings", false),
                Answer(2, "От прозореца Properties", true),
                Answer(3, "От прозореца Solution Explorer", false),
                Answer(4, "От прозoреца Toolbox ", false)
            )
        )
    )

    fun getThirdModuleQuestions() = listOf(
        Question(
            id = 3, "Кои от изброените езици за програмиране са типизирани?", listOf(
                Answer(1, "C#", true),
                Answer(2, "Java", true),
                Answer(3, "JavaScript", false),
                Answer(4, "Python", false)
            )
        ),
        Question(
            id = 3, "Int, string и char са примери за:", listOf(
                Answer(1, "Имена на променливи", false),
                Answer(2, "Имена на константи", false),
                Answer(3, "Специални идентификатори", false),
                Answer(4, "Типове данни", true)
            )
        ),
        Question(
            id = 3, "Типът данни винаги определя:", listOf(
                Answer(1, "Как да се именуват променливи и константи", false),
                Answer(2, "Допустимите операции", true),
                Answer(3, "Множеството от допустими стойности", true),
                Answer(4, "Колко памет да се отдели за дадена компонента", true)
            )
        ),
        Question(
            id = 3, "Посочи верния запис при използване на тип char:", listOf(
                Answer(1, "char myLetter=’C’", false),
                Answer(2, "char myLetter=’C’;", true),
                Answer(3, "char myLetter=’ABC’;", false),
                Answer(4, "char myLetter= A;", false)
            )
        ),
        Question(
            id = 3, "Коя от изброените команди се използва в език за програмиране C#?", listOf(
                Answer(1, "console.log(\"Hello World!\");", false),
                Answer(2, "System.out.println(\"Hello World!\");", false),
                Answer(3, "print(\"Hello World!\")", false),
                Answer(4, "Console.Writeline(\"Hello World!\");", true)
            )
        ),
        Question(
            id = 3, "Каква е крaйната стойност на променливата name в следния пример:\n" +
                    "String name = \"Ani\";\n" +
                    "name = \"\";\n", listOf(
                Answer(1, "0", true),
                Answer(2, "Празен стринг", true),
                Answer(3, "Няма никаква стойност", false),
                Answer(4, "Ani", false)
            )
        ),
        Question(
            id = 3, "В кои изрази променливата A има стойност 2?", listOf(
                Answer(1, "A = 17%5;", true),
                Answer(2, "A = 2/2;", false),
                Answer(3, "A = 21%10;", false),
                Answer(4, "A = 11/4;", true)
            )
        ),
        Question(
            id = 3,
            "При стойност c=5; кои изрази след извършване на означените действия имат стойност 6?",
            listOf(
                Answer(1, "c+=1;", true),
                Answer(2, "c=c+11/2;", false),
                Answer(3, "++c", true),
                Answer(4, "c*=1;", false)
            )
        ),
        Question(
            id = 3,
            "Каква ще е стойността на променливата c след извършване на означеното действие?\n" +
                    "int a = 15, b = 4, c;\n" +
                    "c = a/b;\n",
            listOf(
                Answer(1, "3.75", false),
                Answer(2, "2", false),
                Answer(3, "3", true),
                Answer(4, "4", false)
            )
        ),
        Question(
            id = 3, "Кое е най-малкото число, което е в диапазона на ushort?", listOf(
                Answer(1, "1", false),
                Answer(2, "0", true),
                Answer(3, "-128 ", false),
                Answer(4, "-32 768 ", false)
            )
        ),
        Question(
            id = 3, "Кои от изброените типове са реални?", listOf(
                Answer(1, "String", false),
                Answer(2, "Float", true),
                Answer(3, "Double", true),
                Answer(4, "Byte", false)
            )
        ),
        Question(
            id = 3,
            "Кои от изброените реални числа са записани правилно според правилата в език за програмиране Java?",
            listOf(
                Answer(1, "1,586F", false),
                Answer(2, ".548", true),
                Answer(3, "35.73f", true),
                Answer(4, "0.425458e+2d", true)
            )
        ),
        Question(
            id = 3, "Кои са операндите в следния програмен ред:\n" +
                    "int a = 5/2;\n?", listOf(
                Answer(1, "5 и 2", true),
                Answer(2, "a, = и /", false),
                Answer(3, "a и 2", false),
                Answer(4, "= и /", false)
            )
        ),
        Question(
            id = 3,
            "Каква ще бъде стойността на променливата c след изпълнение на следния програмен фрагмент:\n" +
                    "int a = 3, b = 5, c = 4;\n" +
                    "c -= a%b;\n?",
            listOf(
                Answer(1, "4", false),
                Answer(2, "-1", false),
                Answer(3, "1", true),
                Answer(4, "3.4", false)
            )
        ),
        Question(
            id = 3, "В кои изрази А е отрицателно число?", listOf(
                Answer(1, "А=Math.Round(-0.062);", false),
                Answer(2, "А=Math.Floor(-0.062);", true),
                Answer(3, "А=Math.Pow(-0.62, 3);", true),
                Answer(4, "А=Math.Ceiling(-0.62);", false)
            )
        ),
        Question(
            id = 3, "Променливи са декларирани по следния начин:\n" +
                    "float price;\n" +
                    "string s=\"26.18\";\n" +
                    "Кои програмни кодове са написани НЕПРАВИЛНО?\n", listOf(
                Answer(1, "price = Convert.ToFloat (s);", true),
                Answer(2, "price = float.Parse (s);", false),
                Answer(3, "price = float.ToParse (s);", true),
                Answer(4, "price = Convert.ToDouble (s);", false)
            )
        ),
        Question(
            id = 3,
            "Какво е предназначението на вградената математическа функция Math.pow(x, y)?",
            listOf(
                Answer(1, "Пресмята абсолютна стойност на x и y", false),
                Answer(
                    2,
                    "Пресмята стойността на числото в първия аргумент, повдигнато на степен числото във втория аргумент",
                    true
                ),
                Answer(3, "Пресмята най-голямото цяло число, което не надвишава x", false),
                Answer(4, "Пресмята най-близкото цяло число, по-голямо или равно на x и y", false)
            )
        ),
        Question(
            id = 3, "За деклариране на константа преди типа се добавя думата:", listOf(
                Answer(1, "const ", true),
                Answer(2, "Const ", false),
                Answer(3, "final ", false),
                Answer(4, "finaly ", false)
            )
        ),
        Question(
            id = 3,
            "Средното разстояние от Земята до Марс е 550475390 км. В програма на C# или Java трябва да обработваш това разстояние в метри. Какъв тип декларация може да използваш?",
            listOf(
                Answer(1, "long", true),
                Answer(2, "short", false),
                Answer(3, "int", false),
                Answer(4, "int и/или long", false)
            )
        ),
        Question(
            id = 3,
            "В какъв тип ще се конвертират променливите a и b след изпълнение на следния програмен фрагмент?\n" +
                    "double a = 8.5;\n" +
                    "double b = 5.5;\n" +
                    "int c = (int)a + (int)b;\n",
            listOf(
                Answer(1, "double ", false),
                Answer(2, "int", true),
                Answer(3, "long", false),
                Answer(
                    4,
                    "Действието не може да бъде извършено, защото типовете са несъвместими",
                    false
                )
            )
        ),
    )
//
//    fun getFourthModuleQuestions()= listOf(
//        Question(
//            id=4,
//        )
//    )
//
//    fun getFifthModuleQuestions()= listOf(
//        Question(
//            id=5,
//        )
//    )
}