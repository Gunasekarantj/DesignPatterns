package DesignPatterns.CreationalPattern.AbstractFactoryPattern;

import java.io.*;
import java.util.*;

public class AbstractFactoryPatternExample {

  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer out = new StringBuffer();

    int T = in.nextInt();

    OUTER:
    while (T-- > 0) {

      int n = in.nextInt();

      HashMap<Integer, Integer> map = new HashMap<>();
      ArrayDeque<Integer> stack = new ArrayDeque<>();
      for (int i = 0; i < n; i++) {
        int item = in.nextInt();
        stack.addLast(item);
        map.put(item, map.getOrDefault(item, 0) + 1);
      }

      for (int value : map.values()) {
        if (value % 2 == 1) {
          out.append("-1\n");
          continue OUTER;
        }
      }

      int size = 0, op = 0;
      StringBuffer ans = new StringBuffer();
      ArrayDeque<Integer> list = new ArrayDeque<>();
      while (!stack.isEmpty()) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        while (queue.isEmpty()
            || queue.size() == 1
            || !queue.peekFirst().equals(queue.peekLast())) {
          queue.add(stack.pop());
          size += 1;
        }

        //                println(queue.toString());
        queue.pollFirst();
        queue.pollLast();
        while (!queue.isEmpty()) {
          int poll = queue.pollFirst();

          op += 1;
          ans.append(size).append(" ").append(poll).append("\n");

          stack.push(poll);
          size += 1;
        }
        list.add(size);
        //                println(stack.toString());
      }

      out.append(op).append("\n").append(ans).append(list.size()).append("\n");
      int last = 0;
      for (int item : list) {
        out.append(item - last).append(" ");
        last = item;
      }
      out.append("\n");
    }

    System.out.print(out);
  }

  private static long gcd(long a, long b) {
    if (a == 0) return b;
    return gcd(b % a, a);
  }

  private static int toInt(String s) {
    return Integer.parseInt(s);
  }

  private static long toLong(String s) {
    return Long.parseLong(s);
  }

  private static void print(String s) {
    System.out.print(s);
  }

  private static void println(String s) {
    System.out.println(s);
  }
}
