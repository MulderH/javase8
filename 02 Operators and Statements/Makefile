#
# Template makeile for java
#

#
# period '.' is not allowed, because this has a recerved meaning. TODO and that is?
run: Java_Operators_and_Statements.class my.jar
	java -cp my.jar cursus.oca.se.Java_Operators_and_Statements

Java_Operators_and_Statements.class: Java_Operators_and_Statements.java
	javac -d . Java_Operators_and_Statements.java

my.jar: Java_Operators_and_Statements.class
	jar cf $@ cursus
