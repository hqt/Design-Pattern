package gof.creational.singleton;

/**
 * One of best approach when implement Singleton Pattern
 * is using Enum
 * @author Huynh Quang Thao
 *
 */
public class EnumSolution {
	
	public static enum SearchBox {
		INSTANCE;
		// private attribute of this class
		private String searchWord = "";
		private String[] list = new String[]{"quang thao", "thu hoa"};
		
		// private constructor
		private SearchBox() {}

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
		SearchBox.INSTANCE.isContains("thao");
	}

}
