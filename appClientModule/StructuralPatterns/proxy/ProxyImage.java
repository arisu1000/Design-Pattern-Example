package StructuralPatterns.proxy;

//�ý��� B
public class ProxyImage implements Image {
	private RealImage image = null;
    private String filename = null;
    /**
     * ������
     * @param FILENAME
     */
    public ProxyImage(final String FILENAME) { 
        filename = FILENAME; 
    }
 
    /**
     * �̹����� ������
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }

}
