package SingletonClass;
public class ThreadSafeSinglton {
	
	private ThreadSafeSinglton()
	{
		System.out.println("Threadsafe constructor");
	}
	
	private static ThreadSafeSinglton instance;
	
	private synchronized static ThreadSafeSinglton getInstance() {
		if(instance==null) {
			instance=new ThreadSafeSinglton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafeSinglton th=new ThreadSafeSinglton();
	

	}

}
