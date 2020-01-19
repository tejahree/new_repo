package designpattern;

public class DatabaseExecuteProxy implements DatabaseExecuter {
	boolean ifAdmin;
	DatabaseImplemets object;
	public DatabaseExecuteProxy(String username,String password){
		if(username=="Admin" && password=="Admin@123"){
			ifAdmin=true;
			object=new DatabaseImplemets();
		}
	}
	
	public void exexuteDatabase(String query) throws Exception {
		if(ifAdmin){
			object.exexuteDatabase(query);
		}else{
			if(query.equals("Delet")){
				throw new Exception("delet is not allowed for nonUser Admin");
			}else{
				object.exexuteDatabase(query);
			}
		}
		
	}

}
