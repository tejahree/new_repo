package designpattern;

public class ClientServer {
public static void main(String[] args) throws Exception {
	DatabaseExecuter object=new DatabaseExecuteProxy("nonAdmin", "nonAdmin@gmail.com");
object.exexuteDatabase("Delet");
	DatabaseExecuter objectAdmin= new DatabaseExecuteProxy("Admin","Admin@123");
	objectAdmin.exexuteDatabase("Delet");
}
}
