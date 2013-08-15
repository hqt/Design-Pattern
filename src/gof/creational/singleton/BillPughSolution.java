package gof.creational.singleton;

import java.util.LinkedList;

public class BillPughSolution {

	public static class SearchBox {

		// private attribute of this class
		private String searchWord = "";
		private String[] list = new String[]{"quang thao", "thu hoa"};
		
		
		// using helper class for lazy loading. 
		// and this's recommend
		public static class Helper {
			public static SearchBox searchBox = new SearchBox();
		}
		
		// private constructor
		private SearchBox() {}
		
		// static method to get instance
		public static SearchBox getInstance() {
			return Helper.searchBox;
		}
		
		public boolean isContains(String searchWord) {
			for (int i = 0; i < list.length; i++) 
				if (list[i].indexOf(searchWord) >= 0) return true;
			return false;
		}
		
		public boolean isContains() {
			return isContains(searchWord);
		}
		
		static void nonTail(int i) {
			if (i > 0) {
				nonTail(i-1);
				System.out.print(i + ", ");
				nonTail(i-1);
			}
		}
		
		static void process(char c) {}
		
		public static void main(String[] args) {
			nonTail(3);
			Object o = new Integer(5);
			String s = (String) o;
		}
	}
}
