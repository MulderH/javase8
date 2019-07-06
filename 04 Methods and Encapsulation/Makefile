#
# Template makeile for java
#

#
# period '.' is not allowed, because this has a recerved meaning. TODO and that is?
run: Java_Core_API.class my.jar
	java -cp my.jar cursus.oca.se.Java_Core_API

Java_Core_API.class: Java_Core_API.java
	javac -d . Java_Core_API.java

my.jar: Java_Core_API.class
	jar cf $@ cursus
