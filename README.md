# Programming-Language

This project was developed as part of the Interpretation and Compilation of Languages course. 
It consists of a programming language with an Interpreter and a Compiler. It has the following operations/expressions:

* Arithmetic
* Relational
* Logical
* Conditionals
* Loops
* Sequence of operations
* Type checking
* Print results
* Variable definition
* Variable assigning
* References/Pointers (like C/C++)

The "TestFile.txt" is the file where we pass the expressions to the compiler. You can add any file to write the expressions but you must specify it when you run the program on the command line. The file must be on the project's root.

To run it, enter the **src/** folder and run on the command line:

* To run the Interpreter: **java Main I**
* To run the Compiler: **java Main C filename** where filename is the name of file (.txt) where you pass the expressions (your code) to be compiled.

So if we want to run the compiler where the **TestFile.txt** file has the source code, we run: **java Main C TestFile.txt**

The **abstract syntax** of the language is as follows:

**T** -> Admitted Types
*	**int** 
*	**bool** 
*	**ref** T

**EE** -> Expressions
* EE **;** EE | EE **:=** EE
* ***num*** | ***id*** | ***bool***
* **def** (**id :** T **=** EE)+ **in** EE **end** | **new** EE | **!** EE
* **if** EE **then** EE **else** EE **end**
* **if** EE **then** EE **end**
* **while** EE **do** EE **end**
* EE **binop** EE | **unop** EE

**Arithmetic operations** (on integer values)

*	EE **+** EE 
*	EE **-** EE 
*	EE * EE
* 	EE **/** EE 
*	EE **%** EE 
* 	**-** EE
*	**(** EE **)**

**Relational operations**

* 	EE **==** EE 
* 	EE **>** EE 
*	EE **<** EE 
* 	EE **<=** EE 
* 	EE **>=** EE

**Logical operations** (on boolean values)

*	EE **&&** EE
*	EE **||** EE
*	**!** EE

Some examples of code written in this programming language:

A simpler program:

	def x: int = 1 in 
		print x+x 
	end

A more complex program:

	def m: ref int = new 10 one: int = 1 in 
		while !m>one do
			println !m ;
			if !m % 2 == 0 then
				m := !m / 2
			else
				m := 3*!m + 1
			end
		end
	end
