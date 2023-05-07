import java.io.*;

public class FileCreate {
  // Private attributes
  private String name;

  // Public constructor with parameters
  public FileCreate(String name) {
    this.name = name;
  }

  // Method to provide read access to the private attribute
  public String getName() {
    return name;
  }

  // Methods to create the file
  public void createFile() {
    try {
      File file = new File(name);
      if (file.createNewFile()) {
        System.out.println(name + " created successfully");
      } else {
        System.out.println(name + " already exists");
      }
    } catch (IOException e) {
      System.out.println("Error creating file: " + name);
      e.printStackTrace();
    }
  }
}
