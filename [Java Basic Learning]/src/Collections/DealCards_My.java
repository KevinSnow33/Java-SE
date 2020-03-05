package Collections;

import java.util.*;

public class DealCards_My {
    public static void main(String[] args) {

        Map<Integer,String> cards = new HashMap<>();
        List cardNum = new ArrayList();

        String[] value = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] suit = {"♠","♥","♣","♦"};

        /*—————用map存牌并用一个list来索引牌——————*/
        for (int i = 0,num = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                cards.put(num,value[i]+suit[j]);
                cardNum.add(num++);
            }
        }
        cards.put(52, "blackJoker");
        cardNum.add(52);
        cards.put(53, "redJoker");
        cardNum.add(53);
//        System.out.println(cards);
//        System.out.println(cardNum);

        /*————————洗牌————————*/
        Collections.shuffle(cardNum);
//        for (int i = 0; i < 54; i++) {
//            System.out.println(cards.get(cardNum.get(i)));
//        }


        /*————————发牌————————*/
        Map<Integer,String> LiuYifei = new HashMap<>();
        Map<Integer,String> ZhangLiangying = new HashMap<>();
        Map<Integer,String> FanBingbing = new HashMap<>();
        Map<Integer,String> dipai = new HashMap<>();

        for (int i = 0; i < 54; i++) {
            if (i > 50){
                dipai.put((Integer)cardNum.get(i),cards.get(cardNum.get(i)));
            }
            else if (i%3 == 0){
                LiuYifei.put((Integer)cardNum.get(i),cards.get(cardNum.get(i)));
            }
            else if (i%3 == 1){
                ZhangLiangying.put((Integer)cardNum.get(i),cards.get(cardNum.get(i)));
            }
            else if (i%3 == 2){
                FanBingbing.put((Integer)cardNum.get(i),cards.get(cardNum.get(i)));
            }
        }

        /*————————看牌————————*/
        System.out.println("LiuYifei的牌为：");
        showCards(LiuYifei);
        System.out.println("ZhangLiangying的牌为：");
        showCards(ZhangLiangying);
        System.out.println("FanBingbing的牌为：");
        showCards(FanBingbing);
        System.out.println("底牌为：");
        showCards(dipai);



    }

    public static void showCards(Map person){
        Set s = person.keySet();
        List l = new ArrayList(s);
        Collections.sort(l);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(person.get(l.get(i)));

        }
    }
}
