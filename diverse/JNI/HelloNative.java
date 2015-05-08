class HelloNative {
	static {
		System.loadLibrary("HelloNative");
	}

	private native static void nativeHello();

	private native int nativeMethod();

	private native static int adder(int a, int b);

	public static void main(String[] args) {
		nativeHello();
		System.out.println(new HelloNative().nativeMethod());
		System.out.println(adder(3, 4));
	}
}