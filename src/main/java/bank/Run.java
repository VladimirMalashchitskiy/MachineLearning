package bank;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {
        /**
         * created example order with label
         */
        ArrayList<Bid> bids = new ArrayList<>();
        Person vladimir = new Person("Gleb", 24, 90000);
        Bid bid = new Bid(vladimir);
        bid.setState(true);

        bids.add(bid);
        Memory memory = new Memory(bids);

        /** на рассмотрении
         Person vlad = new Person("Vlad", 24, 83000);
         Bid bid1 = new Bid(vlad);
         memory.checkStateOrder(bid1);
         */

        /** отклонена
         Person mark = new Person("Vladimir", 24, 75000);
         Bid bid3 = new Bid(mark);
         memory.checkStateOrder(bid3);
         */


        new Manager(memory);

    }
}
