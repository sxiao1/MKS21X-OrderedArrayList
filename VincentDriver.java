public class VincentDriver{
  public static void main(String[] args) {
    // NoNullArrayList

    NoNullArrayList<String> noNulls = new NoNullArrayList<>();
    System.out.println("NoNullArrayList testing!");
    System.out.println();
    noNulls.add("Somebody");
    noNulls.add("once");
    noNulls.add("told");
    noNulls.add("me");
    noNulls.add("the");
    noNulls.add("world");
    noNulls.add("was");
    noNulls.add("gonna");
    noNulls.add("roll");
    noNulls.add("me");
    System.out.print("Testing add function (should print first line of \'All Star\' in a list): ");
    System.out.println(noNulls);
    System.out.println("Attempting to add null, both methods (should error twice)");
    try {
      noNulls.add(null);
    } catch(IllegalArgumentException e) {
      System.out.println("Error: attempted to add null to list.");
    }
    try {
      noNulls.add(3, null);
    } catch(IllegalArgumentException e) {
      System.out.println("Error: attempted to add null to list.");
    }
    System.out.println("----------");

    String[] lyrics = {"And", "the", "years", "start", "coming", "and", "they", "don't", "stop", "coming"};
    for(int i = 0; i < 10; i++) {
      noNulls.set(i, lyrics[i]);
    }
    System.out.println("Testing set function (should print "+noNulls+")");
    System.out.println(noNulls);
    System.out.println("Attempting to set null (should error once)");
    try {
      noNulls.set(3, null);
    } catch(IllegalArgumentException e) {
      System.out.println("Error: attempted to add null to list.");
    }

    System.out.println("----------");
    System.out.println();
    System.out.println("OrderedArrayList testing!");
    System.out.println();

    System.out.println("Adding 10 numbers in reverse order to OrderedArrayList ints:");
    OrderedArrayList<Integer> ints = new OrderedArrayList<>(10);
    for(int i = 0; i < 10; i++) {
      int prInt = (9 - i);
      Integer j = new Integer((prInt));
      ints.add(j);
    }
    System.out.print("Ints (should be 0-9 in ascending order): ");
    System.out.println(ints);
    System.out.println("----------");

    System.out.println("Adding 10 more numbers to index 0:");
    for(int i = 10; i < 20; i++) {
      Integer j = new Integer(i);
      ints.add(0, j);
    }
    System.out.print("Ints (should be 0-19 in ascending order): ");
    System.out.println(ints);
    System.out.println("----------");

    System.out.println("Setting ints 20-29 (in a weird way) in list nums:");
    for(int i = 0; i < 10; i++) {
      int j = i + 20;
      Integer k = new Integer(j);
      ints.set(i, k);
      System.out.println(ints);
    }
    System.out.print("Ints (should print [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]): ");
    System.out.println(ints);
    System.out.println("----------");
  }
}
