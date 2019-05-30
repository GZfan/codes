import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Backtracking91
 * @Description leetcode 17
 * @Author GZfan
 * @Date 19-5-30
 */
public class Backtracking91 {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> letter=new LinkedList<>();
        int len=digits.length();
        if(len>=1){
            letter.add("");
        }
        for (int i = 0; i < len; i++) {
            append(letter,digits.charAt(i));
        }
        return letter;
    }
    private static void append(LinkedList<String> letter,char character){
        int size=letter.size();
        String item;
        while (size!=0) {
            item = letter.remove();
            switch (character) {
                case '2': {
                    letter.add(item+"a");
                    letter.add(item+"b");
                    letter.add(item+"c");
                    break;
                }
                case '3':{
                    letter.add(item+"d");
                    letter.add(item+"e");
                    letter.add(item+"f");
                    break;
                }
                case '4':{
                    letter.add(item+"g");
                    letter.add(item+"h");
                    letter.add(item+"i");
                    break;
                }
                case '5':{
                    letter.add(item+"j");
                    letter.add(item+"k");
                    letter.add(item+"l");
                    break;
                }
                case '6':{
                    letter.add(item+"m");
                    letter.add(item+"n");
                    letter.add(item+"o");
                    break;
                }
                case '7':{
                    letter.add(item+"p");
                    letter.add(item+"q");
                    letter.add(item+"r");
                    letter.add(item+"s");
                    break;
                }
                case '8':{
                    letter.add(item+"t");
                    letter.add(item+"u");
                    letter.add(item+"v");
                    break;
                }
                case '9':{
                    letter.add(item+"w");
                    letter.add(item+"x");
                    letter.add(item+"y");
                    letter.add(item+"z");
                    break;
                }
                default:
            }
            size--;
        }
    }

}
