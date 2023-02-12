package ait.course.example;

import org.apache.commons.lang3.StringUtils;

public class Application {
  public int CountWords(String words) {
    String[] separateWords = StringUtils.split(words, ' ');
    return (separateWords == null) ? 0 : separateWords.length;
  }

  public Application() {
    System.out.println("Inside Application");
  }

  // method main(): ALWAYS the APPLICATION entry point
  public static void main(final String[] args) {
    System.out.println("Starting Application");
    Application app = new Application();
    int count = app.CountWords("I have four words");
    System.out.println("Word count: " + count);
  }
}