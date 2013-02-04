package StructuralPatterns.proxy;

//System A
public class RealImage implements Image {
	private String filename = null;
    /**
     * 생성자
     * @param FILENAME
     */
    public RealImage(final String FILENAME) { 
        filename = FILENAME;
        loadImageFromDisk();
    }
 
    /**
     * 디스크에서 이미지를 로드함.
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
 
    /**
     * 이미지를 보여줌.
     */
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }

}
