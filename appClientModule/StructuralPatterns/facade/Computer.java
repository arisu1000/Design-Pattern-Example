package StructuralPatterns.facade;

//Facade(퍼사드)
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
    	
    	//의미없이 테스트 용도로 선언한 변수들
    	long BOOT_ADDRESS = 1024;
    	long BOOT_SECTOR = 1024;
    	int SECTOR_SIZE = 10;
    	
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
