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
`for`, `while`,`do-while` 

### 6. Практические задания (`TASKS/`)
#### `Задачи по темам 1,2,3,4 (см.пункты выше)` 

### 7. Практические задания (`COURSE_TASKS/`)
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

  
## Запуск 
```sh
# Компиляция
javac -d src src/COURSE_TASKS/Task_01/*.java

# Запуск
java -cp src COURSE_TASKS.Task_01.Main


