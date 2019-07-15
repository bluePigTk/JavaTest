import java.util.*;

public class Tradition implements ListUtil{
    @Override
    public Map<Integer,Set> jisuan(List<Integer> list) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (Integer num:list) {
            int newNum = num / 10;
            List<Integer> lists=new ArrayList<>();
            if(map.get(newNum)!=null&&map.get(newNum).size()>0){
                 lists=map.get(newNum);
            }
            lists.add(num);
            map.put(newNum,lists);
        }
        //遍历map
        HashMap<Integer, Set> hashMap = new HashMap<>();
        for (Map.Entry<Integer,List<Integer>> entry:map.entrySet()) {
            Integer key = entry.getKey();
            HashSet<Object> set = new HashSet<>();
            for (Integer num:entry.getValue()) {
               //利用set的有序性
                set.add(num);
            }
            hashMap.put(key,set);
        }

        return hashMap;
    }
}
