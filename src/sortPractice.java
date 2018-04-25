import java.util.ArrayList;
import java.util.List;

public class sortPractice {
    public static void main(String[] args ){
        List<Person> list = new ArrayList<>();

        Person person1 = new Person("liugeng", 29, 5000);
        Person person2 = new Person("lilin", 22, 3432);
        Person person3 = new Person("yexiaozhou", 28, 6180);
        Person person4 = new Person("chenkai", 25, 9841);
        Person person5 = new Person("bige", 30, 4314);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        for(Person person : list){
            System.out.println(person.getName());
        }

        System.out.println("——————————我是分割线——————————");
//        list.sort(new personComparator());
        Person[] persons = {person1, person2, person3, person4, person5};
        MergeSort.refTypeSort(persons, new personComparator());

//        for(Person person : list){
//            System.out.println(person.getName());
//        }
        for(int i=0; i < persons.length; i++){
            System.out.println(persons[i].getName());

        }

//        int[] array = {7,3,4,5,2,6,3,9};
//
//        MergeSort.easySort(array);
//
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i]);
//        }

    }
}
