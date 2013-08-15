package gof.creational.singleton;

/**
 * purest form of singleton pattern
 * @author Huynh Quang Thao
 */
public class EagerInitialization {

	public static class SearchBox {
		private static volatile SearchBox searchBox = new SearchBox();
		
		// private attribute of this class
		private String searchWord = "";
		private String[] list = new String[]{"quang thao", "thu hoa"};
		
		// private constructor
		private SearchBox() {}
		
		// static method to get instance
		public static SearchBox getInstance() {
			return searchBox;
		}
		
		public boolean isContains(String searchWord) {
			for (int i = 0; i < list.length; i++) 
				if (list[i].indexOf(searchWord) >= 0) return true;
			return false;
		}
		
		public boolean isContains() {
			return isContains(searchWord);
		}
	}
	
	public static void main(String[] args) {
		// first. get instance by method get instance. cannot initialize
		SearchBox searchBox = SearchBox.getInstance();
		
		// use method as normal.
		System.out.printf("is contains: %s\n", searchBox.isContains("thao"));
	}
}
