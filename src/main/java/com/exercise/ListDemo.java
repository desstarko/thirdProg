package com.exercise;

import java.util.*;

public class ListDemo {
    public static int amountWord(List list, char value) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().charAt(0) == value) {
                count++;
            }
        }
        return count;
    }

    public static List listNamesakes(List<Human> listHuman, Human human) {
        List<Human> list = new ArrayList<Human>();
        for (int i = 0; i < listHuman.size(); i++) {
            if (listHuman.get(i).getSurname().equals(human.getSurname())) {
                list.add(listHuman.get(i));
            }
        }
        return list;
    }

    public static List removeHuman(List<Human> humanList, Human human) {
        List<Human> list = new ArrayList<Human>();
        for (int i = 0; i < humanList.size(); i++) {
            list.add(humanList.get(i));
        }
        for (int i = 0; i < humanList.size(); i++) {
            if (list.get(i).equals(human)) {
                list.remove(i);
            }
        }
        return list;
    }

    public static List intersectingSet(List<HashSet<Integer>> setList, Set set) {   // 4.Пересекающийся набор
        List<HashSet<Integer>> setList1 = new ArrayList<HashSet<Integer>>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {  //пока множество не кончилось
            Integer buf = (Integer) iterator.next(); //получаем следующий элемент
            for (int i = 0; i < setList.size(); i++) {
                if (setList.get(i).contains(buf)) { //если строка содержит символы
                    setList.remove(i);
                    i--;
                }
            }
        }
        return setList;
    }

    public static Set setHumanId(Map<Integer, Human> map, Set set) {
        Set<Human> idSet = new HashSet<Human>();
        Iterator iteratorSet = set.iterator();
        List<Integer> longList = new ArrayList<Integer>(map.keySet());
        while (iteratorSet.hasNext()) {
            Integer bufSet = (Integer) iteratorSet.next();
            for (int i = 0; i < longList.size(); i++) {
                Integer it = longList.get(i);
                if ((bufSet.equals(it))) {
                    idSet.add(map.get(bufSet));
                }
            }
        }
        return idSet;
    }

    public static List yearHuman(Map<Integer, Human> map){                      //8.Возраст не менее 18
        List<Integer> listHuman = new ArrayList<Integer>();
        Iterator<Map.Entry<Integer, Human>> it = map.entrySet().iterator(); //возвращает набор, содержащий все значения отображения
        while (it.hasNext()){
            Map.Entry<Integer, Human> bufHuman = it.next();
            Integer id = Integer.parseInt(bufHuman.getValue().getYear());
            if (id >= 18){
                listHuman.add(bufHuman.getKey());
            }
        }
        return listHuman;
    }


}
