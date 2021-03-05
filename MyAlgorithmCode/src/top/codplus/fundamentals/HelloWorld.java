package top.codplus.fundamentals;

/**
 * 《算法》第四版的第一个程序，测试StdOut和StdIn
 * @author DELL
 *
 */
import edu.princeton.cs.algs4.*;

public class HelloWorld {
	public static void main(String[] args) {
		StdOut.println("Hello World!");
		double a = StdIn.readDouble();
		StdOut.println(a);
	}
}
