public class PolyNode {
  int coefficient, power;
  PolyNode next = null;

  public PolyNode() {
  }

  public PolyNode(int x, int y) {
    this.coefficient = x;
    this.power = y;
  }

  public PolyNode(int x, int y, PolyNode next) {
    this.coefficient = x;
    this.power = y;
    this.next = next;
  }
}
