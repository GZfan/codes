import java.util.*;

/**
 * @ClassName Array77
 * @Description leetcode 49
 * @Author GZfan
 * @Date 19-5-23
 */
public class Array77 {
    public List<List<String>> groupAnagrams(String[] strs) {
        int index=0;
        List<List<String>> answer=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>(strs.length/2);
        for(String str:strs){
            char[] character=str.toCharArray();
            Arrays.sort(character);
            String temp=new String(character);
            if(map.containsKey(temp)){
                answer.get(map.get(temp)).add(str);
            } else {
                List<String> item=new ArrayList<>();
                item.add(str);
                answer.add(item);
                map.put(temp,index);
                index++;
            }
        }
        return answer;
    }
}
