public class Solution {
  public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
    if (poly1 == null) {
      return poly2;
    }

    if (poly2 == null) {
      return poly1;
    }

    PolyNode result = new PolyNode();
    if (poly1.power == poly2.power) {
      int coefficient = poly1.coefficient + poly2.coefficient;
      if (coefficient == 0) {
        return addPoly(poly1.next, poly2.next);
      }
      result.coefficient = coefficient;
      result.power = poly1.power;
      result.next = addPoly(poly1.next, poly2.next);
    } else if (poly1.power > poly2.power) {
      result.coefficient = poly1.coefficient;
      result.power = poly1.power;
      result.next = addPoly(poly1.next, poly2);
    } else {
      result.coefficient = poly2.coefficient;
      result.power = poly2.power;
      result.next = addPoly(poly1, poly2.next);
    }

    return result;
  }
}
