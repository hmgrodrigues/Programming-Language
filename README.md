# Programming-Language

This project was developed as part of the Interpretation and Compilation of Languages course. 
It consists of a programming language with an Interpreter and a Compiler. It has the following operations/expressions:

* Arithmetic
* Relational
* Logical
* Variable definition
* Conditionals
* Loops
* Sequence of operations
* Type checking
* Print results
* Store values in memory
* References (Pointers)

The "TestFile.txt" is the file where we pass the expressions to the compiler. You can add any file to write the expressions but you need to specify it when you run the program on the command line.

To run it, enter the src folder and run on the command line:

* To run the Interpreter: **java Main I**
* To run the Compiler: **java Main C filename**, where filename is the name of file (.txt) where you pass the expressions (your code) to be compiled.

The **abstract syntax** of the language is as follows:

**EE** -> 

* EE ; EE | EE := EE
* **num** | **id** | **bool**
* **def** (**id** = EE)+ **in** EE **end** | **new** EE | **!**EE
* **if** EE **then** EE **else** EE **end**
* **while** EE **do** EE **end**
* EE **binop** EE | **unop** EE

**Arithmetic operations** (on integer values)

*	EE+EE 
*	EE-EE 
*	EE*EE
* 	EE/EE 
*	EE%EE 
* 	-EE
*	(EE)

**Relational operations**

* 	EE==EE 
* 	EE>EE 
*	EE<EE 
* 	EE<=EE 
* 	EE>=EE

**Logical operations** (on boolean values)

*	EE && EE
*	EE || EE
*	!EE