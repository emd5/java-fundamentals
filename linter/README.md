# Maps, File I/O, and Testing

Write a method that reads a JavaScript file with a given Path, and prints an error whenever it finds a line that doesn’t end in a semi-colon.

## Author

Liz Mahoney


## Feature Task

- Read through the file line by line. Print an error message such as "Line 3: Missing semicolon." if a line is missing
 a semicolon.

    - Don’t show an error if the line is empty.
    - Don’t show an error if the line ends with an opening curly brace {
    - Don’t show an error if the line ends with an closing curly brace }
    - Don’t show an error if the line contains if or else
    - Call that method in your main method on the file gates.js.

### Testing

- Write unit tests for the map methods.
- Use JUnit to write a test for the linter.
- You’ll need to create a JS file that will test each of these things!

    -  Test the linter on a file that contains no errors.
    -  Test the linter on a file that contains one error.
    -  Test the linter on a file that contains few errors.
    -  Test the linter on a file that contains many errors.
    -  Test the linter on an empty file.