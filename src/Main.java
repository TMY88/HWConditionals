public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        System.out.println("Задание 1");
        int age=34;
        if (age>=18) {
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }
        age=16;
        if (age>=18) {
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        int outdoorTemperature=3;
        if (outdoorTemperature<5) {
            System.out.println("На улице "+outdoorTemperature+" градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице "+outdoorTemperature+", градусов, можно идти без шапки");
        }
        outdoorTemperature=7;
        if (outdoorTemperature<5) {
            System.out.println("На улице "+outdoorTemperature+" градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице "+outdoorTemperature+" градусов, можно идти без шапки");
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        int carSpeed=70;
        if (carSpeed>60) {
            System.out.println("Если скорость автомобиля "+carSpeed+" км/ч, то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость автомобиля "+carSpeed+" км/ч, то можно ездить спокойно");
        }
        carSpeed=48;
        if (carSpeed>60) {
            System.out.println("Если скорость автомобиля "+carSpeed+" км/ч, то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость автомобиля "+carSpeed+" км/ч, то можно ездить спокойно");
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
    int age=3;
    if (age>=2 && age<=6) {
        System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
    }
    else {
        if (age>=7 && age<=18) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
        }
        else {
            if (age>18 && age<24) {
                System.out.println("Если возраст человека равен "+age+", то его место в университете");
            }
            else {
                System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу");
            }
        }
    }
        age=10;
        if (age>=2 && age<=6) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
        }
        else {
            if (age>=7 && age<=18) {
                System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
            }
            else {
                if (age>18 && age<24) {
                    System.out.println("Если возраст человека равен "+age+", то его место в университете");
                }
                else {
                    System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу");
                }
            }
        }

            age=20;
            if (age>=2 && age<=6) {
                System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
            }
            else {
                if (age>=7 && age<=18) {
                    System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
                }
                else {
                    if (age>18 && age<24) {
                        System.out.println("Если возраст человека равен "+age+", то его место в университете");
                    }
                    else {
                        System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу");
                    }
                }
            }

                age=25;
                if (age>=2 && age<=6) {
                    System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
                }
                else {
                    if (age>=7 && age<=18) {
                        System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
                    }
                    else {
                        if (age>18 && age<24) {
                            System.out.println("Если возраст человека равен "+age+", то его место в университете");
                        }
                        else {
                            System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу");
                        }
                    }
                }
    }
    public static void task5(){
        System.out.println("Задание 5");
    int age=4;
    if (age<5) {
        System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
    }
    else {
        if (age>=5 && age<14) {
        System.out.println("Если возраст ребенка равен " + age + ", можно кататься на аттракционе в сопровождении взрослого");
        }
        else
        System.out.println("Если возраст ребенка равен " + age + ", можно кататься на аттракционе без сопровождения взрослого");
    }
        age=10;
        if (age<5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else {
            if (age>=5 && age<14) {
                System.out.println("Если возраст ребенка равен " + age + ", можно кататься на аттракционе в сопровождении взрослого");
            }
            else
                System.out.println("Если возраст ребенка равен " + age + ", можно кататься на аттракционе без сопровождения взрослого");
        }
            age=15;
            if (age<5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            }
            else {
                if (age>=5 && age<14) {
                    System.out.println("Если возраст ребенка равен " + age + ", можно кататься на аттракционе в сопровождении взрослого");
                }
                else
                    System.out.println("Если возраст ребенка равен " + age + ", можно кататься на аттракционе без сопровождения взрослого");
            }
    }
    public static void task6() {
        System.out.println("Задание 6");
        int wagonCapaсity = 120;
        int seatingPlace = 60;
        int placeNumber = 55;
        if (placeNumber <= wagonCapaсity && placeNumber <= seatingPlace) {
            System.out.println("Номер "+placeNumber+". Есть сидячее место в вагоне");
        }
        else {
            if (placeNumber > seatingPlace && placeNumber <= wagonCapaсity) {
                System.out.println("Номер "+placeNumber+". Есть стоячее место в вагоне");
            } else {
                System.out.println("Номер "+placeNumber+". Мест нет!");
            }
        }
        placeNumber = 78;
        if (placeNumber <= wagonCapaсity && placeNumber <= seatingPlace) {
            System.out.println("Номер "+placeNumber+". Есть сидячее место в вагоне");
        }
        else {
            if (placeNumber > seatingPlace && placeNumber <= wagonCapaсity) {
                System.out.println("Номер "+placeNumber+". Есть стоячее место в вагоне");
            } else {
                System.out.println("Номер "+placeNumber+". Мест нет!");
            }
        }

            placeNumber=125;
            if (placeNumber <= wagonCapaсity && placeNumber <= seatingPlace) {
                System.out.println("Номер "+placeNumber+". Есть сидячее место в вагоне");
            }
            else {
                if (placeNumber > seatingPlace && placeNumber <= wagonCapaсity) {
                    System.out.println("Номер "+placeNumber+". Есть стоячее место в вагоне");
                } else {
                    System.out.println("Номер "+placeNumber+". Мест нет!");
                }
            }
    }
    public static void task7(){
        System.out.println("Задание 7");
    int one=5;
    int two=8;
    int three=3;
    if (three>two && three>one) {
        System.out.println("Из чисел "+one+", "+two+", "+three+" наибольшее - "+three);
    }
    else {
        if (two>three && two>one) {
            System.out.println("Из чисел "+one+", "+two+", "+three+" наибольшее - "+two);
        }
        else {
            System.out.println("Из чисел "+one+", "+two+", "+three+" наибольшее - "+one);
        }
    }
    }
}