import com.exercise.Human;
import com.exercise.ListDemo;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ListDemoTest {
    @Test
    //Поиск первого символа
    public void amountWord() throws Exception {
        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
        stringList.add("Hi");
        stringList.add("What");
        stringList.add("Hope");
        stringList.add("Horse");
        Assert.assertEquals(4, ListDemo.amountWord(stringList, 'H'));
        Assert.assertEquals(1, ListDemo.amountWord(stringList, 'W'));
        Assert.assertEquals(0, ListDemo.amountWord(stringList, 'L'));
    }

    @Test
    // Список однофамильцев
    public void listNamesakes() {
        Human person = new Human("Виктов", "Васильков", "Николаевич", "18");

        List<Human> humanList = new ArrayList<Human>();
        Human human1 = new Human("Андрей", "Васильков", "Николаевич", "18");
        humanList.add(human1);
        Human human2 = new Human("Николай", "Пингин", "Алексеевич", "18");
        humanList.add(human2);
        Human human3 = new Human("Виталий", "Кох", "Витальевич", "18");
        humanList.add(human3);
        Human human4 = new Human("Денис", "Васильков", "Николаевич", "18");
        humanList.add(human4);
        Human human5 = new Human("Сергей", "Груздин", "Александрович", "18");
        humanList.add(human5);

        List<Human> resultHumanList = new ArrayList<Human>();
        resultHumanList.add(human1);
        resultHumanList.add(human4);
        Assert.assertEquals(resultHumanList, ListDemo.listNamesakes(humanList, person));
    }

    @Test
    //Убираем выделенного человека
    public void removeHuman() {
        List<Human> humanList = new ArrayList<Human>();
        Human human1 = new Human("Андрей", "Васильков", "Николаевич", "18");
        humanList.add(human1);
        Human human2 = new Human("Николай", "Пингин", "Алексеевич", "18");
        humanList.add(human2);
        Human human3 = new Human("Виталий", "Кох", "Витальевич", "18");
        humanList.add(human3);
        Human human4 = new Human("Денис", "Васильков", "Николаевич", "18");
        humanList.add(human4);
        Human human5 = new Human("Сергей", "Груздин", "Александрович", "18");
        humanList.add(human5);

        List<Human> resultHumanList = new ArrayList<Human>();
        Human human6 = new Human("Андрей", "Васильков", "Николаевич", "18");
        resultHumanList.add(human6);
        Human human7 = new Human("Николай", "Пингин", "Алексеевич", "18");
        resultHumanList.add(human7);
        Human human8 = new Human("Виталий", "Кох", "Витальевич", "18");
        resultHumanList.add(human8);
        Human human9 = new Human("Денис", "Васильков", "Николаевич", "18");
        resultHumanList.add(human9);

        Assert.assertEquals(resultHumanList, ListDemo.removeHuman(humanList, human5));
    }

    @Test
    //Непересекающиеся множества
    public void intersectingSet() {
        List<HashSet<Integer>> treeSetList = new ArrayList<HashSet<Integer>>();
        //Список множеств
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(3);
        set1.add(4);
        treeSetList.add(set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(3);
        set2.add(5);
        treeSetList.add(set2);

        HashSet<Integer> set3 = new HashSet<Integer>();
        set3.add(1);
        set3.add(2);
        set3.add(5);
        treeSetList.add(set3);

        HashSet<Integer> set4 = new HashSet<Integer>();
        set4.add(1);
        set4.add(2);
        set4.add(3);
        treeSetList.add(set4);

        HashSet<Integer> set5 = new HashSet<Integer>();
        set5.add(1);
        set5.add(3);
        set5.add(5);
        treeSetList.add(set5);

        //Задаём множество
        HashSet<Integer> otherSet = new HashSet<Integer>();
        otherSet.add(1);
        otherSet.add(4);

        List<HashSet<Integer>> resultTreeSetList = new ArrayList<HashSet<Integer>>();
        //Результат
        HashSet<Integer> setRes = new HashSet<Integer>();
        setRes.add(2);
        setRes.add(3);
        setRes.add(5);
        resultTreeSetList.add(setRes);

        Assert.assertEquals(resultTreeSetList, ListDemo.intersectingSet(treeSetList, otherSet));

    }

    @Test

    public void setHumanId() {
        Map<Integer, Human> map = new HashMap();
        Human human = new Human("Андрей", "Васильков", "Николаевич", "19");
        map.put(1, human);
        Human human1 = new Human("Николай", "Пингин", "Алексеевич", "17");
        map.put(2, human1);
        Human human2 = new Human("Виталий", "Кох", "Витальевич", "18");
        map.put(3, human2);
        Human human3 = new Human("Денис", "Васильков", "Александрович", "15");
        map.put(4, human3);
        Human human4 = new Human("Сергей", "Груздин", "Николаевич", "53");
        map.put(5, human4);

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);

        Set<Human> humanSet = new HashSet<Human>();
        Human human5 = new Human("Андрей", "Васильков", "Николаевич", "19");
        humanSet.add(human5);
        Human human6 = new Human("Виталий", "Кох", "Витальевич", "18");
        humanSet.add(human6);

        Assert.assertEquals(humanSet, ListDemo.setHumanId(map, set));
    }

    @Test
    //Не меньше 18
    public void yearHuman(){
        Map<Integer, Human> map = new HashMap();
        Human human = new Human("Андрей", "Васильков", "Николаевич", "19");
        map.put(1, human);
        Human human1 = new Human("Николай", "Пингин", "Алексеевич", "17");
        map.put(2, human1);
        Human human2 = new Human("Виталий", "Кох", "Витальевич", "18");
        map.put(3, human2);
        Human human3 = new Human("Денис", "Васильков", "Александрович", "15");
        map.put(4, human3);
        Human human4 = new Human("Сергей", "Груздин", "Николаевич", "53");
        map.put(5, human4);

        List<Integer> idList = new ArrayList<Integer>();
        idList.add(1);
        idList.add(3);
        idList.add(5);

        Assert.assertEquals(idList, ListDemo.yearHuman(map));
    }

}