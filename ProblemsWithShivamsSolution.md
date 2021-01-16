#Problems with Shivam's OOP Solution

###Problems In the Current Solution:
- The `Point.java` file does not have any behaviour.
- Fields should be declared as `final`, so that they can't be changed or tampered with later.
- There is no need for getters and setters in the solution.
- Getters and Setters should not be used in the code since they can break abstraction.
- Apart from using getters and setters, the code is similar to that of a procedural code.
- Unnecessary use of `static` methods. Static methods break encapsulation.`["Static is Evil when used unnecessarily"]`

###To be Refactored:
- Getting rid of Typo`{"Postive"-->"Positive"}` to maintain code hygiene (Broken Window Principle)
- `DistanceAndDirection.java` file to be removed.
- `DistanceAndDirectionTest.java` file to be renamed as `PointTest.java`
- Optimise the imports used and remove use of `Assertions` package each time which is code duplication.