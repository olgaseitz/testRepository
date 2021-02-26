public class Homework4 {
    public static void main(String[] args){
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Давыдов Д.В.", "Директор филиала", "314-13-24",
                100000, 43);
        employee[1] = new Employee("Корнилов В.А.", "Инженер", "390-12-14", 45000,
                25);
        employee[2] = new Employee("Лазарев М.П.", "Старший инженер", "310-45-45",
                80000, 50);
        employee[3] = new Employee("Романова Е.П.", "Бухгалтер", "314-34-90",
                50000, 38);
        employee[4] = new Employee("Эйлер М.Ф.", "Секретарь", "911-12-34",
                25000, 23 );

        //    4 Вывести при помощи методов из пункта 3 ФИО и должность.
        employee[0].who();
        employee[0].vacancy();
        employee[1].who();
        employee[1].vacancy();
        employee[2].who();
        employee[2].vacancy();
        employee[3].who();
        employee[3].vacancy();
        employee[4].who();
        employee[4].vacancy();

        System.out.println("--------------------");

        //    5  С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (Employee e : employee)
            if (e.getAge() > 40) e.getFullInfo();
        System.out.println("--------------------");


        System.out.println("Повысим зарплату всем сотрудникам старше 35 лет на 10000: ");
        for (Employee s : employee)
            if (s.getAge() > 35) s.getSalaryUp();


    }

}






