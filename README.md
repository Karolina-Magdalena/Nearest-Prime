# Nearest-Prime

java.io.BufferedReader class:
a buffer is a region in memory where input from the terminal is stored 
until needed by the program. If we want to perform buffered input on 
the System.in stream we would pass the System.in object into the constructor:


BufferedReader input = new BufferedReader (new InputStreamReader (System.in));


Once we have created a BufferedReader we can use its method readLine() to read 
one line of characters at a time from the keyboard and store it as a String object.


String inputString = input.readLine();

Reading an integer: One way to read an integer is to read the input as 
a String and then use the method parseInt() of the wrapper class Integer 
to convert the String to an integer.


int num = Integer.parseInt ( inputString );


Java PrintWriter println(int i) Method

The println(int i) method of Java PrintWriter class prints an integer value 
and terminates the current line by writing line separator string. 
This method behaves as it first invokes print(int) and then println().

PrintWriter pw = new PrintWriter(System.out);  
int i=10;  
pw.println(i);  
