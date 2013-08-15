package gof.creational.singleton;

public class LazyInitialization {

	public static class SearchBox {
		private static volatile SearchBox searchBox;
		
		// private attribute of this class
		private String searchWord = "";
		private String[] list = new String[]{"quang thao", "thu hoa"};
		
		// private constructor
		private SearchBox() {}
		
		// static method to get instance
		public static SearchBox getInstance() {
			if (searchBox == null) {
				synchronized (SearchBox.class) {
					searchBox = new SearchBox();
				}
			}
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
	
}
