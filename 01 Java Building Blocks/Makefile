#
# Template makeile for java
#

#
# period '.' is not allowed, because this has a recerved meaning. TODO and that is?
run: Classes.class my.jar
	java -cp my.jar test.Classes

Classes.class: Classes.java
	javac -d . Classes.java 

my.jar: Classes.class
	jar cf $@ test
