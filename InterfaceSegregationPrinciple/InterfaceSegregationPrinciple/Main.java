package InterfaceSegregationPrinciple;
public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();


        System.out.println();

        System.out.println("Basic Phone:");
        basicPhone.makeCalls("09677445447");
        basicPhone.sendSMS("09677445448", "Hello");
        
        System.out.println();

        System.out.println("Samsung:");
        samsung.makeCalls("09677445448");
        samsung.sendSMS("09677445447", "Are you okay?");
        samsung.browseWeb("github.com");
        samsung.takePicture();

        System.out.println();

        System.out.println("Iphone:");
        iphone.makeCalls("09677445449");
        iphone.sendSMS("09677445459", "Let's Play");
        iphone.browseWeb("stackoverflow.com");
        iphone.takePicture();
    
    }
}
