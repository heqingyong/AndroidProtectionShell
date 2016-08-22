package club.younge.jni;

public class Security {
	public native byte[] decrypt(byte[] data);   
	public native int add(int x, int y);
	public native void destroy();
}
