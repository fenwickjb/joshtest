public class Hello {
  public static void main(String[] args) {
    A();
    B();
    C();
  }
  private static void A() {
      System.out.println("I modified A.");
  }
  private static void B() {
      System.out.println("User2 modified B.");
  }
    private static void C() {
	System.out.println( (new C()).print() );
    }
}
