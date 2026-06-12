public class Address implements Cloneable {

    private String address1;
    private String address2;
    private String city;
    private State state;
    private String zipCode;

    /**
        * Construct an Address object
        * @Param address1 first address line
        * @param address2 second address line
        * @param city city name
        * @param state state abbreviation
        * @param zipCode ZIP code
        */
    public Address(String address1, String address2,String city, State state,String zipCode) {

            this.address1 = address1;
            this.address2 = address2;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        /**
        * Copy constructor.
        * @param otheer Address object to copy
        * @throws CloneNotSupportedException if cloning fails
        */
        public Address(Address other)
        
        throws CloneNotSupportedException {

        Address copy = other.clone();

        this.address1 = copy.address1;
        this.address2 = copy.address2;
        this.city = copy.city;
        this.state = copy.state;
        this.zipCode = copy.zipCode;
        }

        public String getAddress1() {
            return address1;
        }

        public void setAddress1(String address1) {
            this.address1 = address1;
        }

        public String getAddress2() {
            return address2;
        }

        public void setAddress2(String address2) {
            this.address2 = address2;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        @Override
        public Address clone()
        throws CloneNotSupportedException {

            return (Address) super.clone();
        }

        @Override
        public String toString() {
            return address1 + "\n"+ address2 + "\n"+ city + ", "+ state + " "+ zipCode;
    }
}
