### 🚀 Init Autotests (Java) 

Репозиторий с Unit автотестами на Java. Проект предназначен для автоматизированного тестирования классов внутри репозитория.

---

### 📌 Стек технологий

 - Язык: Java 11
 - Фреймворк: [JUnit4 / Mockito]
 - Сборка: Maven
 - Тест-раннер: JUnit 4
 - Отчеты: Jacoco

--- 

### 🏗 Структура проекта

```
src/
├── main/java/com/example/
│   ├── Animal                # Класс Animal
│   ├── Cat                   # Класс Cat
│   ├── Feline                # Класс Feline
│   ├── Lion                  # Класс Lion
│   └── Predator              # Класс Predator
└── test/java/com/example/
    ├── AnimalParamTest       # Наборы тестов (Параметризация для класса Animal)
    ├── AnimalTest            # Наборы тестов (Для класса Animal)
    ├── CatTest               # Наборы тестов (Для класса Cat)
    ├── FelineTest            # Наборы тестов (Для класса Feline)
    ├── LionParamTest         # Наборы тестов (Параметризация для класса Lion)
    └── LionTest              # Наборы тестов (для класса Lion)
```

