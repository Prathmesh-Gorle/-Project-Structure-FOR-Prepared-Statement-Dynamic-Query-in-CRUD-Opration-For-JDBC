package PSG.Controller;

import PSG.Service1.DetailsService;

public class DetailsController {
	public static void main(String[] args) {
		
		try {
			DetailsService dc =new DetailsService();
			dc.Select(4);
			//dc.Update(2, "Nagesh");
			//dc.Insert(7, "Kamlesh");
			dc.Delete(2);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
