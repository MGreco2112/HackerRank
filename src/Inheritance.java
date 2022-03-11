public class Inheritance {

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }


    class Student extends Person{
        private int[] testScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here

        public Student(String firstName, String lastName, int id, int[] scores) {
            super(firstName, lastName, id);

            testScores = scores;
        }

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here

        public char calculate() {
            int currentAverage = 0;

            for (Integer score : testScores) {
                currentAverage += score;
            }

            currentAverage = currentAverage / testScores.length;

            if (currentAverage >= 90 && currentAverage <= 100) {
                return 'O';
            } else if (currentAverage >= 80 && currentAverage < 90) {
                return 'E';
            } else if (currentAverage >= 70 && currentAverage < 80) {
                return 'A';
            } else if (currentAverage >= 55 && currentAverage < 70) {
                return 'P';
            } else if (currentAverage >= 40 && currentAverage < 55) {
                return 'D';
            } else {
                return 'T';
            }

        }
    }
}