import java.io.*;

public class FileWrite {
  // Private attributes
  private String name;
  private String data;

  // Public constructor with parameters.
  public FileWrite(String name, String data) {
    this.name = name;
    this.data = data;
  }

  // Method to grant access to the private attribute name.
  public String getName() {
    return name;
  }

  // Method to grant access to the private attribute data.
  public String getData() {
    return data;
  }

  // Method to write to file.
  public void writeFile() {
    try {
      FileWriter file = new FileWriter(name, true);
      file.write(data);
      file.close();
      System.out.println("\nSuccessfully saved to the file.");
    } catch (IOException e) {
      System.out.println("Error with file: " + name);
      e.printStackTrace();
    }
  }
}