#SaqCustomerAPI

This program works by accepting args and first determing if they match any of the valid inputs.
If 'list' it will print a list of all the names & age of the ArrayList through an iterator.
If 'save fname lname age' it will then determine if the user is under the age of 18 or not.
If user is under 18 a message will be displayed saying you are under 18 and input wont be saved to ArrayList.
If user is over 18 they will successfully be added to the ArrayList shown by a message and the whole ArrayList will  be iterated through and printed.

Of course, for all arguments exception handling is put into place to ensure accurate inputs and accurate messages are displayed for any caught.

The program first checks if there is an exact match for the [ list ] arg since that is a specific word.
If list is not matched it then goes through the [ Save name name age ] section of the code which will catch any exceptions if that is the case.

The ArrayList can easily be replaced for a text file to maintain data and iterate through for a better future build.

Tests are conducted to catch any exceptions and should all pass.

The rest of the tests check if when args are inputed. If they successfully reach the end of the code where 
the age of input is >=18 or list all is printed then a boolean will be marked as true.

If the test reaches the end but the user is under 18 than a false boolean will be returned, this is done for test purposes.

