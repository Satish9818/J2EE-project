package org.jsp.userapp.controller;


import org.jsp.userapp.dao.ProductDao;

import java.util.Scanner;
public class ProductController {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ProductDao dao = new ProductDao();
		System.out.println("Enter Your Choice");
		boolean flag = true;
		while (flag) {
			System.out.println("1.Save Product");
			System.out.println("2.Update Product");
			System.out.println("3.Find Product by ID");
			System.out.println("4.Delete Product by ID");
			System.out.println("3.Find Product by Brand");
			System.out.println("4.Find Product by Category");
			System.out.println("5.Filter Product by Cost");
			System.out.println("6.Filter Product by Brand");
			System.out.println("7.Filter Product by Category");
			System.out.println("8.Exit");
			switch (s.nextInt()) {
			
			case 1:{
				
			}
			}

	}

}
}