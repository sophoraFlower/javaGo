package code003;

class Screen {
    String producer;
    Float size;
}

class CPU {
    String producer;
    Float speed;
}

class Memory {
    String producer;
    int capacity;
}

class Storage {
    String producer;
    int capacity;
}

class Mainboard {
    CPU cpu;
    Memory memory;
    Storage storage;
    String model;
    short year;
}

public class Phone {

    boolean hasFigurePrintUnlocker;
    int price;
    Screen screen;
    Mainboard mainboard;
    Phone prePhone;

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.hasFigurePrintUnlocker = true;
        phone.price = 1999;
        phone.screen = new Screen();
        phone.screen.producer = "BOE";
        phone.screen.size = 56.8f;

        CPU cpu = new CPU();
        cpu.producer = "三星";
        cpu.speed = 3.5f;

        Memory memory = new Memory();
        memory.producer = "三星";
        memory.capacity = 4;

        Storage storage = new Storage();
        storage.producer = "Intel";
        storage.capacity = 128;

        phone.mainboard = new Mainboard();
        phone.mainboard.cpu = cpu;
        phone.mainboard.memory = memory;
        phone.mainboard.storage = storage;
        phone.mainboard.model = "EA888";
        phone.mainboard.year = 2019;

        phone.prePhone = new Phone();
    }

}
