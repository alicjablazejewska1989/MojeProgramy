public class Person {
        private String name;
        private String surname;
        private String address;

        public Person(String name, String surname, String address) {
                this.name = name;
                this.surname = surname;
                this.address = address;
        }

        public String getName() {
                return name;
        }

        public String getSurname() {
                return surname;
        }

        public String getaddress() {
                return address;
        }
}