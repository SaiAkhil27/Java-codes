public class BitMnp {

  public static int getB(int n, int i) {
    int bitMask = 1 << i;
    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  // set the ith bith 1
  public static int setB(int n, int i) {
    int bitMask = 1 << i;
    return n | bitMask;
  }

  public static int clrBit(int n, int i) {
    int bitMask = 1 << i;
    int notNum = ~(bitMask);
    return n & notNum;
  }

  public static int updateB(int n, int i, int newB) {
    if (newB == 0) {
      return clrBit(n, i);
    } else {
      return setB(n, i);
    }
  }

  public static int clearIth(int n, int i) {
    int bitMask = ~0 << i;
    return n & bitMask;
  }

  public static int clearRange(int n, int i, int j) {
    int a = ~0 << (j + 1);
    int b = (1 << i) - 1;
    int bitMask = a | b;
    return n & bitMask;
  }

  public static boolean Powerto(int n1) {
    return ((n1 & (n1 - 1)) == 0);
  }

  public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) != 0) {
        count++;
      }
      n = n >> 1;
    }
    return count;

  }

  public static void main(String[] args) {
    System.out.println(getB(5, 1));
    System.out.println(setB(10, 2));
    System.out.println(clrBit(10, 1));
    System.out.println(updateB(10, 1, 1));
    System.out.println(clearIth(15, 2));
    System.out.println(clearRange(10, 2, 4));

    System.out.println(Powerto(8));
    System.out.println(countSetBits(10));
  }

}
