save:
	git add *
	git commit *
	git push origin main

runMerge: MergeSort.class
	java MergeSort

MergeSort.class:
	javac MergeSort
