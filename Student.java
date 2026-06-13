import java.util.ArrayList;

    public class Student implements Cloneable {

    private String firstName;
    private String lastName;
    private Long studentId;
    private Address address;
    private ArrayList<String> classList;

        /**
        * Construct a student object
        * @param firstName student's first name
        * @param lastName student's last name
        * @param address student's address
        * @param studentId student's ID number
        * @throws CloneNotSupportedException if address cloning fails.
        */
        public Student(String firstName,String lastName,Address address,Long studentId) 
    
        throws CloneNotSupportedException{
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.address = new Address(address);
        this.classList = new ArrayList<>();
        
    }

        /**
        * Copy constructor.
        * @param other Address object to copy
        * @throws CloneNotSupportedException if cloning fails
        */
        public Student(Student other)
        throws CloneNotSupportedException {

        Student copy = other.clone();

        this.firstName = copy.firstName;
        this.lastName = copy.lastName;
        this.studentId = copy.studentId;
        this.address = new Address(other.address);
        this.classList = new ArrayList<>(other.classList);
        
        
        }
        /**
         * return the student's first name
         * @return first name
         */
        public String getFirstName() {
            return firstName;
        }
        /**
         * sets the student's first name
         * @param firstName new first name
         */
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        /**
         * return the student's last name
         * @return last name
         */
        public String getLastName() {
            return lastName;
        }
        /**
         * sets the student's last name
         * @param lastName new last name
         */
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        /**
         * Return the student's ID
         * @return studentId
         */
        public Long getStudentId() {
            return studentId;
        }
        /**
         * sets the student's Id
         * @param studentId
         */
        public void setStudentId(Long studentId) {
            this.studentId = studentId;
        }

        /**
        * Returns a deep copy of the address.
        * @return a copy of the address line
        * @throws CloneNotSupportedException if cloning fails
        */
        public Address getAddress()
        throws CloneNotSupportedException {

            return address.clone();
        }

        /**
        * Returns a copy of the class list.
        * @return copied class list
        public ArrayList<String> getClassList() {
            return new ArrayList<>(classList);
        }
        
        /**
        * Adds a class.
        * @param className name of the class to add
        */
        public void addClass(String className) {
            classList.add(className);
        }

        /**
        * Removes a class.
        * @param className name of class to remove
        * @throws ClassNotRegisteredException if the class is not found
        */
        public void removeClass(String className)
        throws ClassNotRegisteredException {

            if (!classList.remove(className)) {
        throw new ClassNotRegisteredException(className + " not found in class list.");
            }
        }
        /**
         * creates and returns a deep copy of this student
         * @return cloned student object
         * @throws cloneNotSupportedException if cloning is not supported
         */
        @Override
        public Student clone()
            throws CloneNotSupportedException {

        Student copy =(Student) super.clone();

        copy.address = new Address(this.address);

        copy.classList = new ArrayList<>(this.classList);

            return copy;
        }
        /**
         * returns a string representation of the student
         * @return formatted student information
         */
        @Override
        public String toString() {

            return "Student ID: " + studentId+ "\nName: "+ firstName + " "+ lastName+ "\nAddress:\n"+ address+ "\nClasses: "+ classList;
    }
}
