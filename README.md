# ArrayIndexOutOfBoundsException Bug in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The `bug.java` file contains code that attempts to access an array element outside of its valid index range, leading to this exception. The `bugSolution.java` file shows how to correct the error.

**Bug:**
The bug is in the `main` method. It creates an integer array of size 5 and then attempts to access the element at index 5.  Since arrays are 0-indexed, this causes an `ArrayIndexOutOfBoundsException`. 

**Solution:**
The solution involves carefully checking array indices before accessing them to ensure they are within the bounds of the array (0 to length-1).