# КУРС: JAVA ДЛЯ ТЕСТИРОВЩИКОВ

## Темы
### 1. Введение в Java (`_01_Intro/`)
- Первая программа `Hello, World!`
- Компиляция и запуск Java-кода

### 2. Переменные и типы данных (`_02_Variables/`)
- Примитивные типы (`int`, `double`, `char`, `boolean`, `String`)

### 3. Операторы (`_03_Operators/`)
- **Арифметические** , **Операторы сравнения**, **Логические операторы** , **Операторы присваивания**, **Побитовые операторы**, **Тернарный оператор** 

### 4. Условные операторы (`_04_Conditions/`)
`if-else`, `switch-case`

### 5. Циклы (`_05_Loops/`)
`for`, `while`,`do-while`,`for Each` 

### 6. Массивы и их методы(`_06_Arrays/`)

### 7. Практические задания (`TASKS/`)
#### `Задачи по темам 1,2,3,4,5,6 (см.пункты выше)` 

### 8. Практические задания (`COURSE_TASKS/`)
#### `Task_01` - **Класс `Programmer`**
- Создан класс `Programmer` с полями:
  - `name` (имя)
  - `age` (возраст)
  - `isHasTask` (есть ли текущая задача)
  - `isKnowJava` (знает ли Java)
- Созданы методы:
  - `goWork()` – выводит сообщение о начале работы.
  - `goSleep()` – выводит сообщение об отдыхе.
  - `teachJava(Programmer anotherProgrammer)` – позволяет программисту обучать другого.
- В `Main.java` созданы два объекта `Programmer`.
- Для наблюдения за работой метода teachJava(), нужно изменить начальные значения переменных:
  - `programmer1.isKnowJava = false;`
  - `programmer2.isKnowJava = true;` 

### 9. Практические задания (`COURSE_TASKS/`)
#### `Task_02` - **Работа с циклами, факториалом и сортировкой массива**
- Реализован интерфейс `Loops`, содержащий методы:
  - `sumAllNumbers(int a)` – возвращает сумму всех чисел от `1` до `a` (включительно).
  - `factorial(int b)` – вычисляет факториал числа `b` (при `b < 10`).
  - `sort(int[] ints, boolean isAsc)` – сортирует массив чисел (`true` – по возрастанию, `false` – по убыванию).
  - `sort(int[] ints)` – сортирует массив чисел по убыванию.

- Созданы три класса, реализующие интерфейс `Loops`:
  `While`, `DoWhile`, `Fori`

- В `Main.java` выполнены:
  - **Сумма всех чисел (`sumAllNumbers`)**  
    - `whileLoop.sumAllNumbers(number);`
    - `doWhileLoop.sumAllNumbers(number);`
    - `forLoop.sumAllNumbers(number);`
  - **Факториал числа (`factorial`)**  
    - `whileLoop.factorial(number);`
    - `doWhileLoop.factorial(number);`
    - `forLoop.factorial(number);`
  - **Сортировка массива (`sort`)**  
    - `whileLoop.sort(array, isAsc);`
    - `doWhileLoop.sort(array, isAsc);`
    - `forLoop.sort(array, isAsc);`
    - - `whileLoop.sort(array);`
    - `doWhileLoop.sort(array);`
    - `forLoop.sort(array);` 
## Пример запуска 
```sh
# Компиляция
javac -d src src/COURSE_TASKS/Task_01/*.java

# Запуск
java -cp src COURSE_TASKS.Task_01.Main


