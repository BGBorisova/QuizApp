package com.example.quizapp.data

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

    fun getFourthModuleQuestions() = listOf(
        Question(
            id = 4,
            "Кои от изброените понятия са конвениции за именуване на променливи и константи?",
            listOf(
                Answer(1, "camelNase ", false),
                Answer(2, "camelCase", true),
                Answer(3, "Bulgarian notation", false),
                Answer(4, "Hungarian notation", true)
            )
        ),
        Question(
            id = 4,
            "С кой от изброените префикси в език Java се означава контролата Label (етикет)?",
            listOf(
                Answer(1, "lbl", true),
                Answer(2, "lbn", false),
                Answer(3, "lbe", false),
                Answer(4, "lble", false)
            )
        ),
        Question(
            id = 4, "Пояснителните коментари в Java са два вида. Посочи кои са те.?", listOf(
                Answer(1, "Еднокомпонентни", false),
                Answer(2, "Многоредови", true),
                Answer(3, "Едноредови", true),
                Answer(4, "Многокомпонентни", false)
            )
        ),
        Question(
            id = 4,
            "Каква ще бъде вярната стойност на израза:\"Ти в момента решаваш тест по информатика.\"",
            listOf(
                Answer(1, "Посоченият израз не е съждителен ", false),
                Answer(2, "Нито едно от изброените", false),
                Answer(3, "False/лъжа", false),
                Answer(4, "True/истина", true)
            )
        ),
        Question(
            id = 4,
            "Дадени са ти две съждения: p = true и q = false.\n" +
                    "Коя от посочените логически операции в израза A = !p && q || !q; ще се извърши първа?\n",
            listOf(
                Answer(1, "|| ", false),
                Answer(2, "&& ", false),
                Answer(3, "!", true),
                Answer(4, "=", false)
            )
        ),
        Question(
            id = 4,
            "Кои от изброените понятия са конвениции за именуване на променливи и константи?",
            listOf(
                Answer(1, "camelNase ", false),
                Answer(2, "camelCase", true),
                Answer(3, "Bulgarian notation", false),
                Answer(4, "Hungarian notation", true)
            )
        ),
        Question(
            id = 4,
            "С коя служебна дума се декларират булеви (логически) константи и променливи в езика C#?",
            listOf(
                Answer(1, "logical ", false),
                Answer(2, "bool", false),
                Answer(3, "logic", false),
                Answer(4, "boolean", true)
            )
        ),
        Question(
            id = 4, "С кой знак се означава логическата операция дизюнкция в езика C#?", listOf(
                Answer(1, "&& ", false),
                Answer(2, "||", true),
                Answer(3, "Нито едно от изброените ", false),
                Answer(4, "!", false)
            )
        ),
        Question(
            id = 4, "Кои изрази имат стойност true?", listOf(
                Answer(1, "boolean a = true || !false; ", false),
                Answer(2, "boolean a = true && false;", false),
                Answer(3, "boolean a = !(true && false);", true),
                Answer(4, "boolean a = !true || false;", true)
            )
        ),
        Question(
            id = 4,
            "Kаква ще бъде стойността на променливата c след изпълнение на следния програмен фрагмент:\n" +
                    "int a = 3, b = 5;\n" +
                    "boolean c = (a != b) && !(a>b) && (a==b);\n",
            listOf(
                Answer(1, "camelNase ", false),
                Answer(2, "camelCase", true),
                Answer(3, "Bulgarian notation", false),
                Answer(4, "Hungarian notation", true)
            )
        ),
        Question(
            id = 4,
            "Кои от изброените понятия са конвениции за именуване на променливи и константи?",
            listOf(
                Answer(1, "Не може да се определи ", false),
                Answer(2, "c = 7 ", false),
                Answer(3, "True", false),
                Answer(4, "False", true)
            )
        ),
        Question(
            id = 4,
            "Кои са формите на условен оператор?", listOf(
                Answer(1, "Съкратена форма ", false),
                Answer(2, "Кратка форма", true),
                Answer(3, "Разширена форма", false),
                Answer(4, "Пълна форма", true)
            )
        ),
        Question(
            id = 4,
            "Кои са запазените ключови думи, използвани при пълната форма на условен оператор?",
            listOf(
                Answer(1, "if ", true),
                Answer(2, "then", false),
                Answer(3, "else", true),
                Answer(4, "ellse", false)
            )
        ),
        Question(
            id = 4,
            "Каква ще бъде стойността на променливата a след изпълнение на следния програмен фрагмент:\n" +
                    "int a = 3, b = 6;\n" +
                    "if (a != b )\n" +
                    "a = a + b;\n",
            listOf(
                Answer(1, "true ", false),
                Answer(2, "3", false),
                Answer(3, "6", false),
                Answer(4, "9", true)
            )
        ),
        Question(
            id = 4, "Какъв ще бъде резултатът след изпълнение на следния програмен фрагмент:\n" +
                    "int a = 7, b = 5;\n" +
                    "if (a == b );\n" +
                    "a = a + b;\n" +
                    "else;\n" +
                    "b = a + b;\n",
            listOf(
                Answer(1, "b = 12; ", false),
                Answer(2, "a = 12;", false),
                Answer(3, "грешка ", true),
                Answer(4, "a = 12 И b = 12; ", false)
            )
        ),
        Question(
            id = 4,
            "Kаква ще бъде стойността на променливата c след изпълнение на следния програмен фрагмент:\n" +
                    "int a = 14, b = 9, c = 2;\n" +
                    "if (a != b ) {\n" +
                    "a = c % b;\n" +
                    "b = a/c;\n" +
                    "c += a + b;\n" +
                    "}\n",
            listOf(
                Answer(1, "c = 5 ", true),
                Answer(2, "c = 0", false),
                Answer(3, "c = 14 ", false),
                Answer(4, "c = 9 ", false)
            )
        ),
        Question(
            id = 4,
            "Кой вариант на изписване е ГРЕШЕН?",
            listOf(
                Answer(1, "if (x>0) x=2 && y=2; ", true),
                Answer(2, "if (x>0 && y>0) x=y+2;", false),
                Answer(3, "if (x==0) y=2", false),
                Answer(4, "if (x>y) x=-y", false)
            )
        ),
        Question(
            id = 4,
            "Как се означават начало и край на блок-оператор в езика C#?",
            listOf(
                Answer(1, "Със знака ; ", false),
                Answer(2, "С двойка скоби [  и  ]", false),
                Answer(3, "С двойка скоби (  и  )", false),
                Answer(4, "Нито един от посочените начини", true)
            )
        ),
        Question(
            id = 4,
            "Колко пъти се променя стойността на променливата х след първото присвояване и изпълнение на програмния фрагмент?\n" +
                    "double x=-3.14, y=5.12; \n" +
                    "if (Math.Round(x)< =0) y=Math.Round(y);\n" +
                    "if (Math.Ceiling(x)==x) x=x+2;\n" +
                    "else y=y+2;\n",
            listOf(
                Answer(1, "3 ", false),
                Answer(2, "0", true),
                Answer(3, "1", false),
                Answer(4, "2", false)
            )
        ),
        Question(
            id = 4,
            "Каква е стойността на променливата players след изпълнение на следния програмен фрагмент?\n" +
                    "int  counter = 5,  players = 5;\n" +
                    "if ( players > = counter )  players = 10;\n" +
                    "if ( players == counter ) counter++;\n" +
                    "players = counter;\n",
            listOf(
                Answer(1, "11 ", false),
                Answer(2, "12", false),
                Answer(3, "6", false),
                Answer(4, "5", true)
            )
        ),
        Question(
            id = 4,
            "Каква ще бъде стойността на променливата a след изпълнение на следния програмен фрагмент:\n" +
                    "int a = 3, b = 6;\n" +
                    "if (b > 0 )\n" +
                    "if (а < 0 )\n" +
                    "a = a + b;\n" +
                    "else\n" +
                    "a *= 2;\n",
            listOf(
                Answer(1, "нито едно ", false),
                Answer(2, "3", false),
                Answer(3, "6", true),
                Answer(4, "9", false)
            )
        )
    )

    fun getFifthModuleQuestions() = listOf(
        Question(
            id = 5,
            "Посочи верните твърдения:",
            listOf(
                Answer(1, "Безкрайни цикли не съществуват", false),
                Answer(
                    2,
                    "Всеки цикъл има свое тяло – това е групата от действия, които ще се повтарят",
                    true
                ),
                Answer(3, "Едно повторение на цикъла е една итерация", true),
                Answer(
                    4,
                    "При цикличните алгоритми, управлявани от условие, броят на повторенията не зависи от верността на дадено логическо условие",
                    false
                )
            )
        ),
        Question(
            id = 5,
            "Кой вид цикъл може да НЕ бъде изпълнен нито веднъж??",
            listOf(
                Answer(1, "Нито един от двата вида ", false),
                Answer(2, "Със следусловие, цикъл do-while", false),
                Answer(3, "И двата вида", false),
                Answer(4, "С предусловие, цикъл while", true)
            )
        ),
        Question(
            id = 5,
            "Каква ще бъде стойността на променливата n след изпълнение на следния програмен фрагмент:\n" +
                    "int n = 2;\n" +
                    "int a = 1;\n" +
                    "while (n >= 3)\n" +
                    "n = a + 2;\n",
            listOf(
                Answer(1, "1 ", false),
                Answer(2, "2", true),
                Answer(3, "3", false),
                Answer(4, "Нито едно от посочените", false)
            )
        ),
        Question(
            id = 5,
            "Каква ще бъде стойността на променливата n след изпълнение на следния програмен фрагмент:\n" +
                    "int n = 2;\n" +
                    "int a = 1;\n" +
                    "do {\n" +
                    "n += a + 2;\n" +
                    "} while (n <= 3);\n",
            listOf(
                Answer(1, "3 ", false),
                Answer(2, "2", false),
                Answer(3, "5", true),
                Answer(4, "Нито едно от посочените", false)
            )
        ),
        Question(
            id = 5, "Колко са видовете цикли в езика C#?", listOf(
                Answer(1, "2 ", false),
                Answer(2, "3", true),
                Answer(3, "Повече", false),
                Answer(4, "1", false)
            )
        ),
        Question(
            id = 5,
            "Каква ще бъде стойността на променливата Х след изпълнение на следния програмен фрагмент?\n" +
                    "int X=-1;\n" +
                    "while (X>=0) X=Х+2;\n",
            listOf(
                Answer(1, "Нито една от посочените ", true),
                Answer(2, "x = 0", false),
                Answer(3, "x = 1 ", false),
                Answer(4, "x = 2", false)
            )
        ),
        Question(
            id = 5, "Каква грешка е допусната в следния програмен код?\n" +
                    "int x=10, br=0;\n" +
                    "while (x < 20)\n" +
                    "{\n" +
                    "     br++;\n" +
                    "}\n", listOf(
                Answer(1, "Променливата br не участва в булевото условие ", false),
                Answer(2, "В блока от скоби {  и  } е включен само един оператор", false),
                Answer(3, "Няма знак ; след затварящата скоба", false),
                Answer(4, "X не се изменя в тялото на цикъла", true)
            )
        ),
        Question(
            id = 5, "Итераторът е:", listOf(
                Answer(1, "Вид условие ", false),
                Answer(2, "Вид променлива", true),
                Answer(3, "Вид действие ", false),
                Answer(4, "Вид цикъл ", false)
            )
        ),
        Question(
            id = 5,
            "Посочи верните твърдения:",
            listOf(
                Answer(
                    1,
                    "Цикълът, управляван от брояч, може да не се изпълни нито веднъж ",
                    true
                ),
                Answer(2, "Цикълът се изпълнява, докато условието е вярно", true),
                Answer(
                    3,
                    "Запазената ключова дума за цикъл, управляван от брояч, е while",
                    false
                ),
                Answer(
                    4,
                    "Тялото на цикъл, управляван от брояч, винаги трябва да бъде заградено във фигурални скоби {}",
                    false
                )
            )
        ),
        Question(
            id = 5,
            "Каква ще бъде стойността на променливата n след изпълнение на следния програмен фрагмент:\n" +
                    "int n = 0; int a = 5;\n" +
                    "for (int i = 1; i < 3; i++) {\n" +
                    "n = a * 2;\n" +
                    "}\n",
            listOf(
                Answer(1, "5 ", false),
                Answer(2, "10", true),
                Answer(3, "20", false),
                Answer(4, "0", false)
            )
        ),
        Question(
            id = 5,
            "Колко пъти ще се изпълни тялото на цикъла в следния програмен фрагмент:\n" +
                    "int n = 0; int a = 5;\n" +
                    "for (int i = 1; i < 3; i++){\n" +
                    "n = a * 2;\n" +
                    "}\n",
            listOf(
                Answer(1, "0 ", false),
                Answer(2, "1", false),
                Answer(3, "2", true),
                Answer(4, "3", false)
            )
        ),
        Question(
            id = 5,
            "Колко итерации ще изпълни следният цикъл:\n" +
                    "int i, s=0;\n" +
                    "for (i=1; i < =2; i++)\n" +
                    "    if (i%2==1) s=s+i;\n",
            listOf(
                Answer(1, "0 ", false),
                Answer(2, "1", false),
                Answer(3, "2", true),
                Answer(4, "Повече", false)
            )
        ),
        Question(
            id = 5,
            "Каква стойност трябва да бъде изписана на мястото на многоточието, така че цикълът да бъде изпълнен точно 4 пъти?\n" +
                    "int i, s=0;\n" +
                    "for (i=2; i < .... ; i=i+2)\n" +
                    "   s=s+1;\n",
            listOf(
                Answer(1, "4 ", false),
                Answer(2, "8", false),
                Answer(3, "10", true),
                Answer(4, "12", false)
            )
        ),
        Question(
            id = 5, "Какво отпечатва следният програмен фрагмент:\n" +
                    "for (int i=2; i < =10 i++)\n" +
                    "      if (i%2==1) Console.Write(i.ToString() + \" , \");\n", listOf(
                Answer(1, "2+4+6+8+10  ", false),
                Answer(2, "3, 5, 7, 9", true),
                Answer(3, "2, 4, 6, 8, 10 ", false),
                Answer(4, "3+5+7+9", false)
            )
        ),
        Question(
            id = 5,
            "За начало на правоъгълната координатна система в приложение с ГПИ се приема:?",
            listOf(
                Answer(1, "Центърът на координатна система ", false),
                Answer(2, "Нито едно от изброените", false),
                Answer(3, "Горният десен ъгъл на компонентата", false),
                Answer(4, "Горният ляв ъгъл на компонентата", true)
            )
        ),
        Question(
            id = 5,
            "Как се нарича основната фигура, от която се получава по-сложно изображение в приложение с ГПИ?",
            listOf(
                Answer(1, "Графично поле ", false),
                Answer(2, "Графичен примитив", true),
                Answer(3, "Графични координати", false),
                Answer(4, "Графична линия", false)
            )
        ),
        Question(
            id = 5,
            "Коя от изброените команди служи за извличане на графика в приложение с ГПИ на Java?",
            listOf(
                Answer(1, "Graphics g = pnlCanvas.setGraphics(); ", false),
                Answer(2, "pnlCanvas.getGraphics();", false),
                Answer(3, "Graphics g = pnlCanvas();", false),
                Answer(4, "Graphics g = pnlCanvas.getGraphics();", true)
            )
        ),
        Question(
            id = 5,
            "За да започнеш да работиш с текстов файл в Java, трябва да добавиш две библиотеки. Кои са те?",
            listOf(
                Answer(1, "Scanner ", true),
                Answer(2, "File", true),
                Answer(3, "Dox", false),
                Answer(4, "NewFile", false)
            )
        ),
        Question(
            id = 5, "Какво е предназначението на командата, описана в програмния ред?\n" +
                    "final String PATH = \"resources/\"; \n", listOf(
                Answer(1, "Посочва пътя до файла ", true),
                Answer(2, "Посочва името на файла", false),
                Answer(3, "Посочва разширението на файла", false),
                Answer(4, "Свързва програмата с файла", false)
            )
        ),
        Question(
            id = 5,
            "В Java има начин, по който можеш да форматираш изчетения текстов файл. Кой програмен ред извършва това действие?",
            listOf(
                Answer(1, "format(„форматиращ низ\", аргументи); ", false),
                Answer(2, "output.format(„форматиращ низ\", аргументи);", true),
                Answer(3, "output.format(аргументи, \"форматиращ низ\");", false),
                Answer(4, "input.format(„форматиращ низ\", аргументи);", false)
            )
        )
    )

    fun getSixthModuleQuestions() = listOf(
        Question(
            id = 6, "Масивът е:", listOf(
                Answer(1, "Оператор от език за програмиране", false),
                Answer(2, "Метод за програмиране", false),
                Answer(3, "Вид алгоритъм", false),
                Answer(4, "Структура от данни", true)
            )
        ),
        Question(
            id = 6, "Кои твърдения са верни за програмния фрагмент?\n" +
                    "double [ ] array = new double [12];\n", listOf(
                Answer(1, "Масивът има 12 елемента", true),
                Answer(2, "Индексите на елементите са реални числа", false),
                Answer(3, "Масивът има 11 елемента", false),
                Answer(4, "Индексите на елементите са цели неотрицателни числа", true)
            )
        ),
        Question(
            id = 6,
            "Масивът е статична структура от данни. Какво значение има определението \"статична\"?",
            listOf(
                Answer(
                    1,
                    "Броят на използваните елементи не може да е по-малък от декларирания",
                    false
                ),
                Answer(2, "Нито едно от посочените", false),
                Answer(
                    3,
                    "Първоначално декларираният брой елементи не може да бъде променян",
                    true
                ),
                Answer(
                    4,
                    "Стойностите на елементите не могат да бъдат променяни, те са статични",
                    false
                )
            )
        ),
        Question(
            id = 6,
            "Колко елемента (клетки от паметта) ще бъдат заделени след изпълнение на следния програмен ред:\n" +
                    "double  [ ] test = {2.5, 2.5, 2.5, 2.5};\n",
            listOf(
                Answer(1, "Кодът е неправилен", false),
                Answer(2, "2.5 ", false),
                Answer(3, "Не е посочено", false),
                Answer(4, "4", true)
            )
        ),
        Question(
            id = 6, "От какво се определя типът на масива?", listOf(
                Answer(1, "Oт дължината му", false),
                Answer(2, "Нито едно от изброените", false),
                Answer(3, "От типа на елементите му", true),
                Answer(4, "От неговото име", false)
            )
        ),
        Question(
            id = 6, "С какво се характеризира всеки масив?", listOf(
                Answer(1, "С дължина", false),
                Answer(2, "Всички изброени", true),
                Answer(3, "С тип", false),
                Answer(4, "С име", false)
            )
        ),
        Question(
            id = 6,
            "В кой от изброените примери правилно е посочен броят на елементите на масив?",
            listOf(
                Answer(1, "int [] myArray = [5];", false),
                Answer(2, "int [] myArray = new double [7];", false),
                Answer(3, "int [] myArray = new int [6];", true),
                Answer(4, "int [] myArray = new int 5;", false)
            )
        ),
        Question(
            id = 6, "Даден е следният програмен фрагмент:\n" +
                    "int [] myArray = [9];\n" +
                    "myArray[4] = 5;\n" +
                    "Кое от посочените твъдения е вярно?\n", listOf(
                Answer(1, "Програмният фрагмент е грешен", true),
                Answer(2, "Масивът има 9 елемента", false),
                Answer(3, "На елемент с индекс 4 се присвоява стойност 5", false),
                Answer(4, "Масивът има 5 елемента", false)
            )
        ),
        Question(
            id = 6,
            "Какви стойности може да заема свойството Enabled на обект (напр. на бутон, на tеxtBox и др.)?",
            listOf(
                Answer(1, "Стринг като всички входни данни", false),
                Answer(2, "Нито едно от посочените", false),
                Answer(3, "Булеви - true или false", true),
                Answer(
                    4,
                    "Числови - времето (в милисекунди), за което се блокира обектът",
                    false
                )
            )
        ),
        Question(
            id = 6,
            "С каква стойност трябва да инициализираш променлива, в която пресмяташ произведение?",
            listOf(
                Answer(1, "0", false),
                Answer(2, "1", true),
                Answer(3, "Зависи от типа на елементите", false),
                Answer(4, "Нито едно от посочените", false)
            )
        ),
        Question(
            id = 6, "При обхождане на елементите на масив, те се достъпват по:", listOf(
                Answer(1, "Условие", false),
                Answer(2, "Големинае", false),
                Answer(3, "Стойност ", false),
                Answer(4, "Индекс ", true)
            )
        ),
        Question(
            id = 6, "Когато се търси максимален или минимален елемент в масив:", listOf(
                Answer(1, "Използваме сумата на елементите", false),
                Answer(2, "Не е нужно да се обхождат всички елементи", false),
                Answer(3, "Сами избираме кой елемент отговаря на условието", false),
                Answer(4, "Трябва да бъдат обходени всички елементи", true)
            )
        ),
        Question(
            id = 6, "Кои елементи се означават с определението екстремални?", listOf(
                Answer(1, "Максималните по позиция", false),
                Answer(2, "Минималните по стойност", true),
                Answer(3, "Минималните по позиция", false),
                Answer(4, "Максималните по стойност", true)
            )
        ),
        Question(
            id = 6, "Посочи верните твърдения:", listOf(
                Answer(
                    1,
                    "Минималният елемент може да се среща n-пъти в масив (където n е броят на елементите в масива",
                    true
                ),
                Answer(
                    2,
                    "Минималният елемент може да се среща точно един път в масив",
                    false
                ),
                Answer(3, "Минимален елемент може да няма в масив", false),
                Answer(
                    4,
                    "Минималният елемент може да се среща повече от един път в масив",
                    true
                )
            )
        ),
        Question(
            id = 6,
            "Кое свойство на обект (бутон, текстово поле и др.) трябва да промениш, за да деактивираш обекта?",
            listOf(
                Answer(1, "Name", false),
                Answer(2, "Items", false),
                Answer(3, "Enabled", true),
                Answer(4, "Click", false)
            )
        ),
        Question(
            id = 6, "Посочи верните твърдения:", listOf(
                Answer(1, "Обхождане на масив може да се направи и с цикъл while", true),
                Answer(
                    2,
                    "В един масив може да няма елементи, отговарящи на дадено условие",
                    true
                ),
                Answer(
                    3,
                    "В един масив може да има няколко елемента, отговарящи на дадено условие",
                    true
                ),
                Answer(
                    4,
                    "В един масив винаги има само един елемент, отговарящ на дадено условие",
                    false
                )
            )
        ),
        Question(
            id = 6,
            "За преброяване елементите на масив, които отговарят на дадено условие, използваме отделна променлива - брояч. Каква начална стойност трябва да зададем на брояча?",
            listOf(
                Answer(1, "Не е определена ", false),
                Answer(2, "-1", false),
                Answer(3, "1", true),
                Answer(4, "0", true)
            )
        ),
        Question(
            id = 6, "string [] name={\"Mary\", \"Ana\", \"Ana Mary\", \"MaryAna\"};\n" +
                    "for (int i=0; i < 4; i++)\n" +
                    "  if (name[i]==\"Mary\" || name[i]==\"Ana\") Console.WriteLine(name[i]);\n" +
                    "Кои имена на приятелки ще бъдат отпечатани?\n", listOf(
                Answer(1, "MaryAna", false),
                Answer(2, "Ana", true),
                Answer(3, "Ana Mary ", false),
                Answer(4, "Mary ", true)
            )
        ),
        Question(
            id = 6,
            "Каква ще бъде стойността на променливата day след изпълнение на програмния фрагмент?\n" +
                    "String [] array = {\"понеделник\", \"вторник\", \"сряда\", \"четвъртък\", \"петък\"};\n" +
                    "String day = \"понеделник\";\n" +
                    "for(int i=1; i < array.length; i++){\n" +
                    "if(array[i] == \"събота\")\n" +
                    "day = \"неделя\";\n" +
                    "}\n",
            listOf(
                Answer(1, "Понеделник", true),
                Answer(2, "Неделя", false),
                Answer(3, "Събота", false),
                Answer(4, "Петък", false)
            )
        ),
        Question(
            id = 6,
            "За спазване добър стил на програмиране е удачно при именуване на обект да използваш представка за типа на обекта и долепяш името му. Например: btnN, btnEnter, txtBoxN, lblName и т.н. Кое свойство на обекта трябва да промениш, за да именуваш обект по този начин?",
            listOf(
                Answer(1, "Name", true),
                Answer(2, "Text ", false),
                Answer(3, "TextName", false),
                Answer(4, "ObjectName", false)
            )
        ),
    )
}