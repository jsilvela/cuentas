package org.silvela.cuentas;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Compute {

    public Map<String, Integer> pairBalance;
    public Map<String, Integer> individualBalance;

    public Compute() {
        pairBalance = new HashMap<String, Integer>();
        individualBalance = new HashMap<String, Integer>();        
    }

    public static void main(String[] args) {

        List<Owes> trans = new ArrayList<Owes>();

        trans.add(new Owes("gu",  "dm", 4500));
        trans.add(new Owes("ja", "dm", 4500));

        trans.add(new Owes("dm", "gu", 1189));
        trans.add(new Owes("fr", "gu", 1189));
        trans.add(new Owes("ja", "gu", 1189));
        trans.add(new Owes("jp", "gu", 1189));

        trans.add(new Owes("dm", "fr", 900));
        trans.add(new Owes("gu", "fr", 900));
        trans.add(new Owes("ja", "fr", 900));
        trans.add(new Owes("jp", "fr", 900));

        trans.add(new Owes("dm", "ja", 7000));
        trans.add(new Owes("fr", "ja", 7000));
        trans.add(new Owes("gu", "ja", 7000));
        trans.add(new Owes("jp", "ja", 7000));

        trans.add(new Owes("dm", "gu", 13627));
        trans.add(new Owes("fr", "gu", 13627));
        trans.add(new Owes("ja", "gu", 13627));
        trans.add(new Owes("jp", "gu", 13627));

        trans.add(new Owes("dm", "gu", 9552));
        trans.add(new Owes("fr", "gu", 9552));
        trans.add(new Owes("jp", "gu", 9552));

        trans.add(new Owes("dm", "fr", 1312));
        trans.add(new Owes("gu", "fr", 1312));
        trans.add(new Owes("ja", "fr", 1312));
        trans.add(new Owes("jp", "fr", 1312));

        trans.add(new Owes("dm", "gu", 2280));
        trans.add(new Owes("fr", "gu", 2280));
        trans.add(new Owes("ja", "gu", 2280));
        trans.add(new Owes("jp", "gu", 2280));

        trans.add(new Owes("dm", "ja", 2280));
        trans.add(new Owes("fr", "ja", 2280));
        trans.add(new Owes("gu", "ja", 2280));
        trans.add(new Owes("jp", "ja", 2280));

        trans.add(new Owes("dm", "jp", 1596));
        trans.add(new Owes("fr", "jp", 1596));
        trans.add(new Owes("gu", "jp", 1596));
        trans.add(new Owes("ja", "jp", 1596));

        trans.add(new Owes("dm", "fr", 600));
        trans.add(new Owes("gu", "fr", 600));
        trans.add(new Owes("ja", "fr", 600));
        trans.add(new Owes("jp", "fr", 600));

        trans.add(new Owes("dm", "fr", 2600));
        trans.add(new Owes("gu", "fr", 2600));
        trans.add(new Owes("ja", "fr", 2600));
        trans.add(new Owes("jp", "fr", 2600));

        trans.add(new Owes("dm", "fr", 2600));
        trans.add(new Owes("gu", "fr", 2600));
        trans.add(new Owes("ja", "fr", 2600));
        trans.add(new Owes("jp", "fr", 2600));

        trans.add(new Owes("dm", "gu", 850));
        trans.add(new Owes("fr", "gu", 850));
        trans.add(new Owes("ja", "gu", 850));
        trans.add(new Owes("jp", "gu", 850));

        trans.add(new Owes("dm", "fr", 400));
        trans.add(new Owes("gu", "fr", 400));
        trans.add(new Owes("ja", "fr", 400));
        trans.add(new Owes("jp", "fr", 400));

        trans.add(new Owes("dm", "fr", 1060));
        trans.add(new Owes("gu", "fr", 1060));
        trans.add(new Owes("ja", "fr", 1060));
        trans.add(new Owes("jp", "fr", 1060));

        trans.add(new Owes("dm", "fr", 1100));
        trans.add(new Owes("gu", "fr", 1100));
        trans.add(new Owes("ja", "fr", 1100));
        trans.add(new Owes("jp", "fr", 1100));

        trans.add(new Owes("dm", "jp", 300));
        trans.add(new Owes("gu", "jp", 300));
        trans.add(new Owes("fr", "jp", 300));
        trans.add(new Owes("ja", "jp", 300));

        trans.add(new Owes("dm", "jp", 547));
        trans.add(new Owes("fr", "jp", 547));
        trans.add(new Owes("gu", "jp", 547));
        trans.add(new Owes("ja", "jp", 547));

        trans.add(new Owes("dm", "fr", 3100));
        trans.add(new Owes("gu", "fr", 3100));
        trans.add(new Owes("ja", "fr", 3100));
        trans.add(new Owes("jp", "fr", 3100));

        trans.add(new Owes("dm", "jp", 5000));
        trans.add(new Owes("gu", "jp", 5000));
        trans.add(new Owes("fr", "jp", 5000));
        trans.add(new Owes("ja", "jp", 5000));

        trans.add(new Owes("fr", "dm", 1600));
        trans.add(new Owes("gu", "dm", 1600));
        trans.add(new Owes("ja", "dm", 1600));
        trans.add(new Owes("jp", "dm", 1600));

        trans.add(new Owes("dm", "ja", 5000));
        trans.add(new Owes("fr", "ja", 5000));
        trans.add(new Owes("gu", "ja", 5000));
        trans.add(new Owes("jp", "ja", 5000));

        trans.add(new Owes("dm", "jp", 1140));
        trans.add(new Owes("gu", "jp", 1140));
        trans.add(new Owes("fr", "jp", 1140));
        trans.add(new Owes("ja", "jp", 1140));

        trans.add(new Owes("fr", "dm", 1260));
        trans.add(new Owes("gu", "dm", 1260));
        trans.add(new Owes("ja", "dm", 1260));
        trans.add(new Owes("jp", "dm", 1260));

        trans.add(new Owes("dm", "ja", 6000));
        trans.add(new Owes("fr", "ja", 6000));
        trans.add(new Owes("gu", "ja", 6000));
        trans.add(new Owes("jp", "ja", 6000));

        trans.add(new Owes("dm", "gu", 8160));
        trans.add(new Owes("fr", "gu", 8160));
        trans.add(new Owes("ja", "gu", 8160));
        trans.add(new Owes("jp", "gu", 8160));

        trans.add(new Owes("fr", "dm", 3782));
        trans.add(new Owes("gu", "dm", 3782));
        trans.add(new Owes("ja", "dm", 3782));
        trans.add(new Owes("jp", "dm", 3782));

        trans.add(new Owes("fr", "dm", 570));
        trans.add(new Owes("gu", "dm", 570));
        trans.add(new Owes("ja", "dm", 570));
        trans.add(new Owes("jp", "dm", 570));

        trans.add(new Owes("dm", "jp", 700));
        trans.add(new Owes("fr", "jp", 700));
        trans.add(new Owes("gu", "jp", 700));
        trans.add(new Owes("ja", "jp", 700));

        trans.add(new Owes("dm", "jp", 2396));
        trans.add(new Owes("fr", "jp", 2396));
        trans.add(new Owes("gu", "jp", 2396));
        trans.add(new Owes("ja", "jp", 2396));

        trans.add(new Owes("fr", "jp", 950));
        trans.add(new Owes("gu", "jp", 950));
        trans.add(new Owes("ja", "jp", 950));

        trans.add(new Owes("fr", "dm", 5800));
        trans.add(new Owes("gu", "dm", 5800));
        trans.add(new Owes("ja", "dm", 5800));
        trans.add(new Owes("jp", "dm", 5800));

        Compute cp = new Compute();
        cp.balance(trans);
    }

    public void balance(List<Owes> trans) {

        for (Owes t : trans) {
            System.out.println("Found transaction: " + t);
            String key = t.getFrom() + "-" + t.getTo();
            if (!pairBalance.containsKey(key)) {
                pairBalance.put(key, Integer.valueOf(0));
            }

            int newValue = pairBalance.get(key).intValue() + t.getAmount();
            pairBalance.put(key, Integer.valueOf(newValue));

            // do individual balances
            if (!individualBalance.containsKey(t.getFrom())) {
                individualBalance.put(t.getFrom(), Integer.valueOf(0));
            }
            if (!individualBalance.containsKey(t.getTo())) {
                individualBalance.put(t.getTo(), Integer.valueOf(0));
            }

            int fromValue = individualBalance.get(t.getFrom()).intValue() + t.getAmount();
            int toValue = individualBalance.get(t.getTo()).intValue() - t.getAmount();
            individualBalance.put(t.getFrom(), Integer.valueOf(fromValue));
            individualBalance.put(t.getTo(), Integer.valueOf(toValue));
        }

        for (String key : pairBalance.keySet()) {
            System.out.println("Balance: "
                               + key
                               + " " 
                               + pairBalance.get(key));
        }

        for (String person : individualBalance.keySet()) {
            System.out.println(person + " owes: " + individualBalance.get(person));
        }
    }
}
