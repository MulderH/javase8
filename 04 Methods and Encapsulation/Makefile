#
# Template makeile for java
#

#
# period '.' is not allowed, because this has a recerved meaning. TODO and that is?
run: Java_lambda.class my.jar
	java -cp my.jar cursus.oca.se.Java_lambda

Java_lambda.class: Java_lambda.java
	javac -d . Java_lambda.java

my.jar: Java_lambda.class
	jar cf $@ cursus
