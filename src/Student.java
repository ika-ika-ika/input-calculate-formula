public class Student {
    String FirstName;
    String LastName;
    int GradYear;
    double GPA;
    String DeclaredMajor;

    public Student (String FirstName, String Lastname, int GradYear, double GPA, String DeclaredMajor){
        this.FirstName = FirstName;
        this.LastName = Lastname;
        this.GradYear = GradYear;
        this.GPA = GPA;
        this.DeclaredMajor = DeclaredMajor;
    }
    public int AddGradYear () {
       return (this.GradYear+1);

    }
}
