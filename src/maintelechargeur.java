public class maintelechargeur {
    public static void main(String[] args) {
        Thread t1= new Thread("video.mp4");
        t1.start();
        Thread t2= new Thread("image.jpg");
        t2.start();
        Thread t3= new Thread("doc.pdf");
        t3.start();
    }
}
