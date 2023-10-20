package PSG.Service1;

import PSG.DAO1.DetailsDAO1;

public class DetailsService {
	public void Select(int Id) {                 //Exception handle manually not doing bypassing
		try {
		DetailsDAO1 ds =new DetailsDAO1();
		ds.select(Id);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void Update(int Id, String name) throws Exception {
		DetailsDAO1 ds =new DetailsDAO1();
		ds.update(Id,name);
	}
	
	public void Insert(int Id,String name) throws Exception {
		DetailsDAO1 ds =new DetailsDAO1();
		ds.insert(Id,name);
	}
	
	public void Delete(int Id) throws Exception {
		DetailsDAO1 ds =new DetailsDAO1();
		ds.delete(Id);
	}

}
