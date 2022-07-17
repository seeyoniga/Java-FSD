class job{
	int jid;
	String jdesig;

	job(int ji,String jd)
	{
	jid=ji;
	jdesig=jd;
	}

	void display() {
	System.out.println(jid+" "+jdesig);
	}
}
class parametrizedconstructor {
public static void main(String[] args) {

	job j1=new job(20010,"Sales executive");
	job j2=new job(20011,"Manager");
	j1.display();
	j2.display();
		}
}
