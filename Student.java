import java.util.ArrayList;

    public class Student implements Cloneable {

    private String firstName;
    private String lastName;
    private Long studentId;
    private Address address;
    private ArrayList<String> classList;

        /**
        * Constructor.
        */
        public Student(String firstName,String lastName,Address address,Long studentId) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.studentId = studentId;
        this.classList = new ArrayList<>();
    }

        /**
        * Copy constructor.
        */
        public Student(Student other)
        throws CloneNotSupportedException {

        Student copy = other.clone();

        this.firstName = copy.firstName;
        this.lastName = copy.lastName;
        this.studentId = copy.studentId;
        this.address = copy.address;
        this.classList = copy.classList;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Long getStudentId() {
            return studentId;
        }

        public void setStudentId(Long studentId) {
            this.studentId = studentId;
        }

        /**
        * Returns deep copy of address.
        */
        public Address getAddress()
        throws CloneNotSupportedException {

            return address.clone();
        }

        /**
        * Returns deep copy of class list.
        */
        public ArrayList<String> getClassList() {
            return new ArrayList<>(classList);
        }
        
        /**
        * Adds a class.
        */
        public void addClass(String className) {
            classList.add(className);
        }

        /**
        * Removes a class.
        */
        public void removeClass(String className)
        throws ClassNotRegisteredException {

            if (!classList.remove(className)) {
        throw new ClassNotRegisteredException(className + " not found in class list.");
            }
        }

        @Override
        public Student clone()
            throws CloneNotSupportedException {

        Student copy =(Student) super.clone();

        copy.address = new Address(this.address);

        copy.classList = new ArrayList<>(this.classList);

            return copy;
        }

        @Override
        public String toString() {

            return "Student ID: " + studentId+ "\nName: "+ firstName + " "+ lastName+ "\nAddress:\n"+ address+ "\nClasses: "+ classList;
    }
}
