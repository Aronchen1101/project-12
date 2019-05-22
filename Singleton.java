package com.chyx.test;

//写一个满足Singleton模式的类出来。
public class Singleton {
	private static Singleton s = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return s;
	}
}
