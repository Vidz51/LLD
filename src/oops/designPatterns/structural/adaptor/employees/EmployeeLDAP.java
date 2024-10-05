package oops.designPatterns.structural.adaptor.employees;

public class EmployeeLDAP {

        private String cn;
        private String surname;
        private String givenName;
        private String mail;

        public EmployeeLDAP(String cn, String surname, String givenName, String mail) {
            this.cn = cn;
            this.surname = surname;
            this.givenName = givenName;
            this.mail = mail;
        }

        public String getCn() {
            return cn;
        }
        public void setCn(String cn) {
            this.cn = cn;
        }
        public String getSurname() {
            return surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }
        public String getGivenName() {
            return givenName;
        }
        public void setGivenName(String givenName) {
            this.givenName = givenName;
        }
        public String getMail() {
            return mail;
        }
        public void setMail(String mail) {
            this.mail = mail;
        }

}
