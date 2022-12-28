package CHAPTER_1;

public class Main {
    //1.1 VARIABLES

    //1.2 DATA TYPES
    //~System-defined data types: int,float,char,double,bool,etc
    //~user defined data types
    //~Derived data types
    int MAX = +2147483647;// ANYTHING GREATER GIVES ERROR
    int MIN = -2147483648;// ANYTHING LOWER GIVES ERROR
    float NUMBER = 2.43f;
    char LETTER = 'A';
    double DECIMAL = 2.45;
    boolean myBOOL = true; //FALSE

    // Sample program to define Class, Object and Method
    class ValueStore //Class definition with default access
    {
        int Rate; // Variables with standard data types
        int Qty;

        void AssignData(int A, int B) // method definition
        {
            Rate = A; // Assigning the values
            Qty = B;
        }

        int ComputeValue() // Another method to compute value
        {
            int value; // variable definition
            value = Rate * Qty;
            return (value); // Returning the value
        }
    }


    //1.3 DATA STRUCTURES
    //: is a particular way of storing and organizing data in a computer so that it can be used efficiently
    //~Linear data structures: stored in a linear method: ex linked list, stacks, queues
    //~Non linear data structures: not store in a linear method: ex Trees, graphs, etc

    //1.4 ABSTRACT DATA TYPES
    //~Declaration of data
    //~Declaration of operations


    //1.5 WHAT IS AN ALGORITHM
    //Judge algorithm in two ways
    //~Correctness
    //~Efficiency

    //1.6 WHY THE ANALYSIS OF ALGORITHMS?
    //Algorithm analysis help us to determine which algorithm is most efficient in terms of time and space complexity

    //1.7 GOAL OF THE ANALYSIS OF ALGORITHMS
    //Compare algorithms(or solutions) mainly in terms of running time but also in terms of other factors
    //ex memory, developer effort, etc
    //analysis of algorithms is the determination of the amount of time and space resources required to execute it

    //1.8 WHAT IS RUNNING TIME ANALYSIS?
    //~Size of an array
    //~polynomial degree
    //~number of elements in a matrix
    //~number of bits in the binary representation of the input
    //~Vertices and edges in a graph

    //1.9 HOW TO COMPARE ALGORITHMS





}