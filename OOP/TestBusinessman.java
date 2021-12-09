public class TestBusinessman {
	public static void main(String[] args) {

		Richman rm = new Businessman();
		rm.donation();
		
		SocialWorker sw = new Businessman();
		sw.helpToOthers();
		
		Businessman bm = new Businessman();
		bm.donation();
		bm.earnMoney();
		bm.helpToOthers();
	}
}
