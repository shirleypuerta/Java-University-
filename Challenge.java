public class Challenge {
    public static void main(String[] args) {
        String firstName = "Shirley";
        String lastName = "Puerta";

        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = lastName.charAt(0);

        char[][] initialsMatrix = {
            {' ', firstNameInitial, firstNameInitial, firstNameInitial, ' ', ' ', lastNameInitial, lastNameInitial, lastNameInitial, lastNameInitial,' '},
            {firstNameInitial, ' ', ' ', ' ', firstNameInitial,' ' , lastNameInitial, ' ', ' ', ' ',lastNameInitial},
            {firstNameInitial, ' ', ' ', ' ', ' ',' ' , lastNameInitial, ' ', ' ', ' ',lastNameInitial},
            {' ', firstNameInitial, firstNameInitial, firstNameInitial, ' ',' ' , lastNameInitial, lastNameInitial, lastNameInitial, lastNameInitial,' '},
            {' ', ' ', ' ', ' ', firstNameInitial,' ' , lastNameInitial, ' ', ' ', ' ',' '},
            {firstNameInitial, ' ', ' ', ' ', firstNameInitial,' ' , lastNameInitial, ' ', ' ', ' ',' '},
            {' ', firstNameInitial, firstNameInitial, firstNameInitial, ' ', ' ', lastNameInitial, ' ', ' ', ' ',' '}
        };

        printMatrix(initialsMatrix);
    }

    public static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}