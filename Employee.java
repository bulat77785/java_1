package Lesson_5;

public class Employee {
    String fio;
    String position;
    String email;
    String cellNumber;
    int salary;
    int age;

    public Employee(String fio, String position, String email, String cellNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.cellNumber = cellNumber;
        this.salary = salary;
        this.age = age;
         if (this.age > 40) {
             System.out.println("ФИО сотрудника: " + this.fio + ", Должность: " + this.position + ", Электронная почта: "
                     + this.email + ", Номер телефона: " + this.cellNumber + ", Доход: " + this.salary +
                     ", Возраст: " + this.age);
         }
        //System.out.println(this.fio + this.position + this.email + this.cellNumber + this.salary + this.age);
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов П.С.", "Менеджер", "vasya@vasek.com", "89001112222", 150000, 35);
        persArray[1] = new Employee("Петров И.С.", "Снабженец", "petrov@vasek.com", "89010001111", 100000, 37);
        persArray[2] = new Employee("Сидоров П.И", "Бухгалтер", "sidorov@vasek.com", "89023330000", 150000, 42);
        persArray[3] = new Employee("Ефремов И.С.", "Программист", "efremov@vasek.com", "89030002222", 200000, 36);
        persArray[4] = new Employee("Ефимов А.А.", "Директор", "efimov@vasek.com", "89043334444", 250000, 47);

       /* for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                System.out.println();
            }*/
    }
}
