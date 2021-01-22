package bank;


public class Manager {
    private final Memory memory;

    Manager(Memory memory) {
        this.memory = memory;
        checkMemory();
    }

    private void checkMemory() {
        if (memory.getOrderManager().size() > 0) System.out.println(memory.getOrderManager());
    }

    public Memory getMemory() {
        return memory;
    }
}
