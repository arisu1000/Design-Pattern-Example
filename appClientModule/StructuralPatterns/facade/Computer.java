package StructuralPatterns.facade;

//Facade(�ۻ��)
public class Computer {
	private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
 
    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
 
    public void startComputer() {
    	
    	//�ǹ̾��� �׽�Ʈ �뵵�� ������ ������
    	long BOOT_ADDRESS = 1024;
    	long BOOT_SECTOR = 1024;
    	int SECTOR_SIZE = 10;
    	
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
