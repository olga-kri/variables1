public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var weightFighter1 = 78.2;
        var weightFighter2 = 82.7;
        var totalWeight = weightFighter1 + weightFighter2;
        System.out.println("Общий вес бойцов " + totalWeight);
        var differenceWeight = weightFighter2 - weightFighter1;
        System.out.println("Разница между массами двух бойцов методом вычитания " + differenceWeight);
        differenceWeight = weightFighter2 % weightFighter1;
        System.out.println("Разница между массами двух бойцов с функцией остаток от деления " + differenceWeight);
        var staffNumber = 640 / 8;
        System.out.println("Всего работников в компании — " + staffNumber +
                " человек ");
        staffNumber = staffNumber + 94;
        var hoursWork = staffNumber * 8;
        System.out.println("Если в компании работает " + staffNumber + " человека, то всего " + hoursWork + " часов работы может быть поделено между сотрудниками ");
    }
}