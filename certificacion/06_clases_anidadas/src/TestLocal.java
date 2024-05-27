
public class TestLocal {
	int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void metodo() {
		x++;
		int a=1;
		class Local{
			void print() {
				System.out.println("local!! "+a);
				System.out.println("atributo!! "+x);
			}
		}
		Local l=new Local();
		l.print();
		//a++;
	}

}
