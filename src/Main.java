public class Main {
    public static void main(String[] args) {
        {
        // задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName + " ";
        System.out.printf("ФИО сотрудника " + fullName);
        System.out.println();

        //задание 2
        String result = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + result);
    }

        var fullName = "Иванов Семён Семёнович";
        String[] split = fullName.split(" ");
        for (String current : split) {
            if (current.contains("ё")) {
                var text = current.replace("ё", "е");
                System.out.print(  text+" ");
            }
            else {
                System.out.print("Данные ФИО сотрудника — "+ current+" ");
        }
    }}}