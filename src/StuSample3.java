
class StuSample3 {
	public static void main(String[] args) {
		Student3 stu1 = new Student3("菅原");
		Student3 stu2 = new Student3("村山", 75, 100);
		// Student3 stu2 = new Student3();
		// 自身でコンストラクタを作成した場合にはそのコンストラクタに対応した引数を指定しなければエラーになる
		// 上記は引数なしのコンストラクタを作成することで回避可
		
		stu1.setScore(90, 80);
		stu1.display();
		stu2.display();
	}
}
