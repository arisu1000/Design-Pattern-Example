package StructuralPatterns.proxy;

//시스템 B
public class ProxyImage implements Image {
	private RealImage image = null;
    private String filename = null;
    /**
     * 생성자
     * @param FILENAME
     */
    public ProxyImage(final String FILENAME) { 
        filename = FILENAME; 
    }
 
    /**
     * 이미지를 보여줌
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }

}
