package StructuralPatterns.proxy;

//System A
public class RealImage implements Image {
	private String filename = null;
    /**
     * ������
     * @param FILENAME
     */
    public RealImage(final String FILENAME) { 
        filename = FILENAME;
        loadImageFromDisk();
    }
 
    /**
     * ��ũ���� �̹����� �ε���.
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
 
    /**
     * �̹����� ������.
     */
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }

}
