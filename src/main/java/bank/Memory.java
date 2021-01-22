package bank;

import java.util.ArrayList;

public class Memory {
    private final ArrayList<Bid> successOrders = new ArrayList<>();
    private final ArrayList<Bid> orderManager = new ArrayList<>();
    private double sum = 0.0;

    Memory(ArrayList<Bid> bid) {
        sum = bid.stream().mapToDouble(Bid::hashCode).sum();
        successOrders.addAll(bid);
    }

    public void checkStateOrder(Bid currentBid) {
        double average = sum / successOrders.size();
        double currentValue = currentBid.hashCode();

        if (currentValue > average * 0.93) {
            sum += currentBid.hashCode();
            successOrders.add(currentBid);
            System.out.println("Заявка одобрена");

        } else if (currentValue > average * 0.90) {
            orderManager.add(currentBid);
            System.out.println("Заявка в рассмотрении");

        } else System.out.println("Заявка отклонена");
    }

    public ArrayList<Bid> getOrderManager() {
        return orderManager;
    }
}
