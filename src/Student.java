
public class Student {
  private int rating;
  private String name;
  private static int count = 0;
  private static double totalRating = 0;

  public Student(String name) {
    this.name = name;
    count++;
  }

  public Student(String name, int rating){
    this.name = name;
    count++;
    totalRating = totalRating + rating;
  }

  public static double getAvgRating() {
    double rating = 0;
    double allRating = totalRating;
    int numberOfStudents = count;
    if (numberOfStudents>0) {
      rating = allRating/count;
    }
    return rating;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    totalRating = totalRating + rating;
  }

  public boolean betterStudent(Student student) {
    int oldRating = getRating();
    int newRating = student.getRating();
    return oldRating >= newRating;
  }

  public void changeRating(int rating) {
    int oldRating = getRating();
    this.rating = rating;
    totalRating = totalRating - oldRating + rating;

  }

  public static void removeStudent(Student student) {
    count--;
    totalRating = totalRating - student.rating;
  }

  @Override
  public String toString() {
    return "Rating of " + name + " is " + Integer.toString(rating) ;
  }

  public static void main(String args[]){
    Student student1 = new Student("Petro");
    Student student2 = new Student("Volodko");
    Student student3 = new Student("Ivan");
    student1.setRating(3);
    student2.setRating(5);
    student3.setRating(8);
    System.out.println(getAvgRating());
    student1.changeRating(2);
    System.out.println(getAvgRating());


  }
}
