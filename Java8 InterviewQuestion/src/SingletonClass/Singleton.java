package SingletonClass;

public class Singleton {
    // Static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    	System.out.println("Singleton class Constructor");
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create the instance if it doesn't exist
        }
        return instance;
    }
    public static void main(String[] args) {
		Singleton s= Singleton.getInstance();
		Singleton s1= Singleton.getInstance();
		System.out.println("hashcode s"+s.hashCode());
		System.out.println("hashcode s"+s1.hashCode());
		
	}
}