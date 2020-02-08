all: Insertion.java Merge.java QSort.java Time.java RandomNumbers.java getRandoms.java generateInput runSorts WriteFile.java
	javac *.java
	./generateInput
clean:
	rm -rf Insertion.class Merge.class QSort.class Time.class RandomNumbers.class getRandoms.class WriteFile.class
	rm -rf data/random/*
	rm -rf data/sorted/*
	rm -rf data/reverse/*

