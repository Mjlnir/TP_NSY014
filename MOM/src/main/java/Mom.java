public class Mom {
	public static void main(String [] args) throws InterruptedException{
		thread(new Producer(),false);
                Thread.sleep(2000);
		thread(new Consumer(),false);
	}
	public static void thread(Runnable runnable, boolean daemon) {
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(daemon);
        brokerThread.start();
    }
}
