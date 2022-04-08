Chapter 7 : Design principles 

1. OCP : open for extension and close for modification 
2. DRY : code duplication, will help to maintain codebase in future
3. SRP : One object will have one responsibility. 
4. LSP : (Liskov's substitution properties) 
    -> Delegation, aggregation and composition are three tools which can be used in place of LSP wothout violating the LSP.

// Can use delegation to hand over responsibility to other class.
// When want to use other class's functionality but not using inheritance
// Two ways to implements : 
    feature (when lot of independent code) or use case (a particular flow) (for lot of connected code)

Chapter 8 : Test cases and Implementation

Contractual programming
-> contract between users and developers 

Defensive programming 
-> When developers don't know how user is going to use particular feature
-> Importance of unit testing

Chpater 9: 



Chapter 10 : 
1. Features list 
    - Figuring out what app is suppose to do at high level
2. Use case diagram 
    - Including all the actors and all
3. Breaking up the problem
    - Different modules 
    - order of modules to tackle
4. Individual requirements of each module and how they fir into big picture
5. Domain Analysis 
    - commanalities and differences to e encapuslated
6. details about classes and modules 
7. Implementation on your modules 
8. delivery 

