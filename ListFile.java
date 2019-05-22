package com.chyx.test;

import java.io.File;
import java.util.Scanner;

//遍历某文件夹下的所有文件目录及文件 (文件夹从命令行输入)
public class ListFile {
	public static void main(String[] args) {
		File file = new File("F:\\英雄时刻");
		
		showFile(file);
	}
	
	/**
	 * 显示一个文件夹下所有文件或目录
	 * @param file
	 */
	private static void showFile(File file) {
		//显示该文件夹下面的所有文件或文件夹
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			System.out.println(f);
			if(f.isDirectory()) {
				showFile(f);
			}
		}
		
	}
	
	
}
