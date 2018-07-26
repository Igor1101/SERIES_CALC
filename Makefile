MAINDIR = $(PWD)
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC)  $(JFLAGS) $*.java
	$(JC)  $(JFLAGS) series/*.java
	$(JC)  $(JFLAGS) mathutil/*.java

CLASSES = *.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) $(shell find ./ -name *.class)
		
run:
	java -ea main
