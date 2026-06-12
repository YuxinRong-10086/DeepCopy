import java.util.ArrayList;

    public class Student implements Cloneable {

    private String firstName;
    private String lastName;
    private Long studentId;
    private Address address;
    private ArrayList<String> classList;

        /**
        * Construct an Address object
        * @Param address1 first address line
        * @param address2 second address line
        * @param city city name
        * @param state state abbreviation
        * @param zipCode ZIP code
        * @throws CloneNotSupportedException if the address is not cloning 
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
        * @return second address line
        */
        public Address getAddress()
        throws CloneNotSupportedException {

            return address.clone();
        }

        /**
        * Returns deep copy of class list.
        * @return city name
        */
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
