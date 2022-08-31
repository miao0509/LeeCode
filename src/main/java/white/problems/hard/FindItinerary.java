package white.problems.hard;

import java.util.ArrayList;
import java.util.List;

public class FindItinerary {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        List<String> three = new ArrayList<>();
        List<String> four = new ArrayList<>();
        List<String> five = new ArrayList<>();
       /* one.add("JFK");
        one.add("ATL");
        two.add("JFK");
        two.add("SFO");
        three.add("SFO");
        three.add("ATL");
        four.add("ATL");
        four.add("JFK");
        five.add("ATL");
        five.add("SFO");*/
       one.add("muc");
       one.add("lhr");
       two.add("jfk");
       two.add("muc");
       three.add("sfo");
       three.add("sjc");
       four.add("lhr");
       four.add("sfo");

        List<List<String>> tickets=new ArrayList<>();
       tickets.add(one);
        tickets.add(two);
        tickets.add(three);
        tickets.add(four);
//        tickets.add(five);

        System.out.println(tickets);
        FindItinerary find = new FindItinerary();
        List<String> itinerary = find.findItinerary(tickets);
        System.out.println(itinerary);
    }
    List<String> path = new ArrayList<>();
    List<String> min = null;

    public List<String> findItinerary(List<List<String>> tickets) {
        boolean[] use =new boolean[tickets.size()];
        backTracking(tickets,use,"");
        return min;
    }

    public void backTracking(List<List<String>> tickets,boolean[] use,String end){
        if (path.size()==tickets.size()){
            path.add(end);
            if (min==null){
                min= new ArrayList<>(path);
            }else {//比较两个答案哪个字典序小
                boolean flag= true;//path 是否比min小
                for (int i = 0; i < path.size(); i++) {
                    if (!false) break;
                    for (int j = 0; j < path.get(i).length(); j++) {
                        if (path.get(i).charAt(j)>=min.get(i).charAt(j)){
                            return;
                        }else {
                            min =  new ArrayList<>(path);
                        }
                    }
                }
            }
            path.remove(path.size()-1);
            return;
        }
        for (int i = 0; i <tickets.size() ; i++) {
            String from = tickets.get(i).get(0);
            String to = tickets.get(i).get(1);
            if (path.size()==0){
                path.add(from);
                use[i]=true;
                backTracking(tickets,use,to);
                use[i] = false;
                path.remove(path.size()-1);
            }

            if (use[i] == false&&from ==end){
                path.add(from);
                use[i]=true;
                backTracking(tickets,use,to);
                use[i] = false;
                path.remove(path.size()-1);
            }
        }
    }

}

