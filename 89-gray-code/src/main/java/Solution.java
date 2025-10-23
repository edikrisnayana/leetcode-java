import com.leetcode.common.ArrayUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Solution implements List<Integer> {
  private int[] arr;
  private int n;
  private int nextIndex = 0;
  private int prev;
  private int currBit;

  private int currLen;
  private int newLen;


  public List<Integer> grayCode(int n) {
    arr = new int[1 << n];
    this.n = n;
    arr[0] = 0;
    arr[1] = 1;

    currLen = 2;
    newLen = currLen * 2;
    prev = currLen - 1;
    currBit = 1;
    return this;
  }

  public void print() {
    Iterator<Integer> it = this.iterator();
    while (it.hasNext()) {
      it.next();
    }
    ArrayUtils.print(arr);
  }

  public int size() {
    return 1 << n;
  }

  public Iterator<Integer> iterator() {

    return new Iterator<>() {

      public boolean hasNext() {
        return nextIndex < arr.length;
      }

      public Integer next() {
        if (nextIndex < 2) {
          return arr[nextIndex++];
        }

        arr[nextIndex++] = arr[prev--] | 1 << currBit;
        int item = arr[nextIndex - 1];

        if (nextIndex == newLen) {
          currLen = newLen;
          prev = currLen - 1;
          newLen = currLen * 2;
          currBit++;
        }

        return item;
      }

    };
  }

  public boolean add(Integer e) {
    return true;
  }

  public Integer get(int i) {
    return arr[i];
  }

  public List<Integer> subList(int a, int b) {
    return null;
  }

  public ListIterator<Integer> listIterator() {
    return null;
  }

  public ListIterator<Integer> listIterator(int index) {
    return null;
  }

  public int lastIndexOf(Object e) {
    return 0;
  }

  public int indexOf(Object e) {
    return 0;
  }

  public Integer remove(int i) {
    return null;
  }

  public boolean contains(Object e) {
    return false;
  }

  public boolean containsAll(Collection<?> o) {
    return false;
  }

  public boolean isEmpty() {
    return false;
  }

  public boolean addAll(Collection<? extends Integer> o) {
    return false;
  }

  public void clear() {
  }

  public void add(int i, Integer e) {
  }

  public boolean remove(Object o) {
    return false;
  }

  public Integer set(int i, Integer e) {
    return null;
  }

  public boolean retainAll(Collection<?> o) {
    return false;
  }

  public boolean removeAll(Collection<?> o) {
    return false;
  }

  public boolean addAll(int i, Collection<? extends Integer> o) {
    return false;
  }

  public <T> T[] toArray(T[] a) {
    return (T[]) new Object[1];
  }

  public Object[] toArray() {
    return new Object[1];
  }
}