public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

// Задача 2
         dog = dog + 4;
         cat = cat + 4;
         paper = paper +4;

// Задача 3
         dog = dog - 3.5;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

// Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

// Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

// Задача 6
        var boxerWeihght1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalMassBoxer = boxerWeihght1 + boxerWeight2;
        System.out.println("Обшая масса бойцов "+totalMassBoxer+"кг");
        var weightDifferenceBoxer = boxerWeight2 - boxerWeihght1;
        System.out.println("Разница в весе бойцов "+weightDifferenceBoxer+"кг");

// Задача 7
        var totalweight = boxerWeight2 % boxerWeihght1;
        System.out.println("Остаток "+totalweight+"кг");

// Задача 8
        var totalWorkTime = 640;
        var onePeopleWork = 8;
        var totalWorkers = totalWorkTime / onePeopleWork;
        System.out.println("Всего работников в компании "+totalWorkers+" человек");
        var totalWorkers2 = totalWorkers + 94;
        var workingHours = onePeopleWork * totalWorkers2 ;
        System.out.println("Если в компании работает "+totalWorkers2+" человека, то всего " +workingHours+" часа работы может быть поделено между сотрудниками");











    }
}