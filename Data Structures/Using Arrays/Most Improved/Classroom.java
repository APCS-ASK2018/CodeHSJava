public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getMostImprovedStudent()
    {
        // Fill in this method.
        int maxIndex = 0;
        int prevRange = 0;
        for(int i = 0 ; i<students.length; i++) {
            if(students[i] == null)
                break;
            int range = students[i].getExamRange();
            if(range > prevRange) {
                prevRange = range;
                maxIndex = i;
            }
        }
        return students[maxIndex];
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
