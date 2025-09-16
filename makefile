save:
	git add *
	git commit *
	git push origin main

runMerge: MergeSort.class
	java MergeSort

MergeSort.class: MergeSort.java
	javac MergeSort.java
