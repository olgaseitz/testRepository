    //1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
public class Employee {
    private String name, rank, tel;
    private int salary, age;

    // 2 Конструктор класса должен заполнять эти поля при создании объекта;
    Employee(String name, String rank, String tel, int salary, int age) {
        this.name = name;
        this.rank = rank;
        this.tel = tel;
        this.salary = salary;
        this.age = age;

    }

    //   3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
        void who(){
        System.out.print("ФИО: " + name);
        }
        void vacancy(){
        System.out.println(" Должность: " + rank);
        }
        void phone(){
        System.out.println("Телефон: " + tel);
        }
        void payment(){
        System.out.println("Зарплата: " + salary);
        }
        void old(){
        System.out.println("Возраст: " + age);
        }

        int getAge() {
        return age;
        }
        void getFullInfo(){
        System.out.println("ФИО: " + name + " Должность: " + rank);
        System.out.println("Телефон: " + tel + " Зарплата: " + salary + " Возраст: " + age);
        }

        //    6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
        void getSalaryUp() {
        System.out.println("ФИО: " + name + " Зарплата: " + (salary + 10000));
        }

}

