import java.util.Comparator;


/**
重写Comparator的compare方法，该方法返回一个整形，用以表明两个对象的大小关系
 若返回正数则表示o1>o2，返回0则表示o1=o2，返回负数则表示o1<o2，类似于基础数据类型的大小比较方式
 以下写法能保证后续的排序是正序，如果要实现倒序，将o1和o2对调即可
 */
public class personComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        int result = (int)(o1.getWage()-o2.getWage());
        return result;
    }
}
