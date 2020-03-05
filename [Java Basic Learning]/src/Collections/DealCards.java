package Collections;

import java.util.*;

public class DealCards {
    public static void main(String[] args) {

        Map<Integer,String> cards = new HashMap<>();
        List cardNum = new ArrayList();

        String[] value = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] suit = {"♠","♥","♣","♦"};

        /*—————用map存牌并用一个list来索引牌——————*/
        int num = 0;
        for (String val : value) {
            for (String sui : suit) {
                String card = val + sui;
                cards.put(num,card);
                cardNum.add(num++);
            }
        }

        cards.put(num, "blackJoker");
        cardNum.add(num++);
        cards.put(num, "redJoker");
        cardNum.add(num++);
//        System.out.println(cards);
//        System.out.println(cardNum);

        /*————————洗牌————————*/
        Collections.shuffle(cardNum);        //直接打印cardNum对象即可，不用for遍历
//        System.out.println(cardNum);
//        for (int i = 0; i < 54; i++) {     //直接打印cardNum对象即可，不用for遍历
//            System.out.println(cards.get(cardNum.get(i)));
//        }

        /*————————发牌————————*/
        List<Integer> LiuYifei = new ArrayList<>();     //用List而非Map，因为发牌只用发编号即可
        List<Integer> ZhangLiangying = new ArrayList<>();
        List<Integer> FanBingbing = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
//        Map<Integer,String> ZhangLiangying = new HashMap<>();
//        Map<Integer,String> FanBingbing = new HashMap<>();
//        Map<Integer,String> dipai = new HashMap<>();

        for (int i = 0; i < cardNum.size(); i++) {      //发牌（具体String）变成发编号（Key）
           //获取编号
            Integer num0 = (Integer) cardNum.get(i);   //List.get返回值为泛型，所以要么定义时加Integer泛型限制，要么强制类型转换
            if (i > 50){
                dipai.add(num0);
            }
            else if (i%3 == 0){
                LiuYifei.add(num0);
            }
            else if (i%3 == 1){
                ZhangLiangying.add(num0);
            }
            else if (i%3 == 2){
                FanBingbing.add(num0);
            }
        }

        /*————————看牌————————*/
//        System.out.println("LiuYifei的牌为：" + LiuYifei);
//        System.out.println("ZhangLiangying：" + ZhangLiangying);
//        System.out.println("FanBingbing：" + FanBingbing);
//        System.out.println("底牌为：" + dipai);

        System.out.println("LiuYifei的牌为：" + showCards(LiuYifei,cards));
        System.out.println("ZhangLiangying：" + showCards(ZhangLiangying,cards));
        System.out.println("FanBingbing：" + showCards(FanBingbing,cards));

//        System.out.println("LiuYifei的牌为：");
//        showCards(LiuYifei);
//        System.out.println("ZhangLiangying的牌为：");
//        showCards(ZhangLiangying);
//        System.out.println("FanBingbing的牌为：");
//        showCards(FanBingbing);
//        System.out.println("底牌为：");
//        showCards(dipai);
    }



    public static String showCards(List<Integer> num, Map cards) {
        //升序排列
        Collections.sort(num);
        //用StringBuider将牌（字符串）拼接起来
        StringBuilder sb = new StringBuilder();
        //遍历编号
        for (Integer num0 : num) {     //增强for遍历List
            sb.append(cards.get(num0));   //append添加字符
            sb.append(" ");     //牌间空格
        }
        //StringBuilder转回String
        String str = sb.toString();
        //返回去掉结尾空格的String
        return str.trim();
    }

//    public static void showCards(Map person){
//        Set s = person.keySet();
//        List l = new ArrayList(s);
//        Collections.sort(l);
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(person.get(l.get(i)));
//
//        }
//    }
}

