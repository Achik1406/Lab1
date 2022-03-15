package Exercise8;
import java.util.ArrayList;
import java.util.Iterator;
import Exercise7.WeightOnMars;

public class list {
 public list(){
  WeightOnMars w1 = new WeightOnMars(66);
  WeightOnMars w2 = new WeightOnMars(75);
  WeightOnMars w3 = new WeightOnMars(80);
  WeightOnMars w4 = new WeightOnMars(53);

  ArrayList<WeightOnMars> weightlist = new ArrayList<WeightOnMars>();

  weightlist.add(w1);
  weightlist.add(w2);
  weightlist.add(w3);
  weightlist.add(w4);

  Iterator<WeightOnMars> wIterate = weightlist.iterator();
  while (wIterate.hasNext()) {
	  wIterate.next().calculateWeight();
  }
 }
}