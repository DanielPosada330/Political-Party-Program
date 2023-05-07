# Political-Party-Program
Java survey program that asks the user a set of questions to best determine their political affiliation.
The program does this by assigning points to each question and tallying the total amount to determine which party
the user most aligns with.
## Motivation
The reason for creating this program was to further my skills in Java programming. This program utilizes iterating through 2d arrays, try/catch exception handling,
file creating and writing, conditional statements, etc.
## Language
The program was written entirely in Java.
## Build status
Currently the survey is full functional, however there is room for improvement. I am currently working on adding a GUI to move from command line programs,
as well as attempt to make the code cleaner by separting certain portions into different files to enhance code readability.
##Pseudocode
Below is the following pseudocode that I outlined prior to coding the program out:

   Import various classes needed
   
   main class
    Create 2d array of questions and answers
    
    Create text files for each of the 4 political parties
    
    Create variables for each of the 4 political parties
    
    PRINT Welcome message
    
      Create for-loop to iterate through 1st dimension of array (questions)
        array[0][i]
        Create foor-loop to iterate through 2nd dimension of array (answers)
          array[1][i]
          Conditional statement if democrat
           write questions and response to democrat file
          else if republican
           write questions and response to republican file
          else if independent
           write questions and response to independent file
          else if other
           write questions and response to other file
           
      Ask user the party they personally think they align with
      
      Create variable holding max variable between the 4 variables
      
      if else statement for each of the parties if they are max
