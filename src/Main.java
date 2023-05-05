public class Main {
    public static void main(String[] args) {
        
//        Rectangle rectangle = new Rectangle();
//        rectangle.setHeight(9);
//        rectangle.setWidth(2);
//        System.out.println(rectangle.getHeight());
//        System.out.println(rectangle.getWidth());


        /**  University, School, Car жана Person деген класс тузунуз

         Алардын свойстваларын ойлоп табыныз

         Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек

         Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз

         Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/


        University university = new University();
        university.setYear(1096);
        university.setName("( Oxford )");
        university.setAddress("( Great Britain)");
        university.setCountry("( England )");

        University university1 = new University();
        university1.setYear(1885);
        university1.setName("( Mein Cvat)");
        university1.setAddress("( Stanford )");
        university1.setCountry("( California )");

        System.out.println(university);
        System.out.println(university1);
        System.out.println();

        Car car = new Car();
        car.setBrand("( Mercedes Benz 210 )");
        car.setYear(2023);
        car.setColor("( Grey )");

        Car car1 = new Car();
        car1.setBrand("( Camry 75 )");
        car1.setYear(2023);
        car1.setColor("( Black )");

        System.out.println(car);
        System.out.println(car1);
        System.out.println();

        School school = new School();
        school.setFloor(5);
        school.setStudent("( Girl )");
        school.setLessons("( Programming )");

        School school1 = new School();
        school1.setFloor(7);
        school1.setStudent("( boy )");
        school1.setLessons("( English lessons )");

        System.out.println(school);
        System.out.println(school1);

        Person person = new Person();
        person.setFirstName("( Eldan )");
        person.setLastName("( Turgunbaev )");
        person.setAge(18);

        Person person1 = new Person();
        person1.setFirstName("( Erbol )");
        person1.setLastName("( Ulan uulu )");
        person1.setAge(20);
        System.out.println(person);
        System.out.println(person1);
    }
}